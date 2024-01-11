package Assertiontest.Assertiontest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void a ()
  {
	  String a="Swarali";
	  String b="Sagar";
	  Assert.assertEquals(a,b,"a and b are not equals ,tc is failed");
	  Assert.assertNotNull(a, "a is null");
	  
  }
  @Test
  public void c() {
	  String g=null;
	  Assert.assertNull(g);
  }
}
