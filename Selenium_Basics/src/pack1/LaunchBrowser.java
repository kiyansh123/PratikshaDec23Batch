package pack1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
public class LaunchBrowser 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		//ChromeDriver driver=new ChromeDriver();    //to launch the chrome browser
		//EdgeDriver driver2=new EdgeDriver();       //to launch the edge browser
		
		String browsername="Edge";
		if(browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
    	}
		else if(browsername.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		//basic commands
		driver.manage().window().maximize();       //maximize the browser using method chaining
	//	driver.get("https://www.google.com/");     //hit url
		driver.navigate().to("https://www.facebook.com/");    //hit url
//		Thread.sleep(2000);
//        driver.navigate().back();	    //to press back button on browser
//        
//        Thread.sleep(2000);
//        driver.navigate().forward();    //to press forward button on browser
//        
//        Thread.sleep(2000);
//        driver.navigate().refresh();     //to press refresh button on browser
        
         String title=driver.getTitle();    //to get the title of webpage
          
         
         if(title.contains("Facebook"))
         {
        	 System.out.println("Test case pass");
         }
         else
         {
        	 System.out.println("Test case fail");
         }
         
         String url=driver.getCurrentUrl();     //to get the current url
         System.out.println(url);
	
	}

}
