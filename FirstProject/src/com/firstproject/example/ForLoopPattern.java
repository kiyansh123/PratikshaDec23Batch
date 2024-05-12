package com.firstproject.example;

public class ForLoopPattern 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)    //rows
		{
			for(int j=1;j<=9;j++)  //cols
			{
				//condition for spaces
				if(j<=(5-i))
				{
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=9;j++)  //cols
			{
				//condition for spaces
				if(j<=((i*2)-1))
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}
}
