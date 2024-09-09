package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
       
        Thread.sleep(2000);
        Actions act=new Actions(driver);
//        WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
//        act.contextClick(rightClick).perform();
        
//        Thread.sleep(2000);
//        WebElement cut=driver.findElement(By.xpath("//li[contains(@class, 'context-menu-icon-cut')]"));
//        act.click(cut).perform();
        
        Thread.sleep(2000);
        WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        act.doubleClick(doubleClick).perform();
        
	}
}
