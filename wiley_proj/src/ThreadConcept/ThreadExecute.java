package ThreadConcept;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class WeddingCard extends Thread{
	
	public void run() {
		System.out.println("Thread Name:- " + Thread.currentThread().getName());
	}
}
public class ThreadExecute {
	
	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		
	//	executor.scheduleWithFixedDelay(new WeddingCard(), 10, 2, TimeUnit.SECONDS);
		
//		executor.scheduleAtFixedRate(new WeddingCard(), 5, 2, TimeUnit.SECONDS);
		
		executor.scheduleWithFixedDelay(new WeddingCard(), 2, 1, TimeUnit.SECONDS);
		
		
	}

}
