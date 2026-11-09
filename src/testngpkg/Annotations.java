package testngpkg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	public void beforetestmthd()
	{
		System.out.println("Before test mtheod");
	}
	
	@BeforeClass
	public void beforeclassmthd()
	{
		System.out.println("Before class method");
	}
	
	@BeforeMethod
	public void mthd()
	{
		System.out.println(" Before mthd");
	}
	
	@Test
	public void testmthdA()
	{
		System.out.println("TestmthdA");
	}
	
	@Test
	public void testmthdX()
	{
		System.out.println("TestmthdX");
	}
	
	@Test
	public void testmthdC()
	{
		System.out.println("TestmthdC");
	}
	
	@AfterMethod
	public void afmthd()
	{
		System.out.println("After mthd");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("After class mthd");
	}
	
	@AfterTest
	public void aftest()
	{
		System.out.println("After test mthd");
	}
}
