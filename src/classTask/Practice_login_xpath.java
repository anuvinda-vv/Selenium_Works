package classTask;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_login_xpath {
	ChromeDriver driver;
	
	@BeforeEach
	public void openbrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("abcd");
		
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("1234555");
		
		WebElement submit=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		submit.click();
		
	}
	
	/*
	 * @AfterEach public void close() { driver.quit(); }
	 */
}
