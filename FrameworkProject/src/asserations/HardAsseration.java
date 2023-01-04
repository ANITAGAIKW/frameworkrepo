package asserations;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAsseration 
{
WebDriver driver;
String actualTitle;
String expectedTitle;
@BeforeClass
public void LaunchWeb()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhanaraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");


}
@Test
public void assertEqualTest()
{
actualTitle = driver.getTitle();
System.out.println("Actualtitle: " + actualTitle);
expectedTitle = "Google";
Assert.assertEquals(actualTitle, expectedTitle);
System.out.println("After Assertion");
}
@Test
public void assertNotEqualTest() 
{
driver.get("https://www.facebook.com/");
actualTitle = driver.getTitle();
System.out.println("Actualtitle: " + actualTitle);
expectedTitle = "Google";
Assert.assertNotEquals(actualTitle, expectedTitle,"step:failed |");
System.out.println("After Assertion");
}
@Test
public void AssertTrueTest()
{
	driver.get("https://www.google.co.in/");
	WebElement element = driver.findElement(By.className("lnXdpd"));
	boolean isElement = element.isDisplayed();
Assert.assertTrue(isElement,"Element not displayed");
System.out.println("Assert true test");
}
@Test
public void AssertFalseTest() 
{	

Assert.assertFalse(false,"Element not displayed");
System.out.println("Assert false test");
}
@Test
public void AssertNullTest() 
{
driver.get("https://www.facebook.com/");
//boolean isElement = element.isDisplayed();
Assert.assertNull(null,"Element not found");
System.out.println("Assert NULL test");
}
@Test
public void AssertNotNullTest() 
{
	driver.get("https://www.google.co.in/");
WebElement element = null;
try {
element = driver.findElement(By.className("lnXdpd"));
}
catch(NoSuchElementException e)
{
System.out.println("Exception occurred");
}
boolean isElement = element.isDisplayed();
Assert.assertNotNull(isElement,"Element not found");
System.out.println("Assert Not NULL test");
}
@AfterClass
public void closeApp() 
{
driver.quit();
}
}


