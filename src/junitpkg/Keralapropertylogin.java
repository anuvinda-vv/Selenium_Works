package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralapropertylogin {
	
	ChromeDriver driver;
	@BeforeEach 
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize(); //to maximize the window
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle = driver.getTitle();
		System.out.println("Title of the web app"+actualtitle);
	}
	
	@Test
	public void testverification()
	{
		String sourcecode = driver.getPageSource(); //to retrive the source code information
		if(sourcecode.contains("User Login"))
		{
			System.out.println("Test is present");
		}
		else
		{
			System.out.println("Test is not present");

		}
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("ulogin")); //locating username with the help of locator id
		username.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.name("upass")); //locating password field with locator name
		password.sendKeys("pass123");
		
		WebElement loginbutton = driver.findElement(By.id("sub_logbtn"));
		loginbutton.click();
	}
	
	  @AfterEach 
	  public void closewindow() 
	  { 
		  driver.quit();
	  }
	 
	
	
}
