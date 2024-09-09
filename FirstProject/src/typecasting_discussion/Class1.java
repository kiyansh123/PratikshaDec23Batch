package typecasting_discussion;

public class Class1 
{
	public static void main(String[] args) 
	{
		byte byteNum=10;
		int intNum=(int)byteNum;
		System.out.println(intNum);
		
		long longNum=(long)intNum;
		System.out.println(longNum);
		
		double rr=(double)intNum;
		System.out.println(rr);
		
		int s=130;
		byte byteNum2=(byte)s;
		System.out.println(byteNum2);
	}
}
