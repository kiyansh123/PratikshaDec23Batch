package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import pack1.TakeScreenshot;

public class Screenshot 
{
	public static void CaptureScreen(WebDriver driver, String fileName) throws IOException
	{
		TakeScreenshot screen  =(TakeScreenshot)driver;
        File source=screen.getScreensshotAs(OutputType.FILE);
        File destination=new File("C:/Screenshots//"+fileName+".png");
        Files.copy(source, destination);
	}
}
