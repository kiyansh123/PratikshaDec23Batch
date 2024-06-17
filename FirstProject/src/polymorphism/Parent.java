package polymorphism;

public  class Parent
{
	static int i=10;
	 void home()
	{
		System.out.println("home method of parent");
	}
	 
	public void home(int a)
	{
		System.out.println("home method of parent-1 argument");
		
	}
	
	public void home(int a,Boolean b)
	{
		System.out.println("home method of parent-2 argument");
		
	}
	
	public void car()
	{
		System.out.println("car method of parent");
	}
	
	 public static void marry()
	{
		System.out.println("marry method of parent");
		
	}
	 
	 public static void main(String[] args)
	 {
		 Parent p=new Parent();
		 p.home(9,true);
	 }
	
}
