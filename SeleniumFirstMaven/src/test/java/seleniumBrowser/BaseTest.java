package seleniumBrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public static WebDriver driver;
	public static File f;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	public static Properties orProp;
	
	
	public static void init(String browserType) throws Exception  //Initializing & loading file
	{
		f = new File(".\\src\\test\\resources\\data.properties"); 
		//. takes current project working directory
		fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		//String e= p.getProperty ("flipkarturl");
		//System.out.println(e);
		
		f = new File(".\\src\\test\\resources\\environment.properties");
		fis = new FileInputStream(f);
		mainProp= new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		f = new File(".\\src\\test\\resources\\"+e+".properties");
		fis = new FileInputStream(f);
		childProp = new Properties();
		childProp.load(fis);
		String val = childProp.getProperty("amazonurl");
		System.out.println(val);
		
		
		f = new File(".\\src\\test\\resources\\or.properties");
		fis = new FileInputStream(f);
		orProp = new Properties();
		orProp.load(fis);
		
	}
 
	public static void launch(String browserType)
	{
		if (p.getProperty(browserType).equals("chrome"))   
				{
			driver = new ChromeDriver();
			
				}
		else if (p.getProperty(browserType).equalsIgnoreCase("Firefox"))
				{
					driver =new FirefoxDriver();
				
				}
		else if (p.getProperty(browserType).equalsIgnoreCase("Edge"))
				{
					driver = new EdgeDriver();
					
				}
		 
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(childProp.getProperty(url));
	}
	
	
	public static void clickElement(String locatorKey) 
	{
		getLocator(locatorKey).click();
		//driver.findElement(By.xpath(orProp.getProperty(locatorKey))).click();		
	}

	
	public static boolean isElementPresent(String locatorKey) 
	{
		try {
			WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			Wait.until(ExpectedConditions.presenceOfElementLocated(locator(locatorKey)));
			/*if(locatorKey.endsWith("id"))
			{
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_name"))
			{
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_classname")) 
			{
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orProp.getProperty(locatorKey))));	
			}else if(locatorKey.endsWith("_xpath"))
			{
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_css"))
			{
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_linktext"))
			{
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_partiallinktext"))
			{
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(orProp.getProperty(locatorKey))));
			}*/
			return true;
			
		} 
		
		catch (Exception e)
		{
			return false;
		}
				
	}

	public static void typeText(String locatorKey, String text) 
	{
		getLocator(locatorKey).sendKeys(text);
		//driver.findElement(By.name(orProp.getProperty(locatorKey))).sendKeys(text);		
	}

	public static void selectDropDown(String locatorKey, String option) 
	{
		getLocator(locatorKey).sendKeys(option);
		//driver.findElement(By.id(orProp.getProperty(locatorKey))).sendKeys(option);
		
	}

	public static WebElement getLocator(String locatorKey) 
	{
		WebElement element = null;
		if(!isElementPresent(locatorKey))
			System.out.println("Element is Not Present");
		element = driver.findElement(locator(locatorKey));
		/*if(locatorKey.endsWith("_id"))
		{
			element = driver.findElement(By.id(orProp.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_name")) 
		{
			element = driver.findElement(By.name(orProp.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_xpath")) 
		{
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_css")) 
		{
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_linktext")) 
		{
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_partiallinktext")) 
		{
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}*/
		return element;
		}
	
	public static By locator(String locatorKey)
	{
		By by = null;
		if(locatorKey.endsWith("_id"))
		{
			by=By.id(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_name"))
		{
			by=By.name(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_classname"))
		{
			by=By.className(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_xpath"))
		{
			by=By.xpath(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_css"))
		{
			by=By.cssSelector(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_linktext"))
		{
			by=By.linkText(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_partiallinktext"))
		{
			by=By.partialLinkText(orProp.getProperty(locatorKey));
		}
		return by;
	}
}
 