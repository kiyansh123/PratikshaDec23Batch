package string_discussion;

public class Class2
{
	public static void main(String[] args)
	{
		//CharAt
		String s1="Testometer";
		char m1=s1.charAt(1);
		System.out.println(m1);
		
		//concat
		String s4=s1.concat("Office");
		System.out.println(s4);
		
		String s2="testometer";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		//equals
		boolean result=s1.equals(s2);
		System.out.println(result);
		
		//equalsIgnoreCase
		boolean result2=s1.equalsIgnoreCase(s2);
		System.out.println(result2);
		
		//length
		System.out.println(s1.length());
		
		//substring
		String s8=s1.substring(5);
		System.out.println(s8);
		
		String s9=s1.substring(4, 9);
		System.out.println(s9);
		
		//replace
		String s10=s1.replace('t', 'p');
		System.out.println(s10);
		
		//toUpperCase & toLowerCase
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		//trim()
		String x1="   uiy uu   ";
		System.out.println(x1.trim());
		
		//indexOf()
		System.out.println(s1.indexOf('r'));
		
		//lastIndexOf()
		System.out.println(s1.lastIndexOf('t'));
		
		int index=s1.indexOf('t');
		int lastIndex=s1.lastIndexOf('t');
		
		if(index==lastIndex)
		{
			System.out.println("Given character present at one time");
		}
		else
		{
			System.out.println("Given character present multiple time");
		}
		
		//contains
		System.out.println(s1.contains("meter"));
		
		//toCharArray()
		char cc[]=s1.toCharArray();
		System.out.println(cc);
		System.out.println(cc[8]);
		
		for(int i=0; i<cc.length; i++)
		{
			System.out.println(cc[i]);
		}
		
		//isDigit()
		char s11='1';
		boolean res=Character.isDigit(s11);
		System.out.println(res);
		
		char s12='y';
		boolean res2=Character.isDigit(s12);
		System.out.println(res2);
		
		//valueOf()
		int num2=123;
		String zz=String.valueOf(num2);
		System.out.println(zz + 56);
		
		//parse
		String sss="123";
		int num=Integer.parseInt(sss);
		int uu=num*3;
		System.out.println(uu);
		
		
		
	}
}
