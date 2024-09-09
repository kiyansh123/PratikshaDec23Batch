package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='OKTab']")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().alert().accept();
	
	  //a[text()='Alert with OK & Cancel ']
	    driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
	   Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='Textbox']")).click();
	    Thread.sleep(2000);
	    String alertText=driver.switchTo().alert().getText();
	    System.out.println(alertText);
	    
	    driver.switchTo().alert().sendKeys("Test123");
	}
}
