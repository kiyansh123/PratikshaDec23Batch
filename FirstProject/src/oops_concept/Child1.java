package oops_concept;

public class Child1 extends Parent
{
	int variableChild1=80;
	static int static_variableChild1=900;
	int v1=500;
	
	public Child1()
	{
		super(6);
		System.out.println("No Argument constructor child1 class");
	}
	
	  public void ChildMethod() 
	  { 
		  int v1=4000; 
		  System.out.println("ChildMethod of Parent"); // System.out.println(this.v1);
	  }
	 	
	public static void ChildMethod_static()
	{
		System.out.println("ChildMethod_static of Parent");
	}
	public static void main(String[] args)
	{
		Child1 ref1=new Child1();
		
		//int variableFromClass1=ref1.a;
		//ref1.m1();
		
		//int staticVarFromClass1=TestClass1.b;
		//TestClass1.m2();
		/*System.out.println(static_parentVariable1);
		m2();
		Child1 ref2=new Child1();
		int nonStaticVar=ref2.parentVariable1;
		System.out.println(nonStaticVar);
		ref2.m1();
		
		System.out.println(static_variableChild1);
		System.out.println(ref2.variableChild1);
		System.out.println(ref1.c);*/
		
		
	}
}
