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
    //import {EventBus, Moment} from 'main.js'
    import Chart from './HighCandleChart.js'
    //import VueRouter from 'vue-router'


    const rangeSelector = {
        min: {},
        max: {}
    };

    const mountSelector = function () {
        $('#rangeSelector').dateRangeSlider({
            bounds: {min: new Date(2016, 1, 1), max: new Date()},
            defaultValues: {min: new Date(2016, 1, 1), max: new Date()},
            arrows: false,
            range: {min: 100000 * 60},
            scales: [{
                first: function (value) {
                    return value;
                },
                end: function (value) {
                    return value;
                },
                next: function (value) {
                    const next = new Date(value);
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

    const mountRangeScroll = function () {
        $('#rangeSelector').bind('mousewheel', function (e) {
            const bounds = $('#rangeSelector').dateRangeSlider("option", "bounds");
            const range = $('#rangeSelector').dateRangeSlider("values");

            const minBound = bounds.min.getTime();
            const maxBound = bounds.max.getTime();
            const minRange = range.min.getTime();
            const maxRange = range.max.getTime();

            let rangeZoomScale = ((maxRange - minRange) / (maxBound - minBound));
            rangeZoomScale = Math.min(.5, .1 / rangeZoomScale);
            const minOffset = Math.round(Math.max(minRange - minBound, 60000) * rangeZoomScale);
            const maxOffset = Math.round(Math.max(maxBound - maxRange, 60000) * rangeZoomScale);

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

    const getRangeVals = function () {
        return $('#rangeSelector').dateRangeSlider("values");
    };

    const setRangeVals = function (min, max) {
        $('#rangeSelector').dateRangeSlider("values", min, max);
    };

    const granularity = 100;

    const pushIfDoesntExist = function (toArr, fromArray) {
        for (let i = 0; i < fromArray.length; i++) {
            const element = fromArray[i];
            pushElementIfDoesntExist(toArr, element);
        }
    };

    const pushElementIfDoesntExist = function (toArr, element) {
        if (!toArr.includes(element))
            toArr.push(element);
    };

    let chartVue;
    export default {
        name: 'stock-chart',
        props: ['stock'],
        data(){
            return {
                candles: [],
                grain: 100,
                chart: {},
                stockId: 0
            }
        },
        created() {
            chartVue = this;


        },
        mounted(){
            mountSelector();
            mountRangeScroll();

            this.chart = new Chart("stockChart");
            this.chart.render();

            this.stockId = this.$route.params.id;

            $('#rangeSelector').bind("valuesChanged", function (e, data) {
                chartVue.getStockCandlesGrain(parseInt(data.values.min.getTime() / 1000), parseInt(data.values.max.getTime() / 1000), chartVue.grain);
            });

            const today = new Date();
            const lastMonth = new Date();
            lastMonth.setMonth(lastMonth.getMonth() - 3);
            setRangeVals(lastMonth.getTime(), today.getTime());
        },
        watch: {
        },
        methods: {
            getStockCandles(start, end, size){
                this.$http.get('http://localhost:8080/data/candles/' + this.stockId + '?start=' + start + '&end=' + end + '&size=' + size).then(function (response) {
                    response.data.forEach(candle =>
                        pushElementIfDoesntExist(this.candles, candle));
                }).catch(function (error) {
                    console.log(error);
                });
            },
            getStockCandlesGrain(start, end, granularity){
                this.$http.get('http://localhost:8080/data/candles/' + this.stockId + '/granularity?granularity=' + granularity + '&start=' + start + '&end=' + end + '&size=' + granularity).then(function (response) {
                    let resopnseBody = response.data;
                    resopnseBody.forEach(candle =>
                        pushElementIfDoesntExist(this.candles, candle));
                    this.chart.addToAll(this.candlesDataPoints);
                    this.chart.render();
                }).catch(function (error) {
                    console.log(error);
                });
            },
            candlesToChartData(){
                return this.candles.map(candle => {
                    return {
                        x: new Date(+candle.epoch * 1000),
                        y: [candle.open, candle.high, candle.low, candle.close]
                    }
                });
            }
        },
        computed: {
            linesDataPoints(){
                return this.candles.map(candle => {
                    return {
                        x: new Date(+candle.epoch * 1000),
                        y: candle.open
                    }
                });
            },
            candlesDataPoints(){
                return this.candles.map(candle => {
                    return {
                        x: new Date(+candle.epoch * 1000),
                        y: [candle.open, candle.high, candle.low, candle.close]
                    }
                });
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

        /*border: 2px lightskyblue solid;*/
    }

    .stockChartContainer {
        margin: 20px;
        display: flex;
        flex-direction: row;
        flex: 3;

        /*border: 2px greenyellow solid;*/
    }

    .chartRangeContainer {
        margin: 0 20px 20px;
        display: block;
        flex-direction: row;
        flex: 1;
        padding: 0 20px 0;
        /*border: 2px #3fffda solid;*/
    }

    #stockChart {
        width: 100%;
        height: 100%;
        z-index: 4;
    }

    #rangeSelector {
        display: block;
    }

    .ui-rangeSlider-bar {
        background: rgba(255, 255, 255, 0.34);
        height: 24px;
        margin: 1px 0;
        -moz-border-radius: 4px;
        border-radius: 4px;
        cursor: move;
        cursor: grab;
        cursor: -moz-grab;
        -webkit-box-shadow: inset 0 2px 6px RGBA(0,0,0,0.5);
        -moz-box-shadow: inset 0 2px 6px RGBA(0,0,0,0.5);
        box-shadow: inset 0 2px 6px RGBA(0,0,0,0.5);
    }

    .ui-rangeSlider-container, .ui-rangeSlider-arrow {
        height: 25px;
        border-top: solid 1px #232a32;
        border-bottom: solid 1px #6a7179;
    }

</style>