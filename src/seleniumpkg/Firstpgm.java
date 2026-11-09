package seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpgm {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//used to retrive title of the webapplication - getTitle
		String actualtitle = driver.getTitle();
		System.out.println("The Title of the webapp is "+ actualtitle);
		
		String expectedtitle = "Google";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("The Title Matches");
		}
		else
		{
			System.out.println("Title Not Match");
		}
	}

}
