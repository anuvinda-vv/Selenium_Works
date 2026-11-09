package testngpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Groupingpgm {

	@BeforeClass(alwaysRun = true)
	public void bfclass()
	{
		System.out.println("before class mthd");
	}
	
	@Test(priority = 1, groups="Smoke")
	public void mthdA()
	{
		System.out.println("Method A");
	}
	
	@Test(priority = 2, groups="Sanity")
	public void mthdX()
	{
		System.out.println("Method X");
	}
	
	@Test(priority = 3, groups= {"regression","Smoke"})
	public void mthdY()
	{
		System.out.println("Method Y");
	}
	
	@AfterClass(alwaysRun = true)
	public void afclass()
	{
		System.out.println("After class method");
	}
}
