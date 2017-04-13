<template>
    <div class="listContainer">
        <input class="searchBar" type="text" v-model="keyword" placeholder="Search"/>
        <div class="shadow">
            <ul class="stocksList">
                <li class="stockListItem grow" @click.stop.prevent="selectStock(stock.id)" v-for="stock in filteredStocks">
                    {{stock.name}}
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
    import {EventBus} from 'main.js'

    export default {
        name: 'stocks-list',
        data(){
            return {
                stocks: [],
                keyword: ''
            }
        },
        created () {
            this.fetchStocks();
        },
        methods: {
            fetchStocks(){
                this.$http.get('http://localhost:8080/data/stocks?size=1000').then(function (response) {
                    response.data._embedded.stocks
                        .forEach(stock => this.stocks.push(stock));
                    this.selectStock(this.stocks[0].id);
                }).catch(function (error) {
                    console.log(error);
                });
            },
            selectStock(id){
                EventBus.$emit('getStock', id);
            }
        },
        computed: {
            filteredStocks(){
                return this.stocks.filter((stock) => {
                    return stock.name.toLowerCase().includes(this.keyword.toLocaleLowerCase());
                });
            }
        }
    }
</script>

<style>

    .listContainer {
        /*display: flex;
        justify-content: center;
        flex-direction: column;
        margin-right: 0px;
        -webkit-box-flex: 0;
        -webkit-flex: 0 0 auto;
        -ms-flex: 0 0 auto;
        flex: 0 0 auto;*/
        height: 100%;
        position: relative;
        overflow: hidden;

    }

    .searchBar {
        border: none;
        background-color: rgba(1,1,1,.05);
        width: 100%;
        font-size: 130%;
        outline-width: 0;
        padding: 5% 5% 5% 30px;
    }

    .stocksList {
        position: absolute;
        height: 100%;
        margin-top: 10px;
        padding-bottom: 10px;
        padding-left: 30px;
        overflow-x: hidden;
        overflow-y: scroll;

    }

    .shadow{
        height: 100%;
        box-shadow: inset 0px 40px 18px -20px rgb(244, 251, 253);
    }

    .stocksList::-webkit-scrollbar{
        width: 0;
    }

    .shadow:after{
        position: absolute; top: 0; bottom: 0; left: -15px; right: -15px;
        box-shadow: inset 0px 40px 18px -20px rgb(0, 7, 253);
    }

    .stockListItem {
        user-select: none;
        padding: 0 0 10%;
        list-style-type: none;
        font-size: 150%;
    }

    .grow {
        transition: all .2s ease-in-out;
    }

    .grow:hover {
        text-shadow: -3px 3px 3px rgba(1, 1, 1,.15);
        cursor: pointer;
        font-weight: bold;
        transform: scale(1.1) translate(5%,0);
    }

</style>