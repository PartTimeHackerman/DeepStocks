<template>
    <div id="graphContent">
        <div id="options" class="bordered"></div>
        <graph-container></graph-container>
    </div>
</template>

<script>

    import GraphContainer from './GraphContainer.vue'
    export default {
        created(){
            console.log("Graph created");
        },
        components: {
            'graph-container': GraphContainer
        }
    }
</script>

<style>
    #graphContent {
        display: flex;
        flex: 1;
        flex-direction: column;
    }

    #options {
        display: flex;
        overflow: visible;
        flex: 1;
    }
</style>