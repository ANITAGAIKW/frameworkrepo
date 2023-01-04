package frameworks1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Personal_Loan
{
	@Test(groups = "smoke")
	public void personal_loan()
	{
		System.out.println("personal loan");
		}
	@AfterSuite
	public void after_suite()
	{
		System.out.println("after suite");
	}
	@AfterTest
	public void after_test()
	{
		System.out.println("after test");
		}
	
}
