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
                    <td>{{stock.data.spot}} {{stock.data.quotedCurrencySymbol}}</td>
                    <td>Submarket: </td>
                    <td>{{stock.data.submarketDisplayName}}</td>
                </tr>
                <tr>
                    <td>Spot time: </td>
                    <td>{{spotTime}}</td>
                    <td>Exchange name: </td>
                    <td>{{stock.data.exchangeName}}</td>
                </tr>
                <tr>
                    <td class="pip">Pip:
                        <span class="tooltiptext">Minimum fluctuation amount</span>
                    </td>
                    <td>{{stock.data.pip}}</td>
                    <td>Type: </td>
                    <td>{{stock.data.symbolType}}</td>
                </tr>


            </table>
        </div>
    </div>
</template>

<script>
    import {EventBus, Moment} from 'main.js'

    export default {
        name: 'stock-info',
        props : ['stock'],
        data(){
            return {
            }
        },
        created () {
            /*this.$on('showStock', id => {
                this.getStock(id);
            });*/
        },
        methods: {

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
</style>