package testKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationcountKeywordTest {
  @Test//(invocationCount = 4)
  public void a()
  {
	  Reporter.log("TestClass a is running", true);
  }
  @Test//(invocationCount = 5)
  public void b()
  {
	  Reporter.log("TestClass b is running", true);
  }
  @Test(invocationCount = 3)
  public void c()
  {
	  Reporter.log("TestClass c is running", true);
  }
}
