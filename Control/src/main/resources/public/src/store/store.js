import Vue from "vue";
import Vuex from "vuex";

import Stocks from "./Stocks.js";
import Stomp from "./Stomp.js";

Vue.use(Vuex);

export default new Vuex.Store({
    modules: {
        stocks: Stocks,
        stomp: {
            state: {
                stomp: new Stomp('guest')
            }
        }
    }
});
