package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframehandling {

	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logTest()
	{
		WebElement user = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		user.sendKeys("deepu123@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		pass.sendKeys("123456");
		
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		loginbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}
	
	@Test(priority = 2)
	public void addproprtmthd()
	{
		WebElement addpptbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		addpptbtn.click();
		
		WebElement frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(frametag);
		
		WebElement summarybox = driver.findElement(By.xpath("/html/body"));
		summarybox.click();
		summarybox.sendKeys("abcde");
		
		driver.switchTo().defaultContent();
	}
	
}
