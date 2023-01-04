package frameworkpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testngpgm 
{
@Test	
public void demo()
	 {
		System.out.println("hello");

	}
@AfterClass
public void after_class()
{
	System.out.println("after class");
	}
@BeforeClass
public void before_classt()
{
	System.out.println("before class");
	}



}
