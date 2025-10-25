package qedge.aug28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		// get Page source
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		System.out.println(pagesource.length());
		
		driver.quit();

	}

}
