package junit_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Content_verification {

	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expecttitle="facebook";
		if(actualtitle==expecttitle) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void contentverification()
	{
		String actual=driver.getPageSource();
		String expected=("Contact No");
		if(actual.contains(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
