package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_01_GitFlow {

	WebDriver driver;

	@Test
	public void TC_01() {
		driver = new FirefoxDriver();
	}

}
