package classTask;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_count_facebook {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		List<WebElement> linkcount=driver.findElements(By.tagName("a"));
		System.out.println("link count ---------"+linkcount.size());
	
	
		for(WebElement link:linkcount)
			{
				System.out.println(link.getText()+"----------------"+link.getAttribute("href"));
			}
	}
}