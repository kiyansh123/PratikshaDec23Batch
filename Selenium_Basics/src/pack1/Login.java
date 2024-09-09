package pack1;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ExcelOperations;
public class Login
{
		public static void main(String[] args) throws InterruptedException, IOException
		{
			WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	       
	        Thread.sleep(2000);
	      WebElement emailBox= driver.findElement(By.cssSelector("input#input-email"));
		
	      String path=System.getProperty("user.dir") + "\\TestData\\ExcelSheet.xlsx";
			//String path="\\\\D:\\\\ExcelSheet.xlsx\\\\";
			String sheetName="Sheet1";
			int row=6;
			int cellForEmail=0;
			int cellForPassword=1;
			
			String emailAddress = ExcelOperations.readData(path, "sheetName", row, cellForEmail);
			String password = ExcelOperations.readData(path, "sheetName", row, cellForPassword);

	      
	      emailBox.sendKeys(emailAddress);
		  
		  Thread.sleep(2000);
		  WebElement passwordBox=driver.findElement(By.cssSelector("input.form-control[name='password']"));
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
