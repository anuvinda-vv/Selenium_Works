package junit_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParenttoChild {

	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void login()
	{
		WebElement fullname=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input"));
		fullname.sendKeys("anu");
		
		WebElement id=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input"));
		id.sendKeys("anju1233");
		
		WebElement password=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[6]/div/input"));
		password.sendKeys("1234");
	}
}
