package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitios {
WebDriver driver;
WebElement ele;
    @Given("^User is on the Login Page$")
    public void user_is_on_the_login_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhanaraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("login page displayed");
       
    }

    @When("^User clicks on Login by entering username and password$")
    public void user_clicks_on_login_by_entering_username_and_password() throws Throwable {
    	driver.findElement(By.name("username")).sendKeys("Admin");
    	driver.findElement(By.name("password")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	System.out.println("login performed");
        
    }

    @Then("^Login should be successful$")
    public void login_should_be_successful() throws Throwable {
    	 ele=driver.findElement(By.xpath("//img[@alt='profile picture']/following-sibling::p"));
    	boolean isDisplayed=ele.isDisplayed();
    	System.out.println(ele.getText());
    	if(isDisplayed==true) {
    		System.out.println("Login successful");
    	}
    	else
    	{
    		System.out.println("login unsuccessful");
    	}
     
    }

    @And("^Username is displayed$")
    public void username_is_displayed() throws Throwable {
    	ele.click();
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("logout successful");
        driver.quit();
    }

}