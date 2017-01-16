package data;

import data.packetHandlers.PacketHandler;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observables.ConnectableObservable;
import rx.subjects.PublishSubject;
import rx.subjects.Subject;
import utils.MainLogger;

import java.util.HashMap;
import java.util.Map;

public class PacketStream {
	
	private Subject<Packet, Packet> subject = PublishSubject.create();
	
	private ConnectableObservable<Packet> stream;
	
	private Map<Subscriber<Packet>, Func1<Packet, Boolean>> subscriberMap = new HashMap<>();
	
	public PacketStream() {
		stream = subject.publish();
		stream.connect();
	}
	
	public PacketStream addHandler(PacketHandler handler){
		Subscriber<Packet> subscriber = new Subscriber<Packet>() {
			@Override
			public void onCompleted() {
				System.out.println(this + "completed");
			}
			
			@Override
			public void onError(Throwable e) {
				System.out.println(this + " " + e);
			}
			
			@Override
			public void onNext(Packet packet) {
				MainLogger.log().debug("Handling: {}", packet);
				handler.handle(packet);
			}
		};
		
		Func1<Packet, Boolean> filter = handler.getFilter();
		if(filter==null)
			subscribe(subscriber);
		else
			subscribe(subscriber,  filter);
		return this;
	}
	
	public void subscribe(Subscriber<Packet> subscriber){
		subscribe(subscriber, p -> true);
	}
	
	public void subscribe(Subscriber<Packet> subscriber, Func1<Packet, Boolean> filter){
		subscriberMap.put(subscriber, filter);
		stream
				.filter(filter)
				.subscribe(subscriber);
	}
	
	public void submit(Packet obj){
		subject.onNext(obj);
	}
	
	public void unsubscribe(Subscriber<Packet> subscriber){
		subscriberMap.remove(subscriber);
		subscriber.unsubscribe();
	}
	
	public Map<Subscriber<Packet>, Func1<Packet, Boolean>> getSubscriberMap() {
		return subscriberMap;
	}
}
