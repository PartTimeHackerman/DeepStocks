package model.utils;

import java.util.ArrayList;
import java.util.List;

public class ShutdownHook {
	
	private static final Runtime runtime = Runtime.getRuntime();
	private static final List<Runnable> runnables = new ArrayList<>();
	private static final Thread thread = new Thread(ShutdownHook::runAll);
	
	static {
		runtime.addShutdownHook(thread);
	}
	
	public static void add(Runnable runnable) {
		runnables.add(runnable);
	}
	
	private static void runAll() {
		runnables.forEach(Runnable::run);
	}
	
}
