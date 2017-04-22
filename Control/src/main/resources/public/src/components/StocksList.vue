<template>
    <div id="stockListContainer" class="bordered">
        <input class="searchBar" type="text" v-model="searchKeyword" placeholder="Search" onfocus=""/>
        <ul class="stocksList">
            <li class="stockListItem grow" @click.stop.prevent="selectStock(stock)" v-for="stock in filteredStocks">
                {{stock.name}}



            </li>
        </ul>
    </div>
</template>

<script>
    //import {EventBus} from 'main.js'

    export default {
        name: 'stocks-list',
        data(){
            return {
                searchKeyword: ''
            }
        },
        created () {
            this.fetchStocks();
        },
        methods: {
            fetchStocks(){
                this.$http.get('http://localhost:8080/data/stocks?size=1000').then(function (response) {
                    response.data._embedded.stocks
                        .forEach(stock => this.$store.commit('addStock', stock));
                    this.selectStock(this.stocks[0]);
                }).catch(function (error) {
                    console.log(error);
                });
            },
            selectStock(stock){
                console.log("Selecting ", stock.name);
                this.$store.commit('setActiveStock', stock);
                this.$router.push('/stocks/' + stock.id);
            }
        },
        computed: {
            filteredStocks(){
                return this.stocks.filter((stock) => {
                    return stock.name.toLowerCase().includes(this.searchKeyword.toLocaleLowerCase());
                });
            },
            stocks(){
                return this.$store.getters.getStocks;
            },
            activeStock(){
                return this.$store.getters.getActiveStock;
            }
        },
        activated(){
            if (Object.keys(this.activeStock).length !== 0)
                this.selectStock(this.activeStock);
        }
    }
</script>

<style>

    #stockListContainer {
        margin: 5px 0px 5px 5px;
        display: flex;
        flex-direction: column;
        flex: 0;
    }

    .searchBar {
        border: none;
        /* width: 100%; */
        font-size: 130%;
        outline-width: 0;
        padding: 5% 5% 5% 30px;
        display: flex;
        margin: 4px;
        background: linear-gradient(to bottom, rgba(0, 0, 0, 0) 50%, rgba(0, 0, 0, 0.03) 100%);
    }

    .stocksList {
        height: 100%;
        margin-top: 10px;
        padding-bottom: 10px;
        padding-left: 30px;
        overflow-x: hidden;
        overflow-y: scroll;
        display: flex;
        flex-direction: column;

    }

    .shadow {
        height: 100%;
        box-shadow: inset 0px 40px 18px -20px rgb(244, 251, 253);
    }

    .stocksList::-webkit-scrollbar {
        width: 0;
    }

    .shadow:after {
        position: absolute;
        top: 0;
        bottom: 0;
        left: -15px;
        right: -15px;
        box-shadow: inset 0px 40px 18px -20px rgb(0, 7, 253);
    }

    .stockListItem {
        user-select: none;
        padding: 5% 0 5%;
        list-style-type: none;
        font-size: 150%;
    }

    .grow {
        transition: all .2s ease-in-out;
    }

    .grow:hover {
        text-shadow: -3px 3px 3px rgba(1, 1, 1, .15);
        cursor: pointer;
        font-weight: bold;
        transform: scale(1.1) translate(5%, 0);
    }

</style>