package com.savan.bike.test;
import java.util.concurrent.*;
public class Schedular {

	public static void main(String[] arr) {
		// TODO Auto-generated method stub
		

		
		        ScheduledExecutorService scheduler = 
		            Executors.newScheduledThreadPool(2);

		        // Run task after 3 seconds delay
		        scheduler.schedule(() -> {
		            System.out.println("Delayed task");
		        }, 3, TimeUnit.SECONDS);

		        // Run task every 5 seconds
		        scheduler.scheduleAtFixedRate(() -> {
		            System.out.println("Periodic task");
		        }, 0, 5, TimeUnit.SECONDS);

		        // Run task with variable delay between executions
//		        scheduler.scheduleWithFixedDelay(() -> {
//		            System.out.println("Task with variable delay");
//		            // Simulating variable processing time
//		            try {
//		                Thread.sleep(2000);
//		            } catch (InterruptedException e) {
//		                e.printStackTrace();
//		            }
//		        }, 0, 3, TimeUnit.SECONDS);
		    }
		}

