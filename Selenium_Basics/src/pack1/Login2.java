package pack1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

import utilities.Screenshot;
public class Login2
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
      //  Thread.sleep(2000);
        
        Screenshot.CaptureScreen(driver, "Test1");
        
//        TakeScreenshot screen  =(TakeScreenshot)driver;
//        File source=screen.getScreensshotAs(OutputType.FILE);
//        File destination=new File("C:/Screenshots//abc.png");
//        Files.copy(source, destination);
//        

        
//        driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[1]")).sendKeys("Admin");
//        
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[2]")).sendKeys("admin123");
//        //Thread.sleep(2000);
//       // driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
// 
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//       
//        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("OrangeH")).click();
//        Thread.sleep(2000);
//       WebElement myAcc= driver.findElement(By.xpath("//p[contains(text(),'moaaz awwad')]"));
//       myAcc.click(); 
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//a[text()='Logout']")).click();
        /*   WebElement emailBox= driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	  emailBox.sendKeys("ptakalkar10@gmail.com");
	  
	  Thread.sleep(2000);
	  WebElement passwordBox=driver.findElement(By.name("password"));
	  passwordBox.sendKeys("P@tu123");
	  
	  Thread.sleep(2000);
	//  driver.findElement(By.xpath(null))
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	  Thread.sleep(3000);
	 WebElement myAcc= driver.findElement(By.xpath("//a[@title='My Account']"));
	myAcc.click();
	
	Thread.sleep(2000);
	 driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();*/
	}
}
