package serialandparallel;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SerialandParallelUsing {
  @Test
  public void a()
  {
	  Reporter.log("a is running", true);
  }
  @Test
  public void b()
  {
	  Assert.fail();
	  Reporter.log("b is running", true);
  }
  @Test
  public void c()
  {
	  Assert.fail();
	  Reporter.log("c is running", true);
  }
  @Test
  public void d()
  { Assert.fail();
	  Reporter.log("d is running", true);
  }
  @Test
  public void e()
  { Assert.fail();
	  Reporter.log("e is running", true);
  }
}
