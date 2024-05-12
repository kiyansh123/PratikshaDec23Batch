package com.firstproject.example;

public class ForEachLoop 
{
	public static void main(String[] args)
	{
		int [] array1= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<=7;i++)
		{
			System.out.println(array1[i]);
			
		}
		System.out.println("End of for loop");
		
		//for each loop=advance version of for loop
		for(int num:array1)
		{
			
			if(num==6)
			{
				break;
			}
			System.out.println(num);
		}
	}
}
