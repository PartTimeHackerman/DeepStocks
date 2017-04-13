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
            Main.EventBus.$on('getStock', id => {
                this.getStock(id);
                this.$emit('showStock');
            });
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
        }
    }
</script>