package com.test;

public class Duplicate_Values_from_Array {

	public static void main(String[] args) 
	{
		String arr[]= {"Java","C","C++","Python","C","Python"};

		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
					{
						if (arr[i]==arr[j])
                       {
                    	  System.out.println("Found duplicate element: "+arr[i]);
                    	  flag=true;
	                   }
					}
					
		}
		if (flag==false)
		{
			System.out.println("Duplicate element not Found");
		}

	}

}
