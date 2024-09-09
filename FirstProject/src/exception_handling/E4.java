package exception_handling;

public class E4
{
	public static void main(String[] args) 
	{
		int j=10;
		
		if(j>5)
		{
			throw new ArithmeticException("My exception is found.");
		}
	}
}
