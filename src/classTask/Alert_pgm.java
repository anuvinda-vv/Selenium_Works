package classTask;

import javax.xml.xpath.XPath;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pgm {

	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	@Test
	public void demosite() throws Exception
	{
		WebElement displayalertbox = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		displayalertbox.click();
		
		Alert alrt = driver.switchTo().alert();
		String text = alrt.getText();
		System.out.println("Alert Text = "+text);
		Thread.sleep(2000);
		
		alrt.accept();
		Thread.sleep(3000);
		
		WebElement alertBox2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertBox2.click();
		
		WebElement displayConfirmBox = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		displayConfirmBox.click();
		Thread.sleep(2000);
		
		Alert alrt1 = driver.switchTo().alert();
		String text1 = alrt1.getText();
		System.out.println("Alert Text = "+text1);
		alrt.dismiss();
		
		
		WebElement alertBox3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertBox3.click();
		
		WebElement promtBox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promtBox.click();
		Thread.sleep(2000);
		
		Alert alrt2 = driver.switchTo().alert();
		alrt2.sendKeys("Anuvinda");
		Thread.sleep(5000);
		alrt.accept();
	}
}
