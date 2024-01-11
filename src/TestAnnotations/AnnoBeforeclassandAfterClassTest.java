package TestAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoBeforeclassandAfterClassTest {
  @Test
  public void add1() 
  {
	  Reporter.log("Add1 is run", true);
  }
  @Test
  public void add2() 
  {
	  Reporter.log("Add2 is run ", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("Before method is running", true);
  }
  @AfterMethod
  public void afterMethod() 
  {
	Reporter.log("After method is running", true);  
  }
  @BeforeClass
  public void beforeClass() 
  {
	Reporter.log("Open page is browser", true);  
  }
  @AfterClass
  public void afterClass()
{
	  Reporter.log("Close page is browser", true);
  }
}
