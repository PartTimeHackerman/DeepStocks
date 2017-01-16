package data.binaryAPI;

import data.PacketStream;
import data.Packet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

import static org.junit.Assert.assertTrue;

public class PacketStreamTest {
	
	static PacketStream stream;
	
	static Subscriber<Packet> subscriber;
	
	static Func1<Packet, Boolean> filter;
	
	@BeforeClass
	public static void setUp() throws Exception {
		stream = new PacketStream();
		subscriber = new Subscriber<Packet>() {
			@Override
			public void onCompleted() {
				System.out.println("done");
			}
			
			@Override
			public void onError(Throwable e) {
				System.out.println("error");
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
		assertTrue(stream.getSubscriberMap().size()==1);
	}
	
	@Test
	public void subscribe1() throws Exception {
		stream.subscribe(subscriber, filter);
		assertTrue(stream.getSubscriberMap().size()==1);
	}
	
	@Test
	public void submit() throws Exception {
		Observable.range(0,10).subscribe(i -> stream.submit(new Packet(null, i)));
	}
	
	@Test
	public void unsubscribe() throws Exception {
		stream.unsubscribe(subscriber);
		assertTrue(stream.getSubscriberMap().size()==0);
	}
	
}