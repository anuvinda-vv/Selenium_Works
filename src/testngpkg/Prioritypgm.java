package testngpkg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prioritypgm {

	@BeforeClass
	public void bfclassmthd()
	{
		System.out.println("Before class mthd");
	}
	
	@Test(priority=1, invocationCount = 3)
	public void mthdX()
	{
		System.out.println("MethodX");
	}
	
	@Test(priority=2, enabled = false)
	public void mthdA()
	{
		System.out.println("MethodA");
	}
	
	@Test(priority=3)
	public void mthdF()
	{
		System.out.println("MethodF");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("After class mthd");
	}
}
