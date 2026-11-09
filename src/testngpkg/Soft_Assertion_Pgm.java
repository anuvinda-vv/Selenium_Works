package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion_Pgm {

ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test 
	public void logoverification()
	{
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		Boolean result = logo.isDisplayed();
		System.out.println(result);
		
		SoftAssert obj = new SoftAssert();
		obj.assertTrue(result);	//checking the value of the result is true or not
		obj.assertAll();
		System.out.println("logo is displayed");
	}
	
	@Test 
	public void title_verification()
	{
		String actualtitle = driver.getTitle();
		//System.out.println(actualtitle);
		
		String expectedtitle =  "Rediffmail Free Unlimited ";
	
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(expectedtitle, actualtitle);
		obj.assertAll();
		System.out.println("Success");

	}
}
