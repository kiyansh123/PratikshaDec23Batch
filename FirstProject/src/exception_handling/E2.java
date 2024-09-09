package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E2
{
	public static void m1() throws FileNotFoundException 
	{
		
			FileInputStream file=new FileInputStream("E:/Java session");
		
	}
	public static void main(String[] args) throws IOException 
	{
		m1();
	}
}
