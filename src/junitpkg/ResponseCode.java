package junitpkg;


import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCode {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
		String url = driver.getCurrentUrl();	//to retrive the current url
		URI obj = new URI(url);	//to verify the text is in link format or not
		URL link = obj.toURL();
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		
		int resposecode = con.getResponseCode();
		System.out.println("Response code is "+resposecode);
		
		if(resposecode == 200)
		{
			System.out.println("Valid Link");
		}
		else if(resposecode == 404)
		{
			System.out.println("Broken Link");
		}
		else
		{
			System.out.println("Other Responsecode");
		}
	}
}
