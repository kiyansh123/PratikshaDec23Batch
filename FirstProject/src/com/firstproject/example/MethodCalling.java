package com.firstproject.example;

public class MethodCalling 
{
	/*public void m3()
	{
		MethodTest tt2=new MethodTest();
		
	}*/
	
	public static void main(String[] args) 
	{
		//calling of  static method from another class
		//ClassName.methodName();
		MethodTest.printStatement();
		
		//calling of non-static method from another class
		MethodTest ref1=new MethodTest();
		ref1.m2();
		
		int var1=VariableTest.num;
		System.out.println(var1);
		
	}

}
