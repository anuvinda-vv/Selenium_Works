package junit_practice;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_validation {

	ChromeDriver driver;
	String baseurl="https://keralaproperty.in/member/login/";
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.get(baseurl);
	}
	
	@Test
	public void login() throws Exception
	{
		URI li = new URI(baseurl);
		
		URL ob = li.toURL();
		
		HttpURLConnection con = (HttpURLConnection)ob.openConnection();
		
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url");
		}
		else
		{
			System.out.println("invalid url");
		}
		
	}
}
