package model.connection;

import io.reactivex.Observable;
import io.reactivex.subscribers.DisposableSubscriber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import java.util.function.Predicate;

import static org.junit.Assert.assertTrue;

public class PacketStreamTest {
	
	static ReceivedPacketsStream stream;
	static Subscriber<Packet> subscriber;
	static Predicate<Packet> filter;
	
	@BeforeClass
	public static void setUp() throws Exception {
		stream = new ReceivedPacketsStream(null, null, null);
		subscriber = new Subscriber<Packet>() {
			@Override
			public void onComplete() {
				System.out.println("done");
			}
			
			@Override
			public void onError(Throwable e) {
				System.out.println("error");
			}
			
			@Override
			public void onSubscribe(Subscription s) {
			
			}
			
			@Override
			public void onNext(Packet integer) {
				System.out.println(integer.getOptional());
			}
		};
		
		filter = integer -> (Integer)integer.getOptional() % 2 == 0;
		
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		
	}
	
	@Test
	public void subscribe() throws Exception {
		
		stream.subscribe(subscriber);
		assertTrue(stream.getSubscribersMap().size()==1);
	}
	
	@Test
	public void subscribe1() throws Exception {
		stream.subscribe(subscriber, filter);
		assertTrue(stream.getSubscribersMap().size()==1);
	}
	
	@Test
	public void submit() throws Exception {
		Observable.range(0, 10).subscribe(i -> stream.receive(new Packet(null, i)));
	}
	
	@Test
	public void unsubscribe() throws Exception {
		stream.unsubscribe((DisposableSubscriber<Packet>) subscriber);
		assertTrue(stream.getSubscribersMap().size()==0);
	}
	
}