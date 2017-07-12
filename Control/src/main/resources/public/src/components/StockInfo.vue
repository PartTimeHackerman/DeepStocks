<template>
    <div>
        <div class="stockTitle">
            <h1>{{stock.meta.name}}</h1>
        </div>
        <h2 align="center" :style="isOpen.style">{{isOpen.text}}</h2>
        <div class="stockTableContainer" align="center">
            <table class="stockInfoTable">
                <tr>
                    <td>Symbol: </td>
                    <td>{{stock.data.symbol}}</td>
                    <td>Market: </td>
                    <td>{{stock.data.marketDisplayName}}</td>
                </tr>
                <tr>
                    <td>Spot: </td>
                    <transition :name="onchange(stock.data.spot, oldStock.data.spot)" mode="out-in">
                        <td :key="stock.data.spot + new Date().getTime()">
                            {{stock.data.spot}} {{stock.data.quotedCurrencySymbol}}
                        </td>
                    </transition>
                    <td>Submarket: </td>
                    <td>{{stock.data.submarketDisplayName}}</td>
                </tr>
                <tr>
                    <td>Spot time: </td>
                    <transition><!--:name="onchange(stock.data.spotTime, oldStock.data.spotTime)" mode="out-in"-->
                        <td :key="stock.data.spotTime + new Date().getTime()">{{spotTime}}</td>
                    </transition>
                    <td>Exchange name: </td>
                    <td>{{stock.data.exchangeName}}</td>
                </tr>
                <tr>
                    <td class="pip">Pip:
                        <span class="tooltiptext">Minimum fluctuation amount</span>
                    </td>
                    <transition><!--:name="onchange(stock.data.pip, oldStock.data.pip)" mode="out-in">-->
                        <td :key="stock.data.pip + new Date().getTime()">{{stock.data.pip}}</td>
                    </transition>
                    <td>Type: </td>
                    <td>{{stock.data.symbolType}}</td>
                </tr>
            </table>
        </div>
    </div>
</template>

<script>
    //import {EventBus} from '../main.js'
    import Moment from 'moment'

    export default {
        name: 'stock-info',
        props: ['stock', 'oldStock'],
        data(){
            return {
                subId: {}
            }
        },
        created () {
            /*this.$on('showStock', id => {
             this.getStock(id);
             });*/
        },
        activated(){
            let id = this.$route.params.id;
            this.subId = this.$store.state.stomp.stomp.subscribe('/data/stocks/' + id, (response) => {
                this.$emit("update-stock", JSON.parse(response.body));
            });
        },
        deactivated(){
            this.$store.state.stomp.stomp.unsubscribe(this.subId);
        },
        methods: {
            onchange(newVal, oldVal){
                if (newVal === undefined || oldVal === undefined)
                    return '';

                if (newVal > oldVal) {
                    return 'onchange-up';
                }
                else if (newVal < oldVal) {
                    return 'onchange-down';
                }
                else {
                    return 'onchange';
                }
            }
        },
        computed: {
            spotTime (){
                return Moment(+this.stock.data.spotTime * 1000).format("DD-MM-YYYY, hh:mm A");
            },
            isOpen(){
                var isOpen = this.stock.data.exchangeIsOpen === 1;
                return {
                    style: {
                        color: isOpen ? 'green' : 'red',
                        align: 'center',
                        marginTop: 0
                    },
                    text: isOpen ? 'OPEN' : 'CLOSED'
                }
            }
        }
    }
</script>

<style>

    table {
        table-layout: fixed;
    }

    td {
        max-width: 100%;
        padding: 15px;
        text-align: left;
        vertical-align: middle;
        font-weight: 300;
        font-size: 20px;
        border-bottom: solid 1px rgba(255, 255, 255, 0.1);
    }

    /* Tooltip container */
    .pip {
        position: relative;
        display: inline-block;
    }

    /* Tooltip text */
    .pip .tooltiptext {
        visibility: hidden;
        width: 140px;
        background-color: black;
        opacity: .8;
        color: white;
        text-align: center;
        padding: 4px 0;
        border-radius: 6px;
        font-size: 12px;
        line-height: 95%;
        /* Position the tooltip text - see examples below! */
        position: absolute;
        z-index: 1;
        margin-top: 10px;
    }

    /* Show the tooltip text when you mouse over the tooltip container */
    .pip:hover .tooltiptext {
        visibility: visible;
    }

    .pip .tooltiptext::after {
        content: " ";
        position: absolute;
        bottom: 96%; /* At the top of the tooltip */
        right: 90%;
        margin-left: -5px;
        border-width: 5px;
        border-style: solid;
        border-color: transparent transparent black transparent;
    }

    .onchange-enter-active, .onchange-up-enter-active, .onchange-down-enter-active {
        transition: color 2s, font-weight .1s, transform .3s cubic-bezier(1.000, -0.500, 0.000, 1.500);
    }

    .onchange-enter, .onchange-leave-to {
        color: #0000ff;
        font-weight: bold;
        /*transform: scale(1.01) translate(1%, 0);*/
    }

    .onchange-up-enter, .onchange-leave-to {
        color: #00ff00;
        font-weight: bold;
        /*transform: scale(1.01) translate(1%, 0);*/
    }

    .onchange-down-enter, .onchange-leave-to {
        color: #ff0000;
        font-weight: bold;
        /*transform: scale(1.01) translate(1%, 0);*/
    }
</style>