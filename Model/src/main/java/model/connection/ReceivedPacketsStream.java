package model.connection;

import io.reactivex.subscribers.DisposableSubscriber;
import org.reactivestreams.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.stereotype.Component;
import model.connection.packetHandler.PacketHandler;
import model.utils.MainLogger;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Vector;
import java.util.function.Predicate;


@Component
public class ReceivedPacketsStream extends SimpleStream<Packet> {
	
	@Autowired
	private Collection<PacketHandler> handlers;
	
	public ReceivedPacketsStream() {
		super();
	}
	
	@PostConstruct
	public void addHandlers(){
		
		handlers.forEach(this::addHandler);
	}
	
	public ReceivedPacketsStream addHandler(PacketHandler handler) {
		Subscriber<Packet> subscriber = new DisposableSubscriber<Packet>() {
			@Override
			public void onComplete() {
				MainLogger.log().info("{} COMPLETED", this);
			}
			
			@Override
			public void onError(Throwable e) {
				MainLogger.log().info("{} {}", this, e);
			}
			
			@Override
			public void onNext(Packet packet) {
				handler.handle(packet);
			}
		};
		
		Predicate<Packet> filter = handler.getFilter();
		subscribe(subscriber, filter);
		return this;
	}
	
	@Override
	public void submit(Packet o) {
		super.submit(o);
	}
	
}
