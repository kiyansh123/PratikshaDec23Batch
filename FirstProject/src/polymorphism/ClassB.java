package polymorphism;

public class ClassB extends ClassA
{
	public void m1(int a, boolean b)
	{
		System.out.println("two argument method of ClassB");
	}
	
	public void m2()
	{
		System.out.println("zero argument method of ClassB-int");
	}
	
	public static void main(String[] args)
	{
		ClassB bb=new ClassB();
		bb.m1(0, false);    //classB 
		bb.m1(4);            //classA
		bb.m1(6);           //classA
		bb.m2();            //classB
		
		ClassA aa=new ClassA();
		aa.m1(7);          //classA
		
		ClassA a=new ClassB();
		a.m2();     //classB
		a.m1(9);
		
		//ClassB b=new ClassA();    not possible
	}
	
}
