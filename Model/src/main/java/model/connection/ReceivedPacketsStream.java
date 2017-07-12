package model.connection;

import io.reactivex.subscribers.DisposableSubscriber;
import model.connection.packetsService.PacketsService;
import model.connection.packetsService.RequestValidator;
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
	
	private final PacketsService requestValidator;
	private final PacketsService packetsTimeoutResender;
	private final PacketsService sentPacketsContainer;
	
	@Autowired
	public ReceivedPacketsStream(PacketsService requestValidator, PacketsService packetsTimeoutResender, PacketsService sentPacketsContainer) {
		super();
		this.requestValidator = requestValidator;
		this.packetsTimeoutResender = packetsTimeoutResender;
		this.sentPacketsContainer = sentPacketsContainer;
	}
	
	@PostConstruct
	public void addHandlers() {
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
		if (packet.isWait()) {
			removeFromServices(packet);
			notifyMessage(packet);
		} else if (removeFromServices(packet)) {
			super.submit(packet);
		}
	}
	
	private boolean removeFromServices(Packet packet) {
		return (requestValidator.removePacket(packet) &
				packetsTimeoutResender.removePacket(packet) &
				sentPacketsContainer.removePacket(packet));
	}
	
	private void notifyMessage(Packet packet) {
		synchronized (packet) {
			packet.notify();
		}
	}
	
}
