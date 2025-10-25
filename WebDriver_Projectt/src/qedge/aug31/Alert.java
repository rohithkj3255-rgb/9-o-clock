package qedge.aug31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		
		//get alert text
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		String alertext = driver.switchTo().alert().getText();
		System.out.println(alertext);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
