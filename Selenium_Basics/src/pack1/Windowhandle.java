package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
        Thread.sleep(2000);
         String parentWinHandle = driver.getWindowHandle();
        System.out.println("Parent Window : " + parentWinHandle);
        
        Thread.sleep(2000);
         driver.findElement(By.partialLinkText("OrangeH")).click();

         Thread.sleep(2000);
          driver.findElement(By.partialLinkText("OrangeH")).click();

          Thread.sleep(2000);
           driver.findElement(By.partialLinkText("OrangeH")).click();

           System.out.println();
           System.out.println("**************");
           System.out.println();
           
           
       Set<String> winHandles = driver.getWindowHandles();
	   
       for( String w: winHandles)
       {
    	   System.out.println(w);
       }
       String  []strArr= new String[winHandles.size()];
       driver.switchTo().window(parentWinHandle);
       System.out.println();
       
       int index=0;
       for(String w:winHandles)
       {
    	   strArr[index]=w;
    	   index++;
       }
       
       System.out.println();
       System.out.println("***********WindowHandles using String array************");
       System.out.println();
       
       
       for(String ss :strArr)
       {
    	  System.out.println(ss); 
       }
       
       Thread.sleep(2000);
       driver.switchTo().window(strArr[2]);
       Thread.sleep(2000);
 	   driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("Window Switched");

       
//       if(!(w.equals(parentWinHandle)))
//	   {	   
//	      driver.switchTo().window(w);
//	      Thread.sleep(4000);
//          driver.close();
//	   }
//	   else
//	   {
//		   System.out.println("Failed to find the windowHandle.");
//	   }
//       
       
       
       
       
       
       
       
       
       
       
       
      // Thread.sleep(3000);
	  // driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("Window Switched");

//       driver.close();         //to close the currently focused window
//       driver.quit();           //to close the entire browser
       
	
	}   
}
