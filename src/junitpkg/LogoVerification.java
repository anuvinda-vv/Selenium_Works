package junitpkg;

import java.security.PublicKey;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVerification {

	ChromeDriver driver;
	@BeforeEach
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			driver.manage().window().maximize();
		}
	
	@Test
	public void rediff() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		boolean result = logo.isDisplayed();
		if(result==true)
		{
			System.out.println("logo is didplpayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		
		WebElement femaleradbutton = driver.findElement(By.xpath("//input[@value=\"f\"]"));
		boolean buttonenab = femaleradbutton.isEnabled();  //to verify whether the button is enabled or not
		System.out.println("female gender button is enabled "+buttonenab);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@name,\"chk_altemail\")]"));
		boolean checkboxbutton = checkbox.isSelected();
		if(checkboxbutton==true) 
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
			checkbox.click();
			Thread.sleep(2000);
		}
	}
	
	@AfterEach
	public void closewindow() {
		driver.quit();
	}
}
