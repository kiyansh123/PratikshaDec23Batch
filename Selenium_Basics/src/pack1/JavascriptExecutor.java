package pack1;

import org.openqa.selenium.WebElement;

public interface JavascriptExecutor {

	void executeScript(Object object, WebElement humanRadioButton);

	void executeScript(String string, String[] args);

}
