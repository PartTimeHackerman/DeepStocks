<template>
    <div id="rightContent">
        <div class="bordered" id="topContent">
            <stock-info :stock="stock"></stock-info>
        </div>
        <div class="bordered" id="bottomContent">
            <stock-chart :stock="stock"></stock-chart>
        </div>
    </div>
</template>

<script>
    import StockInfo from './StockInfo.vue'
    import StockChart from './StockChart.vue'
    //import * as Main from '../main.js'

    export default{
        name: 'stock-container',
        data() {
            return {
                stock: {
                    data: {},
                    meta: {}
                }
            }
        },
        created() {
            let id = this.$route.params.id;

            //TODO this is created with first entry to graph, bug
            console.log("Created stock", id);
            this.getStock(id);
        },
        components: {
            'stock-info': StockInfo,
            'stock-chart': StockChart
        },
        methods: {
            getStock(id){
                this.getStockById(id);
                this.getStockBinaryDataById(id);
            },
            getStockBinaryDataById(id){
                this.$http.get('http://localhost:8080/data/binaryDatas/' + id).then(function (response) {
                    this.$set(this.stock, 'data', response.data);
                }).catch(function (error) {
                    console.log(error);
                });
            },
            getStockById(id){
                this.$http.get('http://localhost:8080/data/stocks/' + id).then(function (response) {
                    this.$set(this.stock, 'meta', response.data);
                }).catch(function (error) {
                    console.log(error);
                });
            }
        },
        watch:{
            '$route' (to, from){
                //this.getStock(to.params.id);
                //console.log(to);
            }
        }
    }
</script>

<style>
    #rightContent {
        display: flex;
        overflow: visible;
        flex-direction: column;
        flex: 1;
        /*flex-grow: 0;*/
        /*flex-shrink: 0;*/
    }

    #bottomContent {
        display: flex;
        height: auto;
        margin-top: 2px;
        flex-direction: column;
        align-items: center;
        flex: 1;
    }
</style>