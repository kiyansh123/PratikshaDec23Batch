package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ConfigReader;
import utilities.ExcelOperations;

public class ConfigFileLogin
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	      String path=System.getProperty("user.dir") + "\\Config.properties";

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.readData(path, "testsiteurl"));
       
        Thread.sleep(2000);
      WebElement emailBox= driver.findElement(By.cssSelector("input#input-email"));
		
		String emailAddress = ConfigReader.readData(path, "userID");
		String password = ConfigReader.readData(path, "password");
      
      emailBox.sendKeys(emailAddress);
	  
	  Thread.sleep(2000);
	  WebElement passwordBox=driver.findElement(By.cssSelector("input.form-control[name='password']"));
	  Thread.sleep(2000);
	  passwordBox.sendKeys(password);
	  
	  Thread.sleep(2000);
	//  driver.findElement(By.xpath(null))
	  driver.findElement(By.cssSelector("input[value='Login']")).click();
	
	  Thread.sleep(3000);
	 WebElement myAcc= driver.findElement(By.xpath("//a[@title='My Account']"));
	myAcc.click();
	
	Thread.sleep(2000);
	 driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	}
}
