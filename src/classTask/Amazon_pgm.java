package classTask;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws Exception
	{
		Thread.sleep(2000); //java weight used to hold pgrm execution for a perticular time period about 2sec
		WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//search.sendKeys("mobiles");
		search.sendKeys("mobiles",Keys.ENTER); //to press enter key to load

		WebElement electronics=driver.findElement(By.xpath("//*[contains(text(),'Electronics')]"));
		electronics.click();
		
		
		WebElement cart=driver.findElement(By.xpath("//a[@id=\"nav-cart\"]"));
		cart.click();
		
		
	}
}
