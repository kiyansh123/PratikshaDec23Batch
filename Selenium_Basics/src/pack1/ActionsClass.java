package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
       
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        
        WebElement emailBox= driver.findElement(By.cssSelector("input#input-email"));
		 // emailBox.sendKeys("ptakalkar10@gmail.com");
		act.sendKeys(emailBox,"ptakalkar10@gmail.com").build().perform();
        
		act.sendKeys(Keys.TAB).build().perform();
		
		  Thread.sleep(2000);
		  WebElement passwordBox=driver.findElement(By.cssSelector("input.form-control[name='password']"));
		 // passwordBox.sendKeys("P@tu123");
		  act.sendKeys(passwordBox,"P@tu123").build().perform();
		  
		  Thread.sleep(2000);
		  act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		  
		 // Thread.sleep(2000);
		//  driver.findElement(By.xpath(null))
		//  driver.findElement(By.cssSelector("input[value='Login']")).click();
		
      
//        WebElement components = driver.findElement(By.xpath("//a[text()='Components']"));
//	
//        Thread.sleep(2000);
//	    Actions act=new Actions(driver);
//	    act.moveToElement(components).build().perform();
//	
//	    WebElement monitors = driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
//	    act.click(monitors).build().perform();
	
	}
}
