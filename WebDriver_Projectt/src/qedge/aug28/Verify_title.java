package qedge.aug28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_title {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		String Expected = "google";
		String Actual = driver.getTitle();
		
		if(Actual.equalsIgnoreCase(Expected))
		{
			System.out.println("Title is matching  ::"+Expected+"   " + Actual);
		}
		else
		{
			System.out.println("Title is not matching  ::"+Expected+"   " + Actual);
		}
		driver.quit();
	}

}
