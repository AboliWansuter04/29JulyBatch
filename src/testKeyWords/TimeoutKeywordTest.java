package testKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeywordTest
{
  @Test(timeOut = 7000)
  public void salary() throws InterruptedException
  {
	  Thread.sleep(100);
	  Reporter.log("Salary is done", true);
  }
}
