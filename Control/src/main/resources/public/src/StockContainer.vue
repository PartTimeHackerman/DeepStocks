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
    import * as Main from './main.js'

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
            this.getStock(id);
            console.log("created StockContainer");
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
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        overflow: visible;
        -webkit-box-orient: vertical;
        -webkit-box-direction: normal;
        -webkit-flex-direction: column;
        -ms-flex-direction: column;
        flex-direction: column;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
        /*flex-grow: 0;*/
        /*flex-shrink: 0;*/
    }

    #bottomContent {

    }

    #bottomContent.bordered {
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        height: auto;
        margin-top: 2px;
        -webkit-box-orient: vertical;
        -webkit-box-direction: normal;
        -webkit-flex-direction: column;
        -ms-flex-direction: column;
        flex-direction: column;
        -webkit-box-align: center;
        -webkit-align-items: center;
        -ms-flex-align: center;
        align-items: center;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
    }
</style>