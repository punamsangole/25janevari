package com.demo;

public class StackOverFlowErrorExample {
	
	void m1() {
		m2();
	}
	
	void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		StackOverFlowErrorExample s = new StackOverFlowErrorExample();
		s.m1();
	}

}
