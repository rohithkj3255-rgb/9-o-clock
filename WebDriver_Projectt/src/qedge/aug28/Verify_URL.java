package qedge.aug28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_URL {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		
		String Expected = "https://";
		String Actual = driver.getCurrentUrl();
		
		if(Actual.contains(Expected))
		{
			System.out.println("URL is Secure::  " +Expected+"    " +Actual);
		}
		else
		{
			System.out.println("URL is not Secure::  " +Expected+"    "+Actual);
		}
		driver.quit();
	}

}
