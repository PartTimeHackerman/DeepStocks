package model.connection.consumer;

import model.utils.MainLogger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public interface Consumer<T> extends Subscriber<T> {
	
	void consume(T t);
	
	@Override
	default void onNext(T t) {
		consume(t);
	}
	
	@Override
	default void onSubscribe(Subscription s) {
		MainLogger.log(this).debug("{} subscribed", this);
		s.request(Long.MAX_VALUE);
	}
	
	@Override
	default void onError(Throwable t) {
		MainLogger.log(this).error(t);
	}
	
	@Override
	default void onComplete() {
		MainLogger.log(this).error("{} completed", this);
	}
}
