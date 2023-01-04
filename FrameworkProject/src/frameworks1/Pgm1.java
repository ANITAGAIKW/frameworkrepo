package frameworks1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pgm1 
{
	WebDriver driver;
	@Test (priority=1)
	public void launchOrangeHRM()
	{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test (priority=0)
	public void LaunchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhanaraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
	@Test (priority=3)
	public void verifyHome()
	{
	boolean isDisplayed = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).isDisplayed();
	if(isDisplayed==true)
	{
	System.out.println("Successfully landed on homepage");
	}
	else
	System.out.println("Fail:Homepage not displayed");
	}
	@Test (priority=2)
	public void doLogin()
	{
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
