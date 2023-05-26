package com.wiley.homeloan;

public class LoanProcess {
	
	private int loan_process_id;
	private int loan_id;
	private String doc;
	private int annual_income;
	private int cibil_score;
	public int getLoan_process_id() {
		return loan_process_id;
	}
	public void setLoan_process_id(int loan_process_id) {
		this.loan_process_id = loan_process_id;
	}
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public int getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(int annual_income) {
		this.annual_income = annual_income;
	}
	public int getCibil_score() {
		return cibil_score;
	}
	public void setCibil_score(int cibil_score) {
		this.cibil_score = cibil_score;
	}
	
	public LoanProcess(int loan_process_id, int loan_id, String doc, int annual_income, int cibil_score) {
		super();
		this.loan_process_id = loan_process_id;
		this.loan_id = loan_id;
		this.doc = doc;
		this.annual_income = annual_income;
		this.cibil_score = cibil_score;
	}
	
	public LoanProcess() {
		
	}

}
