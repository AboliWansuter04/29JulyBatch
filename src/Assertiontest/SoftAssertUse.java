package Assertiontest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void f() {
	  
	  String x="hii";
	  String y="Hello";
	  SoftAssert s1=new SoftAssert();
	  
	  s1.assertEquals(x, y,"x and y are not equals");
	  
	  s1.assertNull(x,"x is not null");
	  
	  s1.assertAll();
  }
  
  @Test
  public void m() {
	  String x=null;
	  SoftAssert s2=new SoftAssert();
	  s2.assertNull(x,"x is not null" );
	  s2.assertAll();
  }
}
