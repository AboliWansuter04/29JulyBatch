package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usegettextmethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		String expresult="Facebook helps you connect and share with the people in your life.";
		
		String actResult=driver.findElement(By.className("_8eso")).getText();
		System.out.println(actResult);
		
		

		if(expresult.equals(actResult))
		{
			System.out.println("Text is matching ,TC is passed");
		}
		else
		{
			System.out.println("Text is not matching ,TC is failed");
		}
		}
	}


