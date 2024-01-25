package com.throwdemo;

public class Account {
	
	private int balance = 10000;

	public int getBalance() {
		return balance;
	}

	
	public void withdraw(int amount) { //5000
		if(amount>balance) {
			InsufficientBalanceException i = new InsufficientBalanceException("Insufficient balance in your account");
			throw i;	
		}
		
		balance = balance -amount;
		
		
		
	}
	
	

}
