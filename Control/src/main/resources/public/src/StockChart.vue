<template>
    <div id="felxContainer">
        <div class="stockChartContainer" >
            <div id="stockChart"></div>
        </div>
        <div class="chartRangeContainer">
            <div id="rangeSlider"></div>
        </div>
    </div>
</template>

<script>
    import {EventBus, Moment} from 'main.js'
    import Chart from './CandleChart.js'

    let chart = new Chart();

    google.charts.load('current', {'packages': ['corechart']});
    //google.charts.setOnLoadCallback(drawChart);
    var chartVue;

    /* function drawChart() {
     var stockCandles = chartVue.candlesToChartData();
     var data = google.visualization.arrayToDataTable(stockCandles, true);
     /!*var chartWidth = $("#stockChart").parent().width()*2;
     var chartHeight = $("#stockChart").parent().height()-20;*!/
     var options = {
     legend: 'none',
     backgroundColor: 'transparent',
     fontName: 'Exo',
     focusTarget: 'category',
     bar: {groupWidth: '50%'},
     aggregationTarget: 'category',
     selectionMode: 'multiple',
     candlestick: {
     fallingColor: {strokeWidth: 0, fill: '#c90000', stroke: '#000000'},
     risingColor: {strokeWidth: 0, fill: '#00cb00', stroke: '#000000'},
     hollowIsRising: false
     },
     tooltip: {
     textStyle: {
     color: '#000000',
     fontSize: 11,
     bold: false
     },
     showColorCode: false
     },
     chartArea: {
     left: 50,
     top: 10,
     width: '100%',
     height: '80%'
     },
     hAxis: {
     showTextEvery: 20,
     textStyle: {
     fontSize: 11
     },
     baselineColor: '#4f5060',
     gridlines: {
     color: '#807b80',
     count: 20
     }
     },
     vAxis: {
     format: 'currency',
     baselineColor: '#403f3f',
     gridlines: {
     color: '#7f7f7f',
     count: 20
     },
     minorGridlines: {
     count: 1,
     color: '#ececec'
     },
     textStyle: {
     fontSize: 11,
     bold: true
     }
     },
     animation: {
     duration: 500,
     easing: 'out',
     startup: true
     }
     };

     var chart = new google.visualization.CandlestickChart(document.getElementById('stockChart'));

     chart.draw(data, options);
     }*/

    function drawChart() {
        chart.config.series[0].values = [chartVue.candlesToChartData2()[0]];
        chart.render();
    }

    $(window).resize(function () {
        drawChart();
    });

    /*$("#rangeSlider").ionRangeSlider({
     type: "double",
     min: 0,
     max: 100,
     from: 30,
     to: 70,
     min_interval: 20
     });*/

    export default {
        name: 'stock-chart',
        props: ['stock'],
        data(){
            return {
                candles: []
            }
        },
        created() {
            chartVue = this;
//            this.$on('showStock',() => {
//                this.getStockCandles(1487343060, 1487349000, 0);
//            });

        },
        watch: {
            'stock.meta.id': function () {
                if (this.stock.meta.id !== undefined) {
                    this.candles = [];
                    this.getStockCandles(1487343060, 1487349000, 0);
                }
            }
        }
        ,
        methods: {
            getStockCandles(start, end, granularity){
                this.$http.get('http://localhost:8080/data/candles/' + this.stock.meta.id + '?start=' + start + '&end=' + end + '&size=100').then(function (response) {
                    response.data.forEach(candle => this.candles.push(candle));
                    drawChart();
                }).catch(function (error) {
                    console.log(error);
                });
            },
            candlesToChartData(){
                return this.candles.map(candle => [Moment(+candle.epoch * 1000).format("DD-MM-YYYY, hh:mm A"), candle.low, candle.open, candle.close, candle.high]);
            },
            candlesToChartData2(){
                return this.candles.map(candle => [candle.epoch * 1000, [candle.open, candle.close, candle.high, candle.low]]);
            }
        }
    }
</script>

<style>

    #felxContainer {
        width: 100%;
        height: 100%;
        display: flex;
        flex-direction: column;
        flex: 1;

        border: 2px lightskyblue solid;
    }

    .stockChartContainer {
        margin: 20px;
        display: flex;
        flex-direction: row;
        flex: 3;

        border: 2px greenyellow solid;
    }

    .chartRangeContainer {
        margin: 0 20px 20px;
        display: flex;
        flex-direction: row;
        flex: 1;

        border: 2px #3fffda solid;
    }

    #stockChart {
    }

</style>