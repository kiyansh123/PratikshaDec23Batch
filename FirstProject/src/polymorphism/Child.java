package polymorphism;

public class Child extends Parent
{
	static int i=1;
	public static void marry()
	{
		System.out.println("marry method of child");
		
	}
	
	public static void main(String[] args)
	{
		Parent p=new Child();
		p.marry();          //Runtime polymorphism /Late Binding
		
		//static method-method hiding
		
		Child c=new Child();
		//c.marry();
		c.home(8);
		
		marry();
		System.out.println(Parent.i);
		System.out.println(i);
	}
	
}
