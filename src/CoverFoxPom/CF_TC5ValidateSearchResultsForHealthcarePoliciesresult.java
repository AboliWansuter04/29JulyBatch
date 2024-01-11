package CoverFoxPom;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import coverFoxBaseClass.BaseClassUsing;
import coverFoxUtilityClass.utiltityClass;
import coverfox.CoverFoxHealthPlan;




public class CF_TC5ValidateSearchResultsForHealthcarePoliciesresult extends BaseClassUsing 
{
	
	CoverFoxHomePageTest1 home; 
	CoverFoxHealthPlan healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxCombinedResultsHealthInPageTest1 result;
	
	@BeforeClass
	
	public void launchBrowser() throws InterruptedException
	{
	launchCoverFox();
	 home = new CoverFoxHomePageTest1(driver);
	healthPlan= new CoverFoxHealthPlan(driver);
	addressDetails= new CoverFoxAddressDetailsPage(driver);
	memberDetails= new CoverFoxMemberDetailsPage(driver);
	result= new CoverFoxCombinedResultsHealthInPageTest1(driver);

	}
	
	@BeforeMethod
	public void enterMemeberDeatils() throws InterruptedException,
	EncryptedDocumentException, IOException
	{
	Reporter.log("clicking on gender button ", true);
	
	home.clickOnFemaleButton();
	Thread.sleep(1000);
	
	Reporter.log("clicking on next button ", true);
	healthPlan.clickOnNextButton();
	Thread.sleep(1000);
	
	Reporter.log("Handeling age drop down ", true);

	memberDetails.hanldeAgeDropDown(utiltityClass.readDataFromExcel(1, 0));
	Reporter.log("Clicking on next button ", true);
	memberDetails.clickOnNextButton();
	Thread.sleep(1000);
	
	Reporter.log("Entering pin code ",true);
	addressDetails.enterPinCode(utiltityClass.readDataFromExcel(1, 1));
	Reporter.log("Entering mobile num ",true);
	addressDetails.enterMobNum(utiltityClass.readDataFromExcel(1, 2));
	Reporter.log("Clicking on continue button ", true);
	addressDetails.clickOnContinueButton();
	Thread.sleep(1000);
	}  
	
	
    @Test
	public void validateTestPlansFromTextAndBanners() throws InterruptedException,
	IOException
	{
	Thread.sleep(5000);
	Reporter.log("Fetching number of results from text ", true);
	int textResult = result.availablePlanNumberFromText();
	Thread.sleep(7000);
	Reporter.log("Fetching number of results from Banners ", true);
	int bannerResult = result.availablePlanNumberFromBanners();
	Thread.sleep(1000);
	Assert.assertEquals(textResult, bannerResult,"Text results are notmatching with Banner results, TC is failed");
	Reporter.log("TC is passed ", true);
	utiltityClass.takeScreenShot(driver, "CF_TC555");

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	Thread.sleep(3000);
	CoverFox();
	}
	
		
	}

