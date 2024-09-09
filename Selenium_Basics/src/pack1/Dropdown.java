package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kiyansh");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gopale");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kiyu123@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("kiyu123@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Kiyu@1234");
	   // driver.findElement(By.xpath("//input[@name='birthday_age']")).sendKeys("28");

	    WebElement chkbx = driver.findElement(By.xpath("//span[@data-name='gender_wrapper']"));

	     boolean isDisplayed=chkbx.isDisplayed();
	     System.out.println("isDisplayed: " + isDisplayed);
	     Thread.sleep(2000);
	        
	    boolean isEnabled=chkbx.isEnabled();
		System.out.println("isEnabled: " + isEnabled);
		
		Thread.sleep(2000);
		boolean isSelected = chkbx.isSelected();
		System.out.println("isSelected: " + isSelected);
		Thread.sleep(2000);
		
		if(isSelected==false)
		{
			chkbx.click();
		}
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//select[@id='day']")).click();
		Thread.sleep(2000);
		
		//select[@id='day']//option
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));
	    for(WebElement day :days)   //for each loop
	    {
	    	System.out.println(day.getText());
	    	if(day.getText().equals("10"))
	    	{
	    		day.click();
	    	}
	    	
	    }
	    
	    Thread.sleep(2000);
	    
	    //handling by Select class
	   WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
       Select s= new Select(months);
       s.selectByIndex(2);
       Thread.sleep(2000);
       s.selectByValue("8");
	 Thread.sleep(2000);
	 s.selectByVisibleText("Nov");
	}
}
