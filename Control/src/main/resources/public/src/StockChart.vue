<template>
    <div id="felxContainer">
        <div class="stockChartContainer">
            <div id="stockChart"></div>
        </div>
        <div class="chartRangeContainer">
            <input id="grain" type="text" v-model="grain">
            <div id="rangeSelector"></div>
        </div>
    </div>
</template>

<script>
    import {EventBus, Moment} from 'main.js'
    import Chart from './CandleChart.js'
    import Chart2 from './CandleChart2.js'
    //import $ from 'jquery'

    //console.log($);

    let chart = new Chart();

    var rangeSelector = {
        min: {},
        max: {}
    };

    var mountSelector = function () {
        $('#rangeSelector').dateRangeSlider({
            bounds: {min: new Date(2016, 1, 1), max: new Date()},
            defaultValues: {min: new Date(2016, 1, 1), max: new Date()},
            arrows: false,
            range: {min: 100000*60},
            scales: [{
                first: function (value) {
                    return value;
                },
                end: function (value) {
                    return value;
                },
                next: function (value) {
                    var next = new Date(value);
                    next.setMonth(next.getMonth() + 1);
                    return next;
                },
                label: function (value) {
                    return value.getMonth() + 1;
                },
                format: function (tickContainer, tickStart, tickEnd) {
                    tickContainer.addClass("myCustomClass");
                }
            }]
        });
    };

    var mountRangeScroll = function () {
        $('#rangeSelector').bind('mousewheel', function (e) {
            var bounds = $('#rangeSelector').dateRangeSlider("option", "bounds");
            var range = $('#rangeSelector').dateRangeSlider("values");

            var minBound = bounds.min.getTime();
            var maxBound = bounds.max.getTime();
            var minRange = range.min.getTime();
            var maxRange = range.max.getTime();

            var rangeZoomScale = ((maxRange - minRange) / (maxBound - minBound));
            rangeZoomScale = Math.min(.5, .1 / rangeZoomScale);
            var minOffset = Math.round(Math.max(minRange - minBound, 60000) * rangeZoomScale);
            var maxOffset = Math.round(Math.max(maxBound - maxRange, 60000) * rangeZoomScale);

            if (e.originalEvent.wheelDelta / 120 > 0) {
                rangeSelector.min = new Date(minBound + minOffset);
                rangeSelector.max = new Date(maxBound - maxOffset);
            } else {
                rangeSelector.min = (minBound + minOffset) <= new Date(2016, 1, 1).getTime() ? bounds.max : new Date(minBound - minOffset);
                rangeSelector.max = (maxBound + maxOffset) >= new Date().getTime() ? bounds.max : new Date(maxBound + maxOffset);
            }

            $('#rangeSelector').dateRangeSlider(
                "option",
                "bounds",
                {
                    min: rangeSelector.min,
                    max: rangeSelector.max
                });

        });
    };

    var getRangeVals = function(){
        return $('#rangeSelector').dateRangeSlider("values");
    };

    var setRangeVals = function(min, max){
        $('#rangeSelector').dateRangeSlider("values", min, max);
    };

    var granularity = 100;

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
                candles: [],
                grain: 100
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
                    var today = new Date();
                    var lastMonth = new Date();
                    lastMonth.setMonth(lastMonth.getMonth()-1);

                    $('#rangeSelector').bind("valuesChanged", function(e, data){
                        chartVue.getStockCandlesGrain(parseInt(data.values.min.getTime()/1000), parseInt(data.values.max.getTime()/1000), chartVue.grain);
                    });

                    setRangeVals(lastMonth.getTime(), today.getTime());
                }
            }
        }
        ,
        methods: {
            getStockCandles(start, end, size){
                this.$http.get('http://localhost:8080/data/candles/' + this.stock.meta.id + '?start=' + start + '&end=' + end + '&size='+ size).then(function (response) {
                    response.data.forEach(candle => this.candles.push(candle));
                    if (this.candles.length > 0)
                        drawChart();
                }).catch(function (error) {
                    console.log(error);
                });
            },
            getStockCandlesGrain(start, end, granularity){
                this.$http.get('http://localhost:8080/data/candles/' + this.stock.meta.id + '/granularity?granularity='+ granularity +'&start=' + start + '&end=' + end + '&size='+granularity).then(function (response) {
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
        display: block;
        flex-direction: row;
        flex: 1;
        padding: 0 20px 0;
        border: 2px #3fffda solid;
    }

    #stockChart {
        width: 100%;
        height: 100%;
        z-index: 4;
    }

    #rangeSelector {
        display: block;
    }

</style>