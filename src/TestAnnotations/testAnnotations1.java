package TestAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAnnotations1 {
  @Test
  public void mymethod1() 
  {
	  Reporter.log("Test case mymethod1 is run", true);
  }
  @Test
  public void mymethod2()
  {
	  Reporter.log("Test case mymethod2 is run ", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Login page is done", true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logout page is done", true);
  }
  
}
