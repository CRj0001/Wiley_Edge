package com.wiley.homeloan;

public interface LoanDAO {
	
	public boolean isEligibleForLoan();
	public void setInDb(Loan l,int user_id);

	
}