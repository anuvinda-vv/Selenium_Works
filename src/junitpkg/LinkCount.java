package junitpkg;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkcount()
	{
		List<WebElement> link=driver.findElements(By.tagName("a")); //locating elements that have a tag
		System.out.println("number of links = "+link.size()); //to print the count of link
		
		for(WebElement li:link)
		{
			//System.out.println("link------------"+li.getAttribute("href"));
			System.out.println(li.getText()+"----------"+li.getAttribute("href")); //used to print the attribute and text
		}
		
	}
}
