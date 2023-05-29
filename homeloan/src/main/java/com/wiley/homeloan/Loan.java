package com.wiley.homeloan;
import java.sql.Date;

public class Loan {

	private int loan_id;
	private int user_id;
	private Date application_date;
	private Date sanction_date;
	private int duration;
	private float interest_rate;
	private String status;
	@Override
	public String toString() {
		return "Loan [loan_id=" + loan_id + ", user_id=" + user_id + ", application_date=" + application_date
				+ ", sanction_date=" + sanction_date + ", duration=" + duration + ", interest_rate=" + interest_rate
				+ ", status=" + status + ", loan_amount=" + loan_amount + ", annual_income=" + annual_income + "]";
	}
	private int loan_amount;
	private int annual_income;
	
	public Loan( int user_id, Date application_date, Date sanction_date, int duration, float interest_rate,
			String status, int loan_amount, int annual_income,User user) {
		super();
//		this.loan_id = loan_id;
		this.user_id = user.getUser_id();
		this.application_date =  new Date(System.currentTimeMillis());
		this.sanction_date = sanction_date;
		this.duration = duration;
		this.interest_rate = interest_rate;
		this.status = status;
		this.loan_amount = loan_amount;
		this.annual_income = annual_income;
		
	}
	
	public Loan() {
		this.loan_id = 0;
		this.user_id = 0;
		this.application_date = new Date(System.currentTimeMillis());
		this.sanction_date = new Date(System.currentTimeMillis());
		this.duration = 0;
		this.interest_rate = 0;
		this.status = "Applied";
		this.loan_amount = 0;
		this.annual_income = 0;
	}
	
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getApplication_date() {
		return application_date;
	}
	public void setApplication_date(Date application_date) {
		this.application_date = application_date;
	}
	public Date getSanction_date() {
		return sanction_date;
	}
	public void setSanction_date(Date sanction_date) {
		this.sanction_date = sanction_date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(float interest_rate) {
		this.interest_rate = interest_rate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public int getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(int annual_income) {
		this.annual_income = annual_income;
	}
	
	
	
}