package qedge.aug28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		// get page title and size of title
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
		// get URL and size of URL
		
		String strurl = driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		
		driver.quit();		
		

	}

}
