package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	ChromeDriver driver;
	Select obj;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropdownmethod()
	{
		WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		obj = new Select(day);		//creating obj for select class
		obj.selectByIndex(3);		//select option using index position
		
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		obj = new Select(month);
		obj.selectByValue("02");
		
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		obj = new Select(year);
		obj.selectByVisibleText("2002");
		
	}
	
	@AfterEach
	public void closebrowser()
	{
		driver.quit();
	}
}
