package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

public class LoginPage 
{
	protected WebDriver driver;
	private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("submit");
    private By logoutButton = By.xpath("//a[normalize-space()='Log out']");
    private By loginSuccess = By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged i')]");
  	private By loginError = By.xpath("//div[@id='error']");
    private By errorText = By.xpath("//div[@id='error']");
    
    public LoginPage(WebDriver driver) 
    {
		super();
		this.driver = driver;
	}
	
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(loginButton).click();
    }
    
    public boolean logout() {
        return driver.findElement(logoutButton).isDisplayed();
    }
	
    public String loginSuccess() {
       return driver.findElement(loginSuccess).getText();
    }
    
    public boolean loginError() {
       return driver.findElement(loginError).isDisplayed();
    }

    public String errorText()
    {
    	return driver.findElement(errorText).getText();
    }
}

