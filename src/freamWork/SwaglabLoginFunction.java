package freamWork;

import java.awt.Checkbox;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabLoginFunction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		//Thread.sleep(1000);
		
		//CReate object of POM class
		SwagLabsUsingLoginPage ln=new SwagLabsUsingLoginPage(driver);
		ln.enterUserName();
		ln.enterPassword();
		ln.loginButtonClick();
		//Thread.sleep(1000);
		
		SwagInventoryUsing inventory=new SwagInventoryUsing(driver);
		//inventory.addtoshortcart();
		inventory.backpackitem();
		inventory.bikelightitem();
		inventory.addtoshortcart();
		//Thread.sleep(1000);
		
		SwagLabCheck checkout=new SwagLabCheck(driver);
		
		checkout.checkbutton();
		checkout.firstnames();
		checkout.lastname();
		checkout.postalcode();
		checkout.contbuttonclick();
		//Thread.sleep(1000);
		
		
	}

}
