package TestNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HostGator {
	
	public static WebDriver driver;
	public static Actions a;

	public static void main(String[] args) 
	
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.hostgator.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//*[@id=\"mobile-nav\"]/ul/li[6]"));
		a.moveToElement(e).perform();
		driver.findElement(By.className("hg-win-dedi")).click();
	
		
		
	}

}
