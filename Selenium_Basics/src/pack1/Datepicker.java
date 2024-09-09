package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Datepicker.html");
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
         
        Thread.sleep(2000);
      //  WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
        //System.out.println(monthYear.getText());
        
        Thread.sleep(2000);
      // previous = driver.findElement(By.xpath("//a[@title='Prev']"));
      //  String month = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-month']")).getText();
        Thread.sleep(2000);
       // String year = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-year']")).getText();
      
       int i=0;
       
      
        while(i==0)
        {
            WebElement monthYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));

            System.out.println(monthYear.getText());

          
            if(!(monthYear.getText().equals("August 2022")))
            {
               driver.findElement(By.xpath("//a[@title='Prev']")).click();

            	
            }
            else
            {
            	break;
            }
            
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='10']")).click();
        
       
        
        
        
	}
}
