package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goibibo {

public static WebDriver driver;
		
public static void main(String[] args) 
		
		{
			driver = new ChromeDriver();
			//WebDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			driver.get("https://www.goibibo.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/header/ul/li[1]/a/span[2]")).click();
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/ul/li[2]/span")).click();
			
			
			WebElement from = driver.findElement(By.className("sc-12foipm-2 eTBlJr fswFld"));
			from.sendKeys("Hyd");
					
			WebElement to = driver.findElement(By.id("dest"));
			to.sendKeys("Goa");
			
			List<WebElement> months = driver.findElements(By.className("sc-12foipm-8 eXKWBG fswDownArrow"));
			System.out.println(months.size());
			
			/*WebElement monthNav = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[3]"));
			Actions builder = new Actions (driver);
			builder.moveToElement(monthNav).click().build().perform();
			builder.moveToElement(monthNav).click().build().perform();
					*/
		}

		

	}
