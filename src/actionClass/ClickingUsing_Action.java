package actionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickingUsing_Action {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//driver.findElement(By.name("login")).click();
	WebElement loginButton =driver.findElement(By.name("login")) ;
	
	Actions act=new Actions(driver);
	//act.moveToElement(loginButton).perform();
	//act.click().perform();
	//act.moveToElement(loginButton).click().build().perform();
	
		act.click(loginButton).perform();

		

	}

}
