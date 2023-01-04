package frameworks1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Car_Loan
{
	@Test
	public void car_loan()
	{
		System.out.println("car loan");
		}
@BeforeSuite
public void before_suite()
{
	System.out.println("before suite");
}
@BeforeSuite
public void before_suite1()
{
	System.out.println("before1 suite");
}
}
