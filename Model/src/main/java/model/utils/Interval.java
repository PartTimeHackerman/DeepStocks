package model.utils;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class Interval {
	
	
	public static Disposable doEvery(Long peroid, TimeUnit timeUnit, Runnable runnable) {
		return Flowable.interval(0, peroid, timeUnit)
				.publish()
				.refCount()
				.subscribe(l -> runnable.run());
	}
}
