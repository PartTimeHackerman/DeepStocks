package model.utils;

import java.util.concurrent.TimeUnit;

public class Waiter {
	public static boolean wait(Long time, TimeUnit timeUnit) {
		try {
			Thread.sleep(timeUnit.toMillis(time));
		} catch (InterruptedException e) {
			return false;
		}
		return true;
	}
}
