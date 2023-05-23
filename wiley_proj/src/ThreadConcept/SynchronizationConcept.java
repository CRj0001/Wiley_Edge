package ThreadConcept;


class Sheet {
	
//	public synchronized void write(int n) {
//		for(int i=0; i<n; i++) {
//			System.out.println(i*n);
//		}
//	}
	
	//Class LVL SYNC
	public synchronized void write(int n) {
		synchronized (this) {
			for(int i=0; i<n; i++) {
				System.out.println(i+n + ": S");
			} 
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(i*n);
		} 
	}
}

class Person1 extends Thread{
	
	Sheet st;
	
	public Person1(Sheet st) {
		super();
		this.st = st;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		st.write(5);
	}
	
}


class Person2 extends Thread{
	
	Sheet st;
	
	public Person2(Sheet st) {
		super();
		this.st = st;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		st.write(10);
	}
	
}


public class SynchronizationConcept {
	public static void main(String[] args) {
		
		Sheet st = new Sheet();
		
		Person1 p1 = new Person1(st);
		Person2 p2 = new Person2(st);
		
		p1.start();
		p2.start();
	}
}
