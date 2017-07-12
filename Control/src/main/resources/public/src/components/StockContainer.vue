<template>
    <div id="rightContent">
        <div class="bordered" id="topContent">
            <stock-info :stock="stock" :oldStock="oldStock" @update-stock="setStockData"></stock-info>
        </div>
        <div class="bordered" id="bottomContent">
            <stock-chart :stock="stock"></stock-chart>
        </div>
    </div>
</template>

<script>
    import StockInfo from './StockInfo.vue'
    import StockChart from './StockChart.vue'
    import Stomp from 'webstomp-client'
    import Sockjs from 'sockjs-client'

    export default{
        name: 'stock-container',
        data() {
            return {
                stock: {
                    data: {},
                    meta: {}
                },
                oldStock: {
                    data: {},
                    meta: {}
                }
            }
        },
        created() {
            //TODO this is created with first entry to graph, bug
            let id = this.$route.params.id;
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
                    this.setStockData(response.data);
                }).catch(function (error) {
                    console.log(error);
                });
            },
            getStockById(id){
                this.$http.get('http://localhost:8080/data/stocks/' + id).then(function (response) {
                    this.setStockMeta(response.data);
                }).catch(function (error) {
                    console.log(error);
                });
            },
            updateStockBinaryData(response){
                this.setStockData(JSON.parse(response.body));
            },
            setStockMeta(meta){
                this.$set(this.oldStock, 'meta', meta);
                this.$set(this.stock, 'meta', meta);
            },
            setStockData(data){
                this.$set(this.oldStock, 'data', this.stock.data);
                this.$set(this.stock, 'data', data);
            }
        },
        watch: {
            '$route' (to, from){
                /*this.getStock(to.params.id);
                 console.log('from');
                 console.log(from);
                 console.log('to');
                 console.log(to);*/
            }
        }
        /*, beforeRouteUpdate (to, from, next) {
         /!*console.log('from');
         console.log(from);
         console.log('to');
         console.log(to);
         next();
         console.log(this.stock);*!/
         }*/
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