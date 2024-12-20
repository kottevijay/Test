package seleniumBrowser;

public class TC003 extends BaseTest

{

	public static void main(String[] args) throws Exception
	{
	    init(null);
		launch("chromebrowser");
		navigateUrl("amazonurl");
		selectDropDown("amazondropbox_id", "Books");

	}

}
