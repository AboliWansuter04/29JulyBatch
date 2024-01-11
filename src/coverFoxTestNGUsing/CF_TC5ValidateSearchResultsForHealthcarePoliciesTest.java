package coverFoxTestNGUsing;

import org.testng.annotations.Test;

import coverfox.CoverFoxHomePage;

import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class CF_TC5ValidateSearchResultsForHealthcarePoliciesTest
{
	
	WebDriver driver; 
 	CoverFoxHomePage home; 
 	CoverFoxHealthPageTestNg healthPlan; 
 	CoverFoxAddressDetialsTestPage addressDetails; 
 	CoverFoxMemberDetailsTestNG memberDetails; 
 	CoverFoxCombinedResultsHealthInPageTest  result; 
 	 
 	@BeforeClass 
 	public void launchBrowser() 
 	{ 
 	 	 driver= new ChromeDriver();  	 	 
 	 	 home= new CoverFoxHomePage(driver);  	 	 
 	 	 healthPlan= new CoverFoxHealthPageTestNg(driver);  	 	 
 	 	 addressDetails= new CoverFoxAddressDetialsTestPage(driver);  	 	 
 	 	 memberDetails= new CoverFoxMemberDetailsTestNG(driver); 
 	 	 result= new CoverFoxCombinedResultsHealthInPageTest(driver); 
 	 	  
 	 	 Reporter.log("Opening browser ", true);  	 	 
 	 	 driver.get("https://www.coverfox.com");  	 	 
 	 	 driver.manage().window().maximize(); 
 	 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
 	 	  
 	 
 	} 
 	 
 	@BeforeMethod 
 	public void enterMemeberDeatils() throws InterruptedException 
 	{ 
	 	Reporter.log("clicking on gender button ", true); 
	 	home.clickOnFemaleButton(); 
	 	Thread.sleep(1000); 
 	 
 	
	 	Reporter.log("clicking on next button ", true);  	
	 	healthPlan.clickOnNextBut2(); 
	 	Thread.sleep(1000); 
 	 

	 	Reporter.log("Handeling age drop down ", true);  	
	 	memberDetails.AgeDropDown("30");  	 	
	 	Reporter.log("Clicking on next button ", true);  	 	
	 	memberDetails.clickOnNextBut2(); 
 	 	Thread.sleep(1000); 
 	 	 
 	 	Reporter.log("Entering pin code ",true);  	 	
 	 	addressDetails.pincodeno("444111");  	 	
 	 	Reporter.log("Entering mobile num ",true);  	 	
 	 	addressDetails.mobno("7709126281");
 	 	Reporter.log("Clicking on continue button ", true); 
 	 	addressDetails.clickonContButton(); 
 	 	Thread.sleep(1000); 
 	}
 	@Test
 	public void validateTestPlansFromTextAndBanners() throws InterruptedException 
  {
	  Thread.sleep(5000); 
	 	Reporter.log("Fetching number of results from text ", true); 
	 	int textResult = result.availablePlanNumberFromText(); 
	 	Thread.sleep(7000); 
	 	Reporter.log("Fetching number of results from Banners ", true);  	 	
	 	int bannerResult = result.availablePlanNumberFromBanners(); 
	 	Thread.sleep(1000); 
	 	Assert.assertEquals(textResult, bannerResult,"Text results are not matching with Banner results, TC is failed"); 
	 	 
	 	Reporter.log("TC is passed ", true); 

  }
  @AfterMethod 
	public void closeBrowser() throws InterruptedException 
	{ 
	 	 Reporter.log("Closing browser ", true); 
	 	Thread.sleep(3000); 
	 	driver.close(); 
	} 

}
