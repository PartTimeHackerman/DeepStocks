import StompClient from 'webstomp-client'
import Sockjs from 'sockjs-client'


export default class Stomp {
    constructor(user) {
        this.user = user;
        this.endpoint = 'http://localhost:8080/endpoint';
        this.subscribtions = [];

        this.stomp = null;
        this.socket = null;
        this.isConnected = false;

        this.waitQueue = [];
        this.connect(this.user, this.endpoint);
    };

    connect(user, endpoint) {
        this.socket = new Sockjs(endpoint);
        this.socket.onopen = function() {
            console.log('open');
        };
        this.socket.onmessage = function(e) {
            console.log('message', e.data);
        };
        this.socket.onclose = function() {
            console.log('close');
        };

        this.stomp = StompClient.over(this.socket);
        this.stomp.connect({'user': user},
            connected => {
                console.log('Connected: ' + connected);
                this.waitQueue.forEach(sub => sub());
                this.isConnected = true;
            },
            error => console.log('Error: ' + error));
    };

    subscribe(destination, callback, headers) {
        const sub = () =>
            this.subscribtions.push(this.stomp.subscribe(destination, callback, headers));

        if (!this.isConnected)
            this.waitQueue.push(sub);
        else
            sub();
    };


    /*
     stomp.subscribe('/user/queue/message', function (epoch) {
     console.log(epoch);
     });
     stomp.subscribe('/data/stocks', function (epoch) {
     console.log(epoch);
     });
     stomp.send('/app/endpoint/message', '123');*/

}