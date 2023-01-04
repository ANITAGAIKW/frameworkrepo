package frameworkpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 
{
	
	@Test(groups="smoke1")
	public void addition()
	{
	int a=10,b=20;
	System.out.println("Addition: " + (a+b));
	}
	@Test(groups="sanity")
	public void substraction()
	{
	int a=10,b=20;
	System.out.println("substraction: " + (a-b));
	}
	@Test(groups="smoke")
	public void multipy()
	{
	int a=10,b=20;
	System.out.println("Multiply: " + (a*b));
	}
	
	@AfterMethod 
	public void after_method() 
	{ 
	System.out.println("This method will be invoked after every test method of test case1");
	}
	@BeforeMethod 
	public void before_method() 
	{ 
	System.out.println("This method will be invoked before every test method of testcase1");
	}

}
