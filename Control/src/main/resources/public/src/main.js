/*global.jQuery = require('jquery');
 var $ = global.jQuery;
 window.$ = $;*/


import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource-2'


Vue.use(VueResource);
Vue.use(VueRouter);

export const EventBus = new Vue();

import App from './components/App.vue'

const router = new VueRouter({
    //mode: 'history',
    routes: App.routes
});

window.App = new Vue({
    el: '#app',
    router,
    template: '<app></app>',
    components:{
        'app': App
    }
});


/*Vue.component('stocks-list', StocksList);
 Vue.component('stock-info', StockInfo);
 Vue.component('stock-chart', StockChart);*/
