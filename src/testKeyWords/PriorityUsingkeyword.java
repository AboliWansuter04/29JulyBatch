package testKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUsingkeyword {
  @Test//(dependsOnMethods = {"c","d"})
  public void a() 
  {
	  Reporter.log("TestClass a is running", true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("Testclass b is running", true);
  }
  @Test(dependsOnMethods = {"a"})
  public void c() 
  {
	  Reporter.log("Testclass c is running",true);	  
  }
  @Test
  public void d() 
  {
	  Reporter.log("Testclass d is running", true);
  }
}
