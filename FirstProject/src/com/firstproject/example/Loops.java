package com.firstproject.example;

public class Loops
{

	public static void main(String[] args)
	{
//int i=0;
//		while(i>=1)
//	{
//		System.out.println("Hello World....!!");
//		i--;
//	}
//		Do-while Loop
//	do
//	{
//		body
//	}
//		while(boolean condition);
		
//do
//{
//	System.out.println("Hello World...!!!");
//	i++;
//}
//while(i<5);
//System.out.println("After Loop");
	//for loop
//for(initialization,boolean condition,increment/decrement)
		
	/*	for(int i=0;i<=4;i++)
		{
			System.out.println("Hello World");
		}
		System.out.println("After Loop");*/
	/*for(int j=0;j<=5;j++)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.print(("*"));
		}
		System.out.println();
	}*/
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
	
	

}
