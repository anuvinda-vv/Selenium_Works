package junit_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/MyLap/OneDrive/Desktop/practice.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
		WebElement alert_box = driver.findElement(By.xpath("/html/body/input[1]"));
		alert_box.click();
		
		Thread.sleep(2000);
		// driver.switchTo().alert().accept(); 
		
		Alert alrt = driver.switchTo().alert();
		String actual= alrt.getText();
		
		if(actual.equalsIgnoreCase("Hello! I am an aler box!!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		alrt.accept();
	}
}
