package com.firstproject.example;

public class MethodCategories
{
	//method with arguments
	public void addition(int num1,int num2)
	{
	
		int c=num1+num2;
		System.out.println(c);
	}
	
	//method with return type
	public int subtractNums()
	{
		int a=40;
		int b=30;
		int c=a-b;
		System.out.println(c);
		return 50;
	}
	
	//method with arguments and return type
	public double multiplyNum(int num1,int num2)
	{
		double result=num1/num2;
		return result;
	}
	
	public String getFName(String firstName)
	{
		//concatination
		String fullName=firstName + "Tendulkar";
		System.out.println(fullName);
		return fullName;
	}
	
	public static void main(String[] args)
	{
		MethodCategories ref1=new MethodCategories();
		ref1.addition(50,60);
		ref1.addition(10,20);
		
		int ans=ref1.subtractNums();
		System.out.println(ans);
		
		int cc=ans+50;
		System.out.println(cc);
		
		double uu=ref1.multiplyNum(100,6);
		System.out.println(uu);
		
		ref1.getFName("Sachin");
		
	}

}
