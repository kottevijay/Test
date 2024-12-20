package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static WebDriver driver;
	
	public static void main(String[] args) 
	
	{
		driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Hyderabad");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Goa");
		
		//driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		//WebElement date = driver.findElement(By.xpath("//div[@class='sc-kAzzGY jiFglw']"));
		//date.click();
		driver.findElement(By.xpath("//div[@class='sc-kAzzGY jiFglw']")).click();
		driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]")).click();
		String date = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]")).getAttribute("innerHTML");
		System.out.println(date);
		
		
	}

	

}
