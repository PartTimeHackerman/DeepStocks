import CanvasJS from 'canvasjs'

var chart = new CanvasJS.Chart("chartContainer",
    {
        title:{
            text: "Customized Candle Stick Chart",
            fontFamily: "times new roman"
        },
        zoomEnabled: true,
        exportEnabled: true,
        axisY: {
            includeZero:false,
            title: "Prices",
            prefix: "$ "
        },
        axisX: {
            interval:2,
            intervalType: "month",
            valueFormatString: "MMM-YY",
            labelAngle: -45
        },
        data: [
            {
                type: "line",
                color: "blue",
                dataPoints: []
            },
            {
                type: "candlestick",
                risingColor: "green",
                color: "black",
                dataPoints: []
            }
        ]
    });

chart.render();
