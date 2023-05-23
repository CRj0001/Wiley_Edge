package ThreadConcept;


class DemoTh implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	
}
	
}
	
public class ThreadGroupConcept {

	public static void main(String[] args) {
		
		ThreadGroup tgP = new ThreadGroup("Parent");
		ThreadGroup tgC1 = new ThreadGroup(tgP, "Child-1");
		ThreadGroup tgC1GC1 = new ThreadGroup(tgC1, "Grand Child-1");
		
		Thread t1 = new Thread(tgP, new DemoTh(), "First");
		Thread t2 = new Thread(tgP, new DemoTh(), "Second");
		Thread t3 = new Thread(tgC1, new DemoTh(), "Third");
		Thread t4 = new Thread(tgC1, new DemoTh(), "Fourth");
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		System.out.println("Active Thread in Parent Group: " + tgP.activeCount());
		System.out.println("Active Thread in Child-1: " + tgC1.activeCount());
		System.out.println("Active Thread in Grand Child-1: " + tgC1GC1.activeCount());

		tgP.list();
	
	}
	
}
