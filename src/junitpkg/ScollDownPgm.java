package junitpkg;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScollDownPgm {

	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void scrolldownmthd() throws Exception
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File ("./Screenshots/Amazon.png"));		//./represent current repository
		
		//used to take screenshot of the same browser but footer section 
		js.executeScript("scrollBy(0,2000)");
		Thread.sleep(2000);
		
		File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(a, new File ("./Screenshots/Footer.png"));		//./represent current repository
		
	}
}
