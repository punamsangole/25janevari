package com.methodoverriding.throwskeyword;

import java.io.IOException;
import java.sql.SQLException;

public class Parent {
	
	void show() throws RuntimeException{
		System.out.println("Parent - show");
	}

}
