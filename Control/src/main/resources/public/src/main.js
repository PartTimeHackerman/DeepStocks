/*global.jQuery = require('jquery');
 var $ = global.jQuery;
 window.$ = $;*/


import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource-2'
import MomentLib from 'moment'

Vue.use(VueResource);
Vue.use(VueRouter);

export const EventBus = new Vue();
export const Moment = MomentLib;

import App from './App.vue'
import StocksContentContainer from './StocksContentContainer.vue'
import StockContainer from './StockContainer.vue'

const routes = [
    {
        path: '/stocks', component: StocksContentContainer,
        children: [{path: ':id', component: StockContainer}]
    },
    {path: '', redirect: '/stocks'}
];

const router = new VueRouter({
    //mode: 'history',
    routes: routes
});

window.App = new Vue({
    el: '#app',
    router: router,
    template: '<app></app>',
    components:{
        'app': App
    }
});

/*Vue.component('stocks-list', StocksList);
 Vue.component('stock-info', StockInfo);
 Vue.component('stock-chart', StockChart);*/
