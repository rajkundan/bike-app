package com.savan.bike.test;
import java.util.concurrent.*;

public class EService {
	
	static ExecutorService executor = Executors.newFixedThreadPool(2);
	public static void main(String[] args) throws Exception {
		
		try {
		Callable<String> task= ()-> "hello world".toUpperCase();
		
		Future<String> message=executor.submit(task);
		System.out.print(message.get());
		//executor.shutdown();
		
		executor.submit(() -> {
		    System.out.println("Running a simple task");
		}); 
		 } finally {
	            // Always ensure executor is shutdown
	            executor.shutdown();
	        }
		
	}

}
