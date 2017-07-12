import Highcharts from 'highstock-release'

export default class Chart {

    constructor(elementId) {
        this.properties();

        Highcharts.setOptions(theme);
        this.makeChart(elementId);

        this.lineDataPoints = this.chart.series[0];
        this.candleDataPoints = this.chart.series[1];
    };

    properties() {
        this.config = {
            chart: {
                zoomType: 'x'
            },
            /*title: {
             text: 'AAPL Stock Price'
             },*/
            scrollbar: {
                enabled: true
            },
            rangeSelector: {
                buttons: [{
                    type: 'hour',
                    count: 1,
                    text: '1h'
                }, {
                    type: 'day',
                    count: 1,
                    text: '1D'
                }, {
                    type: 'month',
                    count: 1,
                    text: '1M'
                }, {
                    type: 'all',
                    count: 1,
                    text: 'All'
                }],
                selected: 3,
                inputEnabled: true
            },
            series: [{
                type: 'line',
                //name: 'AAPL Stock Price',
                data: [],
                lineWidth: 1,
                allowPointSelect: false,
                enableMouseTracking: false,
                tooltip: {
                    visible: false
                }
                /*dataGrouping: {
                 units: [
                 [
                 'week', // unit name
                 [1] // allowed multiples
                 ], [
                 'month',
                 [1, 2, 3, 4, 6]
                 ]
                 ]
                 }*/
            }, {
                type: 'candlestick',
                //name: 'AAPL Stock Price',
                data: [],
                lineWidth: 1,
                tooltip: {
                    valueDecimals: 2
                }
                /*dataGrouping: {
                 units: [
                 [
                 'week', // unit name
                 [1] // allowed multiples
                 ], [
                 'month',
                 [1, 2, 3, 4, 6]
                 ]
                 ]
                 }*/
            }]
        }
    };

    makeChart(elementId) {
        this.chart = Highcharts.stockChart(elementId, this.config);
    };


    render() {
        this.chart.redraw();
    };

    addToLine(dataArr) {
        for (let i = 0; i < dataArr.length; i++) {
            let data = dataArr[i];
            if (!this.lineDataPoints.points.includes(data))
                this.lineDataPoints.addPoint(data, false);
        }
        this.lineDataPoints.points.sort(this.compare);

    };

    addToCandles(dataArr) {
        for (var i = 0; i < dataArr.length; i++) {
            var data = dataArr[i];
            if (!this.candleDataPoints.points.includes(data))
                this.candleDataPoints.addPoint(data, false);
        }
        this.candleDataPoints.points.sort(this.compare);
    };

    addToAll(dataArr) {
        let lineDataArr = dataArr.map(data => [data.x.getTime(), data.y[0]]);
        let candlesDataArr = dataArr.map(data => [data.x.getTime(), data.y[0], data.y[1], data.y[2], data.y[3]]);

        this.addToLine(lineDataArr);
        this.addToCandles(candlesDataArr);
    };

    compare(a, b) {
        if (a[0] < b[0])
            return -1;
        if (a[0] > b[0])
            return 1;
        return 0;
    }

}

let theme = {
    colors: ['#000000', '#f7a35c', '#90ee7e', '#2c3644', '#527171', '#ff0066', '#eeaaee', '#55BF3B', '#DF5353', '#7798BF', '#aaeeee'],
    chart: {
        backgroundColor: null,
        style: {
            fontFamily: 'Exo, sans-serif'
        }
    },
    title: {
        style: {
            fontSize: '16px',
            fontWeight: 'bold',
            textTransform: 'uppercase'
        }
    },
    tooltip: {
        borderWidth: 0,
        backgroundColor: 'rgba(219,219,216,0.8)',
        shadow: false
    },
    legend: {
        itemStyle: {
            fontWeight: 'bold',
            fontSize: '13px'
        }
    },
    xAxis: {
        gridLineWidth: 1,
        labels: {
            style: {
                fontSize: '12px'
            }
        }
    },
    yAxis: {
        minorTickInterval: 'auto',
        title: {
            style: {
                textTransform: 'uppercase'
            }
        },
        labels: {
            style: {
                fontSize: '12px'
            }
        }
    },
    plotOptions: {
        line: {
            states: {
                hover: {
                    enabled: false,
                    lineWidth: 1
                }
            }
        },
        candlestick: {
            lineColor: '#808080',
            color: '#ff0000',
            upColor: '#00ff21',
            states: {
                hover: {
                    lineWidth: 1
                }
            }
        }
    },


    // General
    background2: '#F0F0EA'

};