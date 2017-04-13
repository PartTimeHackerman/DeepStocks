var path = require('path');
var webpack = require('webpack')
var ROOT = path.resolve(__dirname, 'src/main/resources/public');
var SRC = path.resolve(ROOT, 'src');
var DIST = path.resolve(ROOT, 'dist');

module.exports = {
    devtool: 'source-map',
    entry: {
        app: SRC + '/main.js'
    },
    output: {
        path: DIST,
        filename: 'bundle.js',
        publicPath: '/dist/'
    },
    devServer:{
        contentBase: ROOT
    },
    resolve: {
        modules: [
            path.resolve(ROOT, 'src'),
            path.resolve(ROOT, 'css'),
            "node_modules"
        ],
        extensions: ['.js', '.jsx', '.vue'],
        alias: {
            vue: 'vue/dist/vue.js'
        }
    },
    module: {
        loaders: [
            {test: /\.jsx?$/, loaders: ['babel-loader?presets[]=es2015&presets[]=react'], include: SRC},
            {test: /\.js$/, loader: 'babel-loader?presets[]=es2015', exclude: /node_modules/},
            {test: /\.vue$/, loader: 'vue-loader'},
            {test: /\.css$/, loader: 'style-loader!css-loader'},
            {test: /\.less$/, loader: 'style!css!less'},

            // Needed for the css-loader when [bootstrap-webpack](https://github.com/bline/bootstrap-webpack)
            // loads bootstrap's css.
            {test: /\.html$/, loader: 'raw'},
            {test: /\.(woff|woff2)(\?v=\d+\.\d+\.\d+)?$/, loader: 'url?limit=10000&mimetype=application/font-woff'},
            {test: /\.ttf(\?v=\d+\.\d+\.\d+)?$/, loader: 'url?limit=10000&mimetype=application/octet-stream'},
            {test: /\.eot(\?v=\d+\.\d+\.\d+)?$/, loader: 'file'},
            {test: /\.svg(\?v=\d+\.\d+\.\d+)?$/, loader: 'url?limit=10000&mimetype=image/svg+xml'}
        ]
    }
};
