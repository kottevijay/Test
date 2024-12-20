package seleniumBrowser;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class TC005 extends BaseTest

{
	public static void main(String[] args) throws Exception 
		
	{
		init(null);
		launch("chromebrowser");
		navigateUrl("amazonurl");
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		//driver.findElement((By.className("nav-input nav-progressive-attribute"))).click();
		//class property may not be unique always as in above case.
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.cssSelector("#nav-search-bar-form > div.nav-right > div")).click();
		//css selector is faster than xpath
		//driver.findElement(By.linkText("Best Sellers")).click();
		driver.findElement(By.partialLinkText("Best Seller")).click();
		//partiallinktext is used for dynamic links and linktext is used for static links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
			
		}
		
		}
	}

	
	