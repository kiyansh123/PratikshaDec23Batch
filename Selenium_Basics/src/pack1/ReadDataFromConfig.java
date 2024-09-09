package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromConfig 
{
	public static void main(String[] args) throws IOException
	{
		String path=System.getProperty("user.dir") + "\\Config.properties";
	    Properties prop=new Properties();
	    FileInputStream file=new FileInputStream(path);
	    
	   prop.load(file);
	  String url= prop.getProperty("testsiteurl");
       System.out.println(url);
	
	}
}
