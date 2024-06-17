package interface_discussion;

public interface TestInt1
{
	public static final int a=10;             //static,public,final
	 
	
	//100% abstract
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	
	public static void m8()
	{
		System.out.println("static method of TestInt1");
	}
	
	public static void main(String[] args)
	{
		m8();
	}
}
