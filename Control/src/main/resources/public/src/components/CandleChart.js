export default class Chart {

    constructor(elementId, lineDataPoints, candlesDataPoints) {
        this.properties(lineDataPoints, candlesDataPoints);
        this.makeChart(elementId);
    };

    properties(lineDataPoints, candlesDataPoints) {
        this.lineDataPoints = [];
        this.candleDataPoints = [];
        this.config = {
            title: {
                text: "Customized Candle Stick Chart",
                fontFamily: "times new roman"
            },
            zoomEnabled: true,
            exportEnabled: true,
            axisY: {
                includeZero: false,
                title: "Prices",
                prefix: "$ "
            },
            axisX: {
                interval: 2,
                intervalType: "month",
                valueFormatString: "MMM-YY",
                labelAngle: -45
            },
            data: [
                {
                    type: "line",
                    color: "blue",
                    dataPoints: lineDataPoints
                },
                {
                    type: "candlestick",
                    risingColor: "green",
                    color: "black",
                    dataPoints: candlesDataPoints
                }
            ]
        };
    };

    makeChart(elementId) {
        this.chart = new CanvasJS.Chart(elementId, this.config);
    };


    render() {
        this.chart.render();
    };

    addToLine(data) {
        if (this.chart.options.data[0].dataPoints.includes(data))
            return;
        this.chart.options.data[0].dataPoints.push(data);
    };

    addToCandles(data) {
        if (this.chart.options.data[1].dataPoints.includes(data))
            return;
        this.chart.options.data[1].dataPoints.push(data);
    };

    addToAll(data) {
        var lineData = {x: data.x, y: data.y[0]};
        //this.addToLine(lineData);
        this.addToCandles(data);
    };

}
