<template>
    <div id="stocksContent">
        <stocks-list></stocks-list>
        <!--<transition name="fade" mode="in">-->
        <keep-alive>
            <router-view :key="$route.path"></router-view>
        </keep-alive>
        <!--</transition>-->
    </div>
</template>

<script>
    import StocksList from './StocksList.vue'
    import StockContainer from './StockContainer.vue'

    const routes = [
        {path: ':id', component: StockContainer},
        {path: 'undefined', component: {}}
    ];

    export default {
        routes,
        components: {
            'stocks-list': StocksList
        }
    };
</script>

<style>
    #stocksContent {
        display: flex;
        flex: 1;
    }
</style>