package testngpkg;

import org.testng.annotations.Test;

public class DependsOnMethod_pgm {
@Test
public void reg()
{
	System.out.println("Registration method");
}

@Test(dependsOnMethods = "reg") //login method is depent on the reg() method so it will execute only after the previous method execute
public void login()
{
	System.out.println("Login method");
}

@Test(dependsOnMethods = {"reg", "login"})
public void home()
{
	System.out.println("Home method");
}

}
