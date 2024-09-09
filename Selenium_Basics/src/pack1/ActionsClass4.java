package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass4
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable/");
       
        Thread.sleep(2000);
        //                         //div[@id='draggable']
        Actions act=new Actions(driver);
        WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
       
        WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	  
        act.clickAndHold(drag).perform();
	   
        Thread.sleep(2000);
	   
        act.moveToElement(drop).click().build().perform();
	
	}
}
