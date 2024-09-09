package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{
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
        
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        WebElement frame3Text = driver.findElement(By.xpath("//input[@name='mytext3']"));
        frame3Text.sendKeys("1234");
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
         Thread.sleep(2000);
         WebElement frame1Text = driver.findElement(By.xpath("//input[@name='mytext1']"));
         frame1Text.sendKeys("12345");
         
         Thread.sleep(2000);
        
	}
}
