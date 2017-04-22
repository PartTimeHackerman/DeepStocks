export default {
    state: {
        stocks: [],
        activeStock: {}
    },
    mutations: {
        addStock: ({stocks}, stock) = > {
        if (
!stocks.includes(stock)
)
{
    stocks.push(stock);
}
else
{
    console.error("Stock already in stocks ", stock.name);
}

},
setActiveStock: (state, stock) =
>
{
    state.activeStock = stock;
}
},
getters: {
    getStocks: state =
>
    {
        return state.stocks;
    }
,
    getActiveStock: state =
>
    {
        return state.activeStock
    }
}
}
;