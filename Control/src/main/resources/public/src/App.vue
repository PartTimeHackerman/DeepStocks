<template>
    <div id="app">
        <div class="menuContainer">
            <ul class="menu-list w-list-unstyled">
                <li class="menu-item">
                    <h1 class="menu-text">Stocks</h1>
                </li>
                <li class="menu-item">
                    <h1 class="menu-text">Graph</h1>
                </li>
            </ul>
        </div>
        <router-view></router-view>
    </div>
</template>

<script>

    export default {
        name: 'app',
        //router: router
    }
</script>

<style>
    .menuContainer {
        height: 100%;
        margin-right: 5px;
        padding-right: 30px;
        border-style: solid;
        border-width: 0px 10px 1px 0px;
        border-color: #000 #535353 #000 #000;
        background-image: -webkit-linear-gradient(270deg, #3d3d3d, #3d3d3d);
        background-image: linear-gradient(180deg, #3d3d3d, #3d3d3d);
        box-shadow: 0 0 16px 0 #000;
    }

    .menu-list {
        display: flex;
        -ms-flex-pack: end;
        font-style: normal;
        flex-direction: column;
        padding-left: 0px;
    }

    .menu-item {
        display: flex;
        -webkit-box-pack: end;
        -webkit-justify-content: flex-end;
        -ms-flex-pack: end;
        justify-content: flex-end;
        border-bottom: 3px solid #bebebe;
    }

    .menu-text {
        font-style: normal;
        color: white;
        padding-left: 10%;
    }
</style>