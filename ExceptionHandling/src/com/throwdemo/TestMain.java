package com.throwdemo;

public class TestMain {
	public static void main(String[] args) {
		TestMain t = new TestMain();
		t.m1();
		System.out.println("main method");	
	}
	
	void m1() {
		try {
			 throw new Test("invalid input");	
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("after catch");
	}

}
