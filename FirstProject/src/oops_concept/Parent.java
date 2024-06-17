package oops_concept;

public class Parent 
{
	int parentVariable1=100;
	static int static_parentVariable1=200;
	int c=800;
	
	public Parent()
	{
		System.out.println("No Argument constructor of parent class");
	}
	
	public Parent(int a)
	{
		System.out.println("One argument constructor of parent class");
	}
	
	public void m1()
	{
		System.out.println("method m1 of Parent");
	}
	
	public static void m2()
	{
		System.out.println("Method m2 of Parent");
	}
	
	public static void main(String[] args)
	{
		
	}
}
