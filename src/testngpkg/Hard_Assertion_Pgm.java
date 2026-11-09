package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Hard_Assertion_Pgm {

	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void title_verification()
	{
		String actualtitle = driver.getTitle();
		//System.out.println(actualtitle);
		
		String expectedtitle =  "Rediffmail Free Unlimited ";
		
		Assert.assertEquals(expectedtitle, actualtitle);
		System.out.println("Title verification success");	//this line will be executed only after assertion pass
	}
	
	@Test (priority = 2)
	public void urlverification()
	{
		String actualurl = driver.getCurrentUrl();
		//System.out.println(actualurl);
		
		String expectedurl = "https://register.rediff.com/register/register.php?FormName=user_details";
		
		Assert.assertEquals(actualurl, expectedurl);
		System.out.println("url verification completed");
	}
}
