package seleniumBrowser;

public class TC002 extends BaseTest

{
	
	public static void main(String[] args) throws Exception
	
	{
		
		//launch ("firefox");
		//navigateUrl ("https://www.flipkart.com/");
		
		init(null);
		launch ("edgebrowser");   //key value pair from data prop file
		navigateUrl ("amazonurl");  //key value pair from data prop file
		
		
	}

}
