package com.techlab.account;

public class Account {
	private double amount;
	private String name;
	private int accNO;
	public Account( int accNO, String name,double amount) {
		super();
		this.amount = amount;
		this.name = name;
		this.accNO = accNO;
	}
	public double getAmount() {
		return amount;
	}
	public String getName() {
		return name;
	}
	public int getAccNO() {
		return accNO;
	}
	
	public void deposit(int amount) {
		this.amount+=amount;
	}
	public void withdraw( int amt) {
		if(this.amount-amt>=500)
			this.amount-=amt;
	}

}
