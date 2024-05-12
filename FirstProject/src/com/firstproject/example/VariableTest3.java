package com.firstproject.example;

public class VariableTest3
{
	int a=80;
	static int b=90;
	public void method1()
	{
		int num=10;  //local variable
		System.out.println(num);
		int a=100;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		VariableTest3 vv=new VariableTest3();
		vv.method1();
		
	}
}
