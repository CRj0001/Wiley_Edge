package wiley_learn_oops;

interface Bank1{
	void openAccount();
}

interface Bank2{
	void openAccount();
}

interface ATM extends Bank1, Bank2{
	
	void insertCard();
	void selectOption();
	boolean enterPassword();
	
}

interface AA {
	void m1();
	
}

abstract class newATM implements AA, ATM{

	@Override
		public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Inside m1");
	}
	
	public void openAccount() {
		
	}
	
}

public class BankInterface extends newATM{

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Insert Card");
	}

	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		System.out.println("Select Option");
	}
	

	@Override
	public boolean enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter Password");
		return false;
	}

}
