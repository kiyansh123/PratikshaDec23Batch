package pack1;

import java.io.File;

import org.openqa.selenium.OutputType;

public interface TakeScreenshot {

	File getScreensshotAs(OutputType<File> file);

}
