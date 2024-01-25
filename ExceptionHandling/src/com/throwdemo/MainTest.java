package com.throwdemo;

public class MainTest {
	
	public static void main(String[] args) {
		Account ac = new Account();
		System.out.println("Before withdrawal balance>> "+ac.getBalance());//10k
		ac.withdraw(50000);
		System.out.println("After withdrawal balance>> "+ac.getBalance());//5k

		
	}

}
