package model;

import data.PacketStream;
import data.Request;
import utils.MainLogger;

public class Facade {
	
	private StocksLoader stocksLoader;
	
	private Request messageRequest;
	
	private PacketStream packetStream;
	
	public Facade(){
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			MainLogger.log().info("SHUTDOWN HOOK");
		}));
		
	}
	
}
