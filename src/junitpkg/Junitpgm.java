package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		System.out.println("before each method");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleverification()
	{
		System.out.println("test method1");
		String actualtitle = driver.getTitle();
		String expectedtitle="Google";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Same Title");
		}
		else
		{
			System.out.println("Mismatch Title");
		}
	}
	
	@Test
	public void method2()
	{
		
		System.out.println("Method2");
	}
	
	@AfterEach
	public void closingmethod()
	{
		System.out.println("Aftereach method");
		//driver.close(); //to close the browser tab
		driver.quit();
	}
}
