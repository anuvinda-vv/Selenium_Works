package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReponseCodepgm2 {

	ChromeDriver driver;
	@BeforeEach 
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize(); //to maximize the window
	}
	
	@Test
	public void linkcount() throws Exception 
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links "+links.size());
		
		for(WebElement li:links)
		{
			String url = li.getAttribute("href");
			verify(url);
		}
	}

	private void verify(String url) throws Exception {
		
		try 
		{
		URI obj = new URI(url);
		URL value = obj.toURL();
		HttpURLConnection con = (HttpURLConnection) value.openConnection();
		
		int resposecode = con.getResponseCode();
		
		if(resposecode == 200)
		{
			System.out.println("Valid link ----------- "+url);
		}
		else if(resposecode == 404)
		{
			System.out.println("Broken link ----------"+url);
		}
		else
		{
			System.out.println("Other Responsecode");
		}
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
