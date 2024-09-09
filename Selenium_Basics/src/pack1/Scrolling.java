package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Scroll;

public class Scrolling
{
	private static final WebDriver JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
       
        Thread.sleep(2000);
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
       
        Thread.sleep(2000);
        WebElement insideIframe = driver.findElement(By.xpath("//iframe[contains(@src,'embedded=true')]"));
        driver.switchTo().frame(insideIframe);
      
        Thread.sleep(2000);
        WebElement humanRadioButton=driver.findElement(By.xpath("//div[@id='i8']"));
        humanRadioButton.click();
        
        Scroll.ScrollTo(driver, humanRadioButton);
        humanRadioButton.click();
        
//      JavascriptExecutor js=(JavascriptExecutor)driver;
//      js.executeScript("arguments[0].scrollInttoView();", humanRadioButton);
	}
}
