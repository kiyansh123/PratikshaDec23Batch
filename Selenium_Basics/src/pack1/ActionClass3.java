package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass3
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(2000);
                 
        Actions act=new Actions(driver);
        
     WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
      WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
      act.sendKeys("ABCDE").perform();
      Thread.sleep(2000);
      //ctrl+a
      //ctrl+c
      //tab
      //ctrl+v
      act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
     Thread.sleep(2000);
      act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
      Thread.sleep(2000);
      act.sendKeys(Keys.TAB);
      Thread.sleep(2000);
      act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
}
