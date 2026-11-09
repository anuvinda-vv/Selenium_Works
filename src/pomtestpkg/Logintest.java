package pomtestpkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pombasepkg.Baseclass;
import pompagepkg.Loginpage;


public class Logintest extends Baseclass //to retrieve the driver information from the baseclass
{
	Loginpage obj;
	
	@BeforeMethod
	public void objmthd()
	{
		obj = new Loginpage(driver);
	}
	
	@Test
	public void logintestmthd()
	{
		
		obj.setvalues();
		obj.loginmthd();
		
	}
	
	@Test
	public void titleverification()
	{
		System.out.println(obj.titlemthd());
	}
}
