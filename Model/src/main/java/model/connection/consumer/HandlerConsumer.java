package model.connection.consumer;

public interface HandlerConsumer<T> {
	
	void consume(T t);
}
