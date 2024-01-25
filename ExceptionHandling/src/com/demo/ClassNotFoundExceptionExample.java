package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassNotFoundExceptionExample {
	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException{
		   
		     
				clsLoad();
			
		      System.out.println("after clsLoad");
			
		} 
	
	static void clsLoad() throws ClassNotFoundException, FileNotFoundException {
		
		
			Class.forName("com.demo.Test2");
			FileInputStream fis = new FileInputStream("C:\\Users\\CHETANA SADARE\\Desktop\\git2.txt");
		
		
	}
	

}

//throwable
//exception
//ioexception
//filenotfoundexception




