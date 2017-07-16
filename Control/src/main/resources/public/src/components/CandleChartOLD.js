import ZingChart from "zingchart";
import $ from "jquery";

var config = {
    "type": "stock",
    "title": {
        "text": "Candlestick Chart"
    },
    "crosshair-x": {
        "plot-label": {
            "text": "%kv<br>Open: $%open<br>High: $%high<br>Low: $%low<br>Close: $%close",
            "decimals": 2,
            "transform": {
                "type": "date",
                "all": "%mm-%dd-%Y, %h:%i"
            },
            //"placement": "node-top",
            //"offset-y": -15,
            "multiple": true,
            "padding": "10%",
            "border-radius": "5px"
        },
        "scale-label": {
            "visible": true,
            "background-color": "gray",
            "border-radius": "3px"
        }
    },
    "crosshair-y": {
        "type": "multiple", //"single" (default) or "multiple"
        "scale-label": {
            "visible": true,
            "background-color": "gray",
            "border-radius": "3px"
        }
    },
    "scale-x": {
        //"min-value":1420232400000,
        "step": "minute",
        "transform": {
            "type": "date",
            "all": "%mm-%dd-%Y, %h:%i"
        },
        "max-items": 10,
        "item": {
            "font-size": 10,
            "angle": -10
        }
    },
    "scale-y": {
        //step: 'decimal',
        //"values": "'min-value':'max-value':.01",
        /*"format": "%v",
         "guide": {
         "line-style": "solid"
         },
         "item": {
         "font-size": 10
         },*/
        "minor-ticks": 1,
        "minor-guide": {
            "line-color": "#010101",
            "line-width": 1,
            "line-style": "solid",
            "alpha": 1
        }
    },
    "plot": {
        "aspect": "candlestick",
        "tooltip": {
            "visible": false
        },
        "trend-up": {
            "background-color": "#00ff00",
            "line-color": "black",
            "border-color": "green"
        },
        "trend-down": {
            "background-color": "#fe0000",
            "line-color": "black",
            "border-color": "red"
        }
    },
    "series": [
        {
            "values": []
        }
    ]
};

function Chart() {
    this.config = $.extend({}, config);
    this.values = this.config.series[0].values;
    this.render = function () {
        ZingChart.render({
            id: 'stockChart',
            data: this.config,
            height: "100%",
            width: "100%"
        });
    }
}

module.exports = Chart;