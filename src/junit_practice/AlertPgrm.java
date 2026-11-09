package junit_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgrm {
	ChromeDriver driver;
	Alert alrt;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//driver.manage().window().maximize();
	}
	@Test
	public void practice() throws Exception
	{
		WebElement alertwithok = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertwithok.click();
		Thread.sleep(2000);
		
		alrt = driver.switchTo().alert();
		String text = alrt.getText();
		System.out.println(text);
		
		alrt.accept();
		
		WebElement alertwithokcancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertwithokcancel.click();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		confirmbox.click();
		Thread.sleep(2000);
		
		String text1 = alrt.getText();
		System.out.println(text1);
		alrt.dismiss();
		
		WebElement alertwithtextbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertwithtextbox.click();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promptbox.click();
		
		alrt.sendKeys("Anuvinda");
		Thread.sleep(2000);
		alrt.accept();
		
		
	}
}
