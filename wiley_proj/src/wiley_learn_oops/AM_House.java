package wiley_learn_oops;

public class AM_House {


	public void see() {
		System.out.println("Anyone can see the house");
	}
	
	private void live() {
		System.out.println("Only Family members can live here");
	}
	
	void enter() {
		System.out.println("Only known peoples can visit the house");
	}
	
	protected void unkownPpl() {
		System.out.println("Protected from strangers.");
	}
	
}

