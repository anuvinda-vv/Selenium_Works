package junit_practice;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_count_validation {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement li:link)
		{
			String links = li.getAttribute("href");
			verify(links);
		}
	
	}
	
	private void verify(String links) throws Exception {
		try {
			
		
	URI li = new URI(links);
	URL acturl = li.toURL();
	
	HttpURLConnection con = (HttpURLConnection)acturl.openConnection();
	
	con.connect();
	
	if(con.getResponseCode()==200)
	{
		System.out.println("valid url"+links);
	}
	else
	{
		System.out.println("invalid url"+links);
	}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
