/*global.jQuery = require('jquery');
 var $ = global.jQuery;
 window.$ = $;*/

import Vue from "vue";
import VueRouter from "vue-router";
import VueResource from "vue-resource";
import App from "./components/App.vue";
import Stomp from "webstomp-client";
import Sockjs from "sockjs-client";


Vue.use(VueResource);
Vue.use(VueRouter);

export const EventBus = new Vue();

const router = new VueRouter({
    //mode: 'history',
    routes: App.routes
});

window.App = new Vue({
    el: '#app',
    router,
    template: '<app></app>',
    components: {
        'app': App
    }
});

let stomp = null;

function connect() {
    const socket = new Sockjs('http://localhost:8080/endpoint');
    stomp = Stomp.over(socket);
    stomp.connect({'user': 'guest'}, function (frame) {

        console.log('Connected: ' + frame);
        stomp.subscribe('/data/stocks' + '/-365638368', function (data) {
            console.log(JSON.parse(data.body));
        });
        stomp.subscribe('/user/queue/message', function (data) {
            console.log(data);
        });
        stomp.send('/app/endpoint/message', '123');
    });
}

//connect();


/*Vue.component('stocks-list', StocksList);
 Vue.component('stock-info', StockInfo);
 Vue.component('stock-chart', StockChart);*/
