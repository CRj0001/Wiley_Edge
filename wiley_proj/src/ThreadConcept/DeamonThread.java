package ThreadConcept;

class SupportClass extends Thread{
	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())
			System.out.println("Daemon");
		else
			System.out.println("Not Daemon");
	}
}

public class DeamonThread {
	
	public static void main(String[] args) {
		
		SupportClass t1 = new SupportClass();
		SupportClass t2 = new SupportClass();
		
		t1.setDaemon(true);
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
	}
	
}
