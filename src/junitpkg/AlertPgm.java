package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgm {

	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/MyLap/OneDrive/Documents/alert.html");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws Exception
	{
		WebElement alertbox = driver.findElement(By.xpath("/html/body/input[1]"));
		alertbox.click();
		
		//handle alert box
		Alert alrt = driver.switchTo().alert();
		String alert_text = alrt.getText();		//to retrive the text from the alert box
		System.out.println("Alert text = "+alert_text);
		
		Thread.sleep(2000);			
		
		alrt.accept();		//to click the 'ok' button of the alert box		
			
		WebElement firstname = driver.findElement(By.xpath("/html/body/input[2]"));
		firstname.sendKeys("abcd");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("1234");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}
}
