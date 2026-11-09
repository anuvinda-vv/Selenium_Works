package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicelogin {
	
	ChromeDriver driver;
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234");
		
		WebElement loginbutton = driver.findElement(By.id("submit"));
		loginbutton.click();
		System.out.println("login successfull");
	
	}

	/*
	 * @AfterEach public void closewindow() { driver.quit(); }
	 */
}
