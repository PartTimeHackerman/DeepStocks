package model.utils;

import java.util.Optional;
import java.util.concurrent.*;

public class Timeout {
	
	private static final ExecutorService executor = Executors.newCachedThreadPool();
	
	public static <T> Optional<T> after(Callable<T> callable, Long timeout) {
		return after(callable, timeout, TimeUnit.MILLISECONDS);
	}
	
	public static <T> Optional<T> after(Callable<T> callable, Long timeout, TimeUnit timeUnit) {
		Future<T> future = executor.submit(callable);
		Optional<T> result = Optional.empty();
		try {
			result = Optional.of(future.get(timeout, timeUnit));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			MainLogger.log(Timeout.class).warn(e);
		}
		return result;
	}
	
	public static <T> Optional<T> before(Callable<T> callable, Long timeout) {
		return before(callable, timeout, TimeUnit.MILLISECONDS);
	}
	
	public static <T> Optional<T> before(Callable<T> callable, Long timeout, TimeUnit timeUnit) {
		Future<T> future = executor.submit(() -> {
			try {
				Thread.sleep(timeUnit.toMillis(timeout));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return callable.call();
		});
		
		Optional<T> result = Optional.empty();
		try {
			result = Optional.of(future.get());
		} catch (InterruptedException | ExecutionException e) {
			MainLogger.log(Timeout.class).warn(e);
		}
		return result;
	}
}
