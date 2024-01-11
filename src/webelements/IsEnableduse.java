package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableduse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNumber")).sendKeys("9856741256");
		boolean result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		System.out.println("get OTP button status is "+result);
	}

}
