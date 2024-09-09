package typecasting_discussion;

public class Class3 extends Class2
{
	public void m1()
	{
		System.out.println("method m1 of Class3");
	}
	
	public static void main(String[] args) 
	{
		Class3 c3=new Class3();
		c3.m1();
		
		Class2 c2=new Class2();
		c2.m1();
		
		Class2 x1=(Class2)c3;
		//Class2 x1=new Class3();
		x1.m1();
		
		 Class3 y1=(Class3)c2;
		 y1.m1();
	}
}
