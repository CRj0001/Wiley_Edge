package ThreadConcept;

class BankAc {
	
	int amount = 1000;
	public synchronized void withdraw(int amt){
		if(amount < amt) {
			System.out.println("Amount is less");
		}
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Withdraw successfully");
	}
	
	public synchronized void deposit(int amt) {
		amount += amt;
		notify();
		System.out.println("Amount deposited");
	}
}

public class InterruptComm {
	public static void main(String[] args) {
		BankAc ba = new BankAc();
		
		Thread t1 = new Thread () {
			public void run() {
				ba.withdraw(1500);
			}
		};
		
		Thread t2 = new Thread () {
			public void run() {
				ba.deposit(1500);
			}
		};
		
		t1.start();
		t2.start();
	}
}
