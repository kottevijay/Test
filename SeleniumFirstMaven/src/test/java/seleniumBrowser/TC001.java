package seleniumBrowser;

public class TC001 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		launch("Edge");
		navigateUrl("https://amazon.in");
		driver.manage().window().maximize();
		
		
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 
		 String url = driver.getCurrentUrl(); 
		 System.out.println(url);
		 
		 String p = driver.getPageSource();
		 System.out.println(p);
		 
		 driver.manage().deleteAllCookies();
		 
		 
		 driver.navigate().back();
		 
		 
		 Thread.sleep(4000); //wait for 4 seconds
		 
		 
		 driver.navigate().forward();
		 		 
		 
		 Thread.sleep(4000);
		 
		 
		 driver.navigate().refresh();
		 
		 driver.close();   //closes the current active window
		 driver.quit();    //closes the browser, back end services will also get killed (will not show in task manager)
		 
		 
		 
	}

}
