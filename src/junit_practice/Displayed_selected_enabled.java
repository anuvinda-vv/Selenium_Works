package junit_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed_selected_enabled {

	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@Test
	public void login()
	{
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean a=logo.isDisplayed();
		if (a)
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		WebElement radiobtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[1]/input"));
		boolean b =  radiobtn.isSelected();
		if(b)
		{
			System.out.println("btn is selected");
		}
		else
		{
			System.out.println("btn is not selected");
		}
		
	}
}
