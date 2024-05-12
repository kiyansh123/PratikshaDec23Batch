package com.firstproject.example;

public class MethodTest {

	
	public static void m1()
	{
		
	}
	//static method
	public static void printStatement()
	{
		System.out.println("Satic method 1 from printStatement method");
		System.out.println("Satic method 1 from printStatement method");
	
		MethodTest tt=new MethodTest();
		tt.m2();
	}
	
	//Non-static method
	public void m2()
	{
	 System.out.println("Non-static method m2 from MethodTest class");
	// printStatement();
	}
	
	public void m3()
	{
		System.out.println("Non-static method m3 from MethodTest class");
		m2();
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Static method 1 from main method");
		printStatement();
		MethodTest obj1=new MethodTest();
		obj1.m2();
		obj1.m3();
	}

}
