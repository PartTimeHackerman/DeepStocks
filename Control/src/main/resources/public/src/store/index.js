import Vue from 'vue'
import Vuex from 'vuex'

import stocks from './Stocks.js'
Vue.use(Vuex);

export default new Vuex.Store({
    modules: {
        stocks: stocks
    }
});
