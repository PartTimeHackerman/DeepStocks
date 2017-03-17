package model.connection;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class IdGenerator {
	
	private static AtomicLong atomicLong = new AtomicLong(0);
	
	public static Long getId(){
		return atomicLong.getAndAdd(1);
	}
	
	public static Integer getIdInteger(){
		return Math.toIntExact(atomicLong.getAndAdd(1));
	}
}
