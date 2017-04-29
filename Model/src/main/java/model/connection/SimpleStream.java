package model.connection;

import io.reactivex.Flowable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import org.reactivestreams.Subscriber;

import java.util.HashMap;
import java.util.Map;

public abstract class SimpleStream<T> {
	
	private final PublishProcessor<T> subject = PublishProcessor.create();
	private final ConnectableFlowable<T> stream = subject.publish();
	private final Map<Subscriber<T>, Predicate<T>> subscribersMap = new HashMap<>();
	
	public SimpleStream() {
		stream.connect();
	}
	
	public void subscribe(Subscriber<T> subscriber) {
		subscribe(subscriber, p -> true);
	}
	
	public void subscribe(Subscriber<T> subscriber, java.util.function.Predicate<T> filter) {
		subscribersMap.put(subscriber, filter::test);
		stream
				.filter(filter::test)
				.onBackpressureBuffer()
				.subscribe(subscriber);
	}
	
	public void unsubscribe(DisposableSubscriber<T> subscriber) {
		subscribersMap.remove(subscriber);
		subscriber.dispose();
	}
	
	public void submit(T t) {
		subject.onNext(t);
	}
	
	public Flowable<T> getFlowable() {
		return stream;
	}
	
	protected Map<Subscriber<T>, Predicate<T>> getSubscribersMap() {
		return subscribersMap;
	}
}
