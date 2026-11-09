package junit_practice;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_site {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	/*
	 * @Test public void sourcedemo() { WebElement
	 * username=driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(
	 * "user123") }
	 */
}
