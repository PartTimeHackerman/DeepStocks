import Vue from 'vue'
import VueResource from 'vue-resource-2'
import MomentLib from 'moment'

Vue.use(VueResource);

export const EventBus = new Vue();
export const Moment = MomentLib;

import StocksList from './StocksList.vue'
import StockContainer from './StockContainer.vue'


window.App = new Vue({
    el: '#app',
    components: {
        'stocks-list': StocksList,
        'stock-container': StockContainer
    }
});



/*Vue.component('stocks-list', StocksList);
Vue.component('stock-info', StockInfo);
Vue.component('stock-chart', StockChart);*/
