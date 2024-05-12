package com.firstproject.example;

public class BreakKeywordClass 
{
	public static void main(String[] args) 
	{
		/*for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
			{
				break;    //to break the loop
			}
			System.out.println("After If block");
		}
		System.out.println("After for loop");*/
		
		int z=0;
		while(z<10)
		{
			System.out.println(z);
			if(z==6)
			{
				break;
			}
			System.out.println("After If block");
			z++;
		}
		System.out.println("After while loop");
	}
}
