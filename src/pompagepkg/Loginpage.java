package pompagepkg;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	//locating webelements using page factory
	@FindBy(xpath = "//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(id="upass")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	//cvonstructor
	public Loginpage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void setvalues()
	{
		username.sendKeys("user@gmail.com");
		password.sendKeys("1234");
	}
	public void loginmthd()
	{
		loginbtn.click();
	}
	public String titlemthd()
	{
		String title = driver.getTitle();
		return title;
	}
	
	
}
