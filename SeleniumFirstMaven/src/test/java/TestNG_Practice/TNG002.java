package TestNG_Practice;

import org.testng.annotations.Test;

import seleniumBrowser.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TNG002 extends BaseTest
{
  
  
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	  init("chromebrowser");
	  navigateUrl("amazonurl");
  }
  
  @Test
  public void amazonTest() 
  {
	  
  }

  @AfterMethod
  public void endProcess()
  {
	  
  }

}
