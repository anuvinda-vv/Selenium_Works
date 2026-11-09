package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RigthtAndDouble {

	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		WebElement dblclk_btn = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(dblclk_btn);
		
		WebElement rightclk_btn = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(rightclk_btn);
		act.perform();
	}
}
