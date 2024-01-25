package com.demo;

public class Demotrycatchfinally {
	
	public static void main(String[] args) {
		System.out.println("before try");
		try {
			System.out.println("before risky code");
			int x = 10/0;
			System.out.println("after risky code");	
		}finally {
			System.out.println("inside finally");
		}
		
		System.out.println("after try..finally");
	}

}

//before try
//before risky code
//inside finally
