package encapsulation_discussion;

public class Class_B
{
	public static void main(String[] args) 
	{
		Class_A aa=new Class_A();
		double bal=aa.getBalance();
		System.out.println(bal);
		aa.setBalance(600.00);
		System.out.println(bal);
	}
}
