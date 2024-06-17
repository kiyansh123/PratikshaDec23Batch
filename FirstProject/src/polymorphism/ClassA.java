package polymorphism;

public class ClassA
{
	public void m1(int a,char b)
	{
		System.out.println("two argument method of CLassA-int, char");
	}
	
	public void m1(char b,int a)
	{
		System.out.println("two argument method of ClassA-char,int");
	}
	
	public void m1(int a)
	{
		System.out.println("one argument method of ClassA-int");
	}
	public void m1(Boolean a)
			
	{
		System.out.println("one argument method of ClassA-boolean");

	}
	
	public void m2()
	{
		System.out.println("zero argument method of ClassA-int");
	}
	
	public static void main(String[] args)
	{
		ClassA aa=new ClassA();
		aa.m1(4);
		aa.m1(2,'b');
		aa.m1('c',3);
		aa.m1(true);
	}
}