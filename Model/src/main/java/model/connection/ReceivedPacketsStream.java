package model.connection;

import io.reactivex.subscribers.DisposableSubscriber;
import model.connection.validation.RequestValidator;
import org.reactivestreams.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import model.connection.packetHandler.PacketHandler;
import model.utils.MainLogger;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.function.Predicate;


@Component
public class ReceivedPacketsStream extends SimpleStream<Packet> {
	
	@Autowired
	private Collection<PacketHandler> handlers;
	
	private final RequestValidator requestValidator;
	
	@Autowired
	public ReceivedPacketsStream(RequestValidator requestValidator) {
		super();
		this.requestValidator = requestValidator;
	}
	
	@PostConstruct
	public void addHandlers(){
		handlers.forEach(this::addHandler);
	}
	
	public ReceivedPacketsStream addHandler(PacketHandler handler) {
		Subscriber<Packet> subscriber = new DisposableSubscriber<Packet>() {
			@Override
			public void onComplete() {
				MainLogger.log(this).info("{} COMPLETED", this);
			}
			
			@Override
			public void onError(Throwable e) {
				MainLogger.log(this).info("{} {}", this, e);
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
	
	public void receive(Packet packet) {
		requestValidator.setPacketReceived(packet);
		super.submit(packet);
	}
	
}
