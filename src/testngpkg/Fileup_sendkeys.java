package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileup_sendkeys {

	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void file_upmthd()
	{
		WebElement file_btn = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		file_btn.sendKeys("C:\\Users\\MyLap\\OneDrive\\Pictures\\Screenshots\\1a.png");
	}
}
