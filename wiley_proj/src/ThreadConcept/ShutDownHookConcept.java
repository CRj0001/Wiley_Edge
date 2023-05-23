package ThreadConcept;

class LastEvent extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ShutDown Hook Current Thread: "+ Thread.currentThread().getName());
	}
	
}

class LastEvent1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread: "+ Thread.currentThread().getName());
	}
	
}

public class ShutDownHookConcept {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		rt.addShutdownHook(new LastEvent());
		
		for(int i=0; i<10; i++) {
			LastEvent1 t = new LastEvent1();
			t.start();
			//System.out.println();
		}
	}
}
