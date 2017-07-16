DeepStocks
===
[![codebeat badge](https://codebeat.co/badges/a7606e11-8238-493e-83b8-146a0e10544e)](https://codebeat.co/projects/github-com-parttimehackerman-deepstocks-master)

If You ever wanted to trade stocks, You've seen it's not that's easy. There's so many stocks in which You can invest in, so many relations between them, between news and actions that corporations make.
Every action or new product corporation make influence whole stocks exchange.
Literally everything correlate with each other.
There's so much data that's no one can handle and proccess, except computers and neural networks.
That's why I made this project, let's computers handle that's what peoples just aren't able to.
##### TL;DR: Bots can trade stocks better than anyone.


## Project is divided into three modules:
- [Model]: 'M' in 'MVC'. Consist of whole buisness logic.

    Made with Spring (Boot, Data), Hibernate, [ProxySrcaper]. Using PostgreSQL DB.
- [Control]: 'C' and 'V' in 'MVC'. All Spring Controllers and main Application are here.
It's also contains the clinet view, and by that I mean the bunch of JavaScript frameworks.

    Made with Node.js, Webpack, Vue.js, ES6.
- [AI]: The most exciting part of the project, it's supposed to contains several deep neural networks models (1st for predicting stocks prices, 2nd for calculating the risk of the trade, 3rd for interpreting stocks news, etc.).

    Made with Tensorflow and Python.

    [Model]: <https://github.com/PartTimeHackerman/DeepStocks/tree/master/Model>
    [Control]: <https://github.com/PartTimeHackerman/DeepStocks/tree/master/Control>
    [AI]: <https://github.com/PartTimeHackerman/DeepStocks/tree/master/AI>
    [ProxySrcaper]: <https://github.com/PartTimeHackerman/ProxyScraper>