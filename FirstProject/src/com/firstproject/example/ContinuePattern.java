package com.firstproject.example;

public class ContinuePattern {

	public static void main(String[] args)
	{
		/*for(int i=0;i<=10;i++)
		{
			
			if(i==6)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("After for loop");*/
		
		
		for(int i=0;i<=50;i++)
		{
			if((i%2)!=0)
			{
				continue;  //skip the condition and jump to next one
			}
			System.out.println(i);
		}
		System.out.println("After for loop");
		

	}

}
