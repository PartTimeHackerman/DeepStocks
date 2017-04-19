<template>
    <div id="stocksContentContainer">
        <stocks-list></stocks-list>
        <transition name="fade" mode="out-in">
            <keep-alive>
                <router-view :key="$route.path"></router-view>
            </keep-alive>
        </transition>

    </div>
</template>

<script>
    import StocksList from './StocksList.vue'


    export default {
        components: {
            'stocks-list': StocksList
        }
    };
</script>

<style>
    #stocksContentContainer {
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
    }
</style>