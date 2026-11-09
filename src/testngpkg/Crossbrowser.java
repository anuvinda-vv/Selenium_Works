package testngpkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeTest
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome browser");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("edge browser");
		}
		else
		{
			driver=new FirefoxDriver();
			System.out.println("firefox driver");
		}
	}
	
	@Test
	public void method1() throws Exception
	{
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	
}
