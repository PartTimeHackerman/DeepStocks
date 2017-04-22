<template>
    <div id="graphContainer" class="bordered">
        <div id="graph">
        </div>
    </div>
</template>

<script>
    import cytoscape from 'cytoscape'

    const graphConfig = {
        container: {},
        elements: [],
        style: cytoscape.stylesheet()
            .selector('node')
            .css({
                'content': 'data(label)',
                'text-valign': 'center',
                'color': 'white',
                'text-outline-width': 2,
                'background-color': '#999',
                'text-outline-color': '#999'
            })
            .selector('edge')
            .css({
                'curve-style': 'bezier',
                'target-arrow-shape': 'triangle',
                'target-arrow-color': '#ccc',
                'line-color': '#ccc',
                'width': 1
            })
            .selector(':selected')
            .css({
                'background-color': 'black',
                'line-color': 'black',
                'target-arrow-color': 'black',
                'source-arrow-color': 'black'
            })
            .selector('.faded')
            .css({
                'opacity': 0.25,
                'text-opacity': 0
            })
            .selector('.autorotate')
            .css({
                'edge-text-rotation': 'autorotate'
            })
            .selector('.multiline-manual')
            .css({
                'text-wrap': 'wrap'
            }),

        layout: {
            name: 'grid',
            rows: 16
        }
    };

    let graph;

    export default {
        name: 'graph-container',
        created(){
            this.stocks.forEach(stock => graphConfig.elements.push(this.toNode(stock)))
        },
        computed: {
            stocks() {
                return this.$store.getters.getStocks;
            }
        },
        methods: {
            toNode(stock){
                return {
                    group: 'nodes',
                    data: {
                        id: stock.id,
                        /*name: stock.name,
                         open: 1,
                         high: 2,
                         low: 3,
                         close: 4,*/
                        label: stock.name + '\n' +
                        'Open: ' + 1 + '\n' +
                        'High: ' + 2 + '\n' +
                        'Low: ' + 3 + '\n' +
                        'Close: ' + 4 + '\n'

                    },
                    classes: 'multiline-manual'
                }
            },
            toEdge(stock1, stock2){
                return {
                    group: 'edges',
                    id: stock1.id + stock2.id,
                    source: stock1.id, // the source node id (edge comes from this node)
                    target: stock2.id
                }
            }
        },
        mounted(){
            console.log("GraphContainer mounted");
            graphConfig.container = document.getElementById('graph');
            graph = cytoscape(graphConfig);
        }
    }

</script>

<style>

    #graphContainer {
        display: flex;
        overflow: visible;
        flex: 6;
    }

    #graph {
        height: 100%;
        width: 100%;
    }
</style>