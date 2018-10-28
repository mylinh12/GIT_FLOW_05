package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_01_GitFlow {
	WebDriver driver;

	@Test
	public void TC_01() {
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//input[@name='q']")).clear();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Adhoc Testing");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		driver.quit();
	}

}
