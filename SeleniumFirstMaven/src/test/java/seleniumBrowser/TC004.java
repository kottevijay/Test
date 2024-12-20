package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC004 extends BaseTest

{

	public static void main(String[] args) throws Exception
	
	{
		//locators
		init(null);
		launch("chromebrowser");
		navigateUrl("amazonurl");
		
		selectDropDown("amazondropdown_id", "Amazon Fresh");
		
		typeText("amazonsearchtextfield_id", "milk");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Amazon Fresh");;
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		dropdown.sendKeys("Amazon Fresh");
		driver.findElement(By.name("field-keywords")).sendKeys("milk");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();*/
		
		
		
	}

	

}
