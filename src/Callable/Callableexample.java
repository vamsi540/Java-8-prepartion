package Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public interface Callableexample {

	public static void main(String[] args) throws Exception {

		Callable<String> t = () -> {
			Thread.sleep(1000);
			return "Task Completed";
		};

		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> f = es.submit(t);

		String ressult = f.get();
		System.out.println(ressult);
		es.shutdown();
	}

}

//newSingleThreadExecutor(): Creates a thread pool with one thread.

//submit(task): Submits the Callable task to the executor for execution.
//Future<String>: Represents the result of the asynchronous computation.

//You can use future.get() to retrieve the result once it's ready.
//future.get(): Waits for the task to complete and returns the result.
