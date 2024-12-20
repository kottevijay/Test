package ActionsandJavaScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://snapdeal.in");
		driver.manage().window().maximize();
		

	}

}
