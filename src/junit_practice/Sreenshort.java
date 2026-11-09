package junit_practice;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sreenshort {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scnshort_mthd() throws Exception
	{
		/*
		 * File scnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileHandler.copy(scnsht,new
		 * File("C:\\Users\\MyLap\\OneDrive\\Desktop\\Selenium Works\\Screenshot\\Rediff1.png"
		 * ));
		 * 
		 * 
		 * FileHandler.copy(scnsht, new File("./ss\\ss.png")); //used to save screenshort in project itself
		 */
		
		
		//if you want to take screeshot of perticular element
		WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[1]/h2"));
		File ssh=image.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ssh, new File("C:\\Users\\MyLap\\OneDrive\\Desktop\\Selenium Works\\Screenshot\\logo1.png"));
	}
}
