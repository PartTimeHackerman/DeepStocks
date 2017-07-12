package model.utils;

import java.util.ArrayList;
import java.util.List;

public class ShutdownHook {
	
	private static Runtime runtime = Runtime.getRuntime();
	
	private static Thread thread = new Thread(ShutdownHook::runAll);
	
	private static List<Runnable> runnables = new ArrayList<>();
	
	static {
		runtime.addShutdownHook(thread);
	}
	
	public static void add(Runnable runnable){
		runnables.add(runnable);
	}
	
	private static void runAll(){
		runnables.forEach(Runnable::run);
	}
	
}
