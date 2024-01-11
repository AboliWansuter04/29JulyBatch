package TestAnnotations.TestAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1BeforeandafterSuite {

  @Test
  public void testclass1()
  {
	  Reporter.log("tc1 is running", true);
  }
  @Test
  public void testclass2()
  {
	  Reporter.log("tc2 is running", true);
	  
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("before method is running", true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after method is running", true);
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("before class is running", true);
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("after  class is running", true);
	  
  }
  @BeforeTest
  public void beforetest() 
  {
	  Reporter.log("before test is running", true);
  }
  @AfterTest
  public void aftertest() 
  {
	  Reporter.log("after test is running", true);
  }
  @BeforeSuite
  public void beforesuite() 
  {
	  Reporter.log("before suite is running", true);
  }
  @AfterSuite
  public void aftersuite() 
  {
	  Reporter.log("after suite is running", true);
  }
}
