package com.firstproject.example;

public class VariableTest 
{
	//static dataType VariableName=value;
	static int num=10;
	int num2=20;
	
	public void m3()
	{
		System.out.println(num2);
	}
	
	public static void main(String[] args)
	{
		System.out.println(num);
	    VariableTest obj2=new VariableTest();	
		System.out.println(obj2.num2);
		
		System.out.println("GIT Test.");
	}
}
