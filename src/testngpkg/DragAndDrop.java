package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {

	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void draganddrop_mthd() throws Exception
	{
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
		Thread.sleep(2000);
		
		WebElement hover_button = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		act.moveToElement(hover_button).perform();	
		
		Thread.sleep(2000);
		
		WebElement link_btn = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		link_btn.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);

		WebElement clkandhld_btn = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		act.clickAndHold(clkandhld_btn).perform();
		
		Thread.sleep(2000);
		
		WebElement doubl_buttn = driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
		doubl_buttn.click();
		
		Thread.sleep(3000);

	}
}
