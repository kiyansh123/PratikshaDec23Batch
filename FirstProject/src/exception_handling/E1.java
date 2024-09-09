package exception_handling;

public class E1 
{
	public static void main(String[] args) throws InterruptedException
	{
		int a=10;
		int b=0;
		 
		System.out.println("Before exception handling");
		try 
		{
			int c=a/b;      //risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Found : " + e.getMessage());
			
		}
		/*catch(NullPointerException e)
		{
			System.out.println("NullPointerException Found : " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Found : " + e.getMessage());
		}*/
		finally
		{
			System.out.println("Finally block running");
		}
		
		Thread.sleep(5000);
		System.out.println("After exception handling");
	}
}
