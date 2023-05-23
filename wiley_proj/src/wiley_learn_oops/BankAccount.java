package wiley_learn_oops;

public class BankAccount {
	private int accountno;
	private String name;
	private double balance;
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return balance;
	}
	public void setAmount(double amount) {
		this.balance = amount;
	}
	
	public void deposite(double amt) {
		balance += amt;
	}
}
