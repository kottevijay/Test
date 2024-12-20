package seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		WebDriver driver = null;
	
		
		driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		driver.get("https://www.amazon.in");
		
		//WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");

	}

}
