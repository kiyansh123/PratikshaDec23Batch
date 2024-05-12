package com.firstproject.example;

public class ConstructorBasics
{
	int a;
	
	//to initialize the global non-static variable
	public ConstructorBasics()
	{
		System.out.println("zero argument constructor");
	}
	
	public ConstructorBasics(String num1)
	{
		this();
		System.out.println("second line in constructor");
	}
	
	public ConstructorBasics(int num1)
	{
		this("ABC");
		System.out.println("first line in constructor");
	}
	
	
	public ConstructorBasics(int num1,int num2)
	{
		this("100");
		System.out.println("2 Argument constructor");
	}
	
	/*public void m1()
	{
		System.out.println(a);
	}*/
	
	public static void main(String[] args)
	{
		ConstructorBasics c1=new ConstructorBasics(100);
		//ConstructorBasics c2=new ConstructorBasics("ABC");
		//ConstructorBasics c3=new ConstructorBasics(10,20);

		//c1.m1();
		
	}
}
