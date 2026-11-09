package classTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Action_pgrm {

	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void homepage() throws Exception
	{
		WebElement right_ckl_btn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		act.contextClick(right_ckl_btn).perform();
		
		Thread.sleep(2000);
		
		WebElement edit_btn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit_btn.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement dobleclk_btn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dobleclk_btn).perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();

		

	}
}
