package frameworks1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home_Loan 
{
	@Test
	public void home_loan()
	{
		System.out.println("home loan");
		}
	@BeforeTest
	public void before_test()
	{
		System.out.println("before test");
	}
		@Test(groups="sanity")
		public void home_loan1()
		{
			System.out.println("home loan1");
			}
		
	
}
