package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginpage() throws InterruptedException
	{
		WebElement rediffemail=driver.findElement(By.xpath("//input[contains(@id,\"login\")]"));
		rediffemail.sendKeys("admin");
		
		Thread.sleep(2000);
		
		WebElement fullname=driver.findElement(By.xpath("//input[contains(@name,\"name\") and @placeholder,\"Enter your full name\"]"));
		fullname.sendKeys("Anuvinda");
		
		
	}
}
