package stepDefinitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation 
{
	protected WebDriver driver;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() 
	{
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("the user enters {string} into the username field")
	public void the_user_enters_into_the_username_field(String userName) 
	{
	   driver.findElement(By.id("username")).sendKeys(userName);
	   
	}

	@When("the user enters {string} into the password field")
	public void the_user_enters_into_the_password_field(String password) 
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("the user clicks the Submit button")
	public void the_user_clicks_the_submit_button() 
	{
	    driver.findElement(By.id("submit")).click();
	}

	@Then("the new page URL should contain {string}")
	public void the_new_page_url_should_contain(String url) 
	{
	  Assert.assertEquals(driver.getCurrentUrl(), url);
	  
	}

	@Then("the new page should display text containing {string}")
	public void the_new_page_should_display_text_containing(String expected) 
	{
	   String actual = driver.findElement(By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged i')]")).getText();
		Assert.assertEquals(actual, expected); 
	}

	@Then("the Log out button should be visible on the new page")
	public void the_Log_out_button_should_be_visible_on_the_new_page() 
	{
	   driver.findElement(By.xpath("//a[normalize-space()='Log out']")).isDisplayed();
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() 
	{
	   boolean actualError = driver.findElement(By.xpath("//div[@id='error']")).isDisplayed();
	   Assert.assertEquals(actualError, true);
	}

	@Then("the error message text should be {string}")
	public void the_error_message_text_should_be(String expectedErrText) 
	{
		String actualErrText = driver.findElement(By.xpath("//div[@id='error']")).getText();
		Assert.assertEquals(actualErrText, expectedErrText);
	}
	
}
