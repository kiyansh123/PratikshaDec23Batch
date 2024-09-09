package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDiscussion
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        
//        driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[1]")).sendKeys("Admin");
//    
//
//      driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[2]")).sendKeys("admin123");
//      
//    //  driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
//      
//    driver.findElement(By.xpath("//button[@type='submit']")).click();
     
     driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//	WebElement button=driver.findElement(By.xpath("//button[@id='enable-button']"));
//	button.click();
//	
//	WebElement button2=driver.findElement(By.xpath("//button[@id='disable']"));
//
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
//	wait.until(ExpectedConditions.elementToBeClickable(button2));
//
//	wait.until(ExpectedConditions.elementToBeClickable(button2));
//	driver.findElement(By.xpath("//button[@id='display-other-button']"));
   Thread.sleep(2000);
//     WebElement enableAnotherBtn=driver.findElement(By.xpath("//button[@id='display-other-button']"));
//	enableAnotherBtn.click();
//	
//	WebElement hiddenBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.visibilityOf(hiddenBtn));
//	
//	WebElement button=driver.findElement(By.xpath("//button[@id='enable-button']"));
//	button.click();
   

//   driver.findElement(By.xpath("//button[@id='alert']")).click();
//	
//   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.alertIsPresent());
//	
//	driver.switchTo().alert().accept();
   Thread.sleep(4000);
  WebElement textButton=driver.findElement(By.xpath("//button[@id='populate-text']"));
		  

 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("arguments[0].click();", textButton);
  
  WebElement textToVerify = driver.findElement(By.xpath("//h2[@id='h2']"));
	
//  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.textToBePresentInElement(textToVerify, "Selenium Webdriver"));
	
//  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//		  .withTimeout(Duration.ofSeconds(20))
//		  .pollingEvery(Duration.ofSeconds(1))
//		  .ignoring(ElementNotInteractableException.class)
//		  .ignoring(NullPointerException.class);
//  
//	wait.until(ExpectedConditions.textToBePresentInElement(textToVerify, "Selenium Webdriver"));

 driver.findElement(By.xpath("//button[@id='alert']")).click();
	}
}
