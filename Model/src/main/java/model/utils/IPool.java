package model.utils;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;

public interface IPool {
	//Send one lambda
	void sendTask(Runnable lambda, boolean wait);
	
	//Send n lambdas
	void sendTask(Runnable lambda, boolean wait, Integer times);
	
	//Send one call
	<R> R sendTask(Callable<R> callable, boolean wait);
	
	//Send n calls
	<R> R sendTask(Callable<R> callable, boolean wait, Integer times);
	
	<R> List<R> forEach(List<R> list, Function<R, R> consumer);
	
	//Send calls list
	<R> List<R> sendTasks(List<Callable<R>> callables);
	
	ThreadPoolExecutor getExecutor();
	
	void setThreads(Integer threads);
	
	Integer getThreads();
	
	Integer getActiveThreads();
}
