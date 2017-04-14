<template>
    <div id="felxContainer">
        <div class="stockChartContainer">
            <div id="stockChart"></div>
        </div>
        <div class="chartRangeContainer">
            <div id="rangeSelector"></div>
        </div>
    </div>
</template>

<script>
    import {EventBus, Moment} from 'main.js'
    import Chart from './CandleChart.js'
    //import $ from 'jquery'

    //console.log($);

    let chart = new Chart();

    var rangeSelector = {
        theme: 'metrodark',
        width: 750,
        height: 15,
        min: new Date(new Date() - 1000 * 60 * 60 * 100),
        max: new Date(new Date().getTime()),
        majorTicksInterval: {
            months: 1
        },
        minorTicksInterval: {
            days: 1
        },
        labelsFormat: 'dd-MM-yyyy hh:mm tt',
        markersFormat: 'dd-MM-yyyy hh:mm tt'
    };

    var mountSelector = function () {
        $("#rangeSelector").jqxRangeSelector(rangeSelector);
    };

    var mountRangeScroll = function () {
        $('#rangeSelector').bind('mousewheel', function (e) {
            var range = $("#rangeSelector").jqxRangeSelector("getRange");
            var minEpoch = rangeSelector.min.getTime();
            var maxEpoch = rangeSelector.max.getTime();
            var offsetEpoch = Math.round((maxEpoch - minEpoch) * .1);
            if (e.originalEvent.wheelDelta / 120 > 0) {
                rangeSelector.min = new Date(minEpoch + offsetEpoch);
                rangeSelector.max = new Date(maxEpoch - offsetEpoch);
            } else {
                rangeSelector.min = new Date(minEpoch - offsetEpoch);
                rangeSelector.max = (maxEpoch + offsetEpoch) >= new Date().getTime() ? rangeSelector.max : new Date(maxEpoch + offsetEpoch);
            }
            $("#rangeSelector").jqxRangeSelector(rangeSelector);
            $("#rangeSelector").jqxRangeSelector("setRange",
                range.from.getTime() <= rangeSelector.min.getTime() ? rangeSelector.min : range.from ,
                range.to.getTime() >= rangeSelector.max.getTime() ? rangeSelector.max : range.to);
            //$('#rangeSelector').jqxRangeSelector('render');
        });
    }


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
        let chartCandles = chartVue.candlesToChartData2();
        let minValue = Math.min.apply(Math, chartCandles.map(candle => candle[1][2]));
        let maxValue = Math.max.apply(Math, chartCandles.map(candle => candle[1][1]));
        minValue -= minValue * 0.0005;
        maxValue += maxValue * 0.0005;
        chart.config["scale-y"]["values"] = minValue + ":" + maxValue + ":" + 0.1;
        chart.config.series[0].values = chartCandles;
        //chart.render();
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
        mounted(){
            mountSelector();
            mountRangeScroll();
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
                    if (this.candles.length > 0)
                        drawChart();
                }).catch(function (error) {
                    console.log(error);
                });
            },
            candlesToChartData(){
                return this.candles.map(candle => [Moment(+candle.epoch * 1000).format("DD-MM-YYYY, hh:mm A"), candle.low, candle.open, candle.close, candle.high]);
            },
            candlesToChartData2(){
                return this.candles.map(candle => [+candle.epoch * 1000, [candle.open, candle.high, candle.low, candle.close]]);
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
        width: 100%;
        height: 100%;
        z-index: 4;
    }

</style>