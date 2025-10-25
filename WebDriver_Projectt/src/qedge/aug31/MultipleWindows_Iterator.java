package qedge.aug31;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows_Iterator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com//");
		Thread.sleep(5000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
	     
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		
		Object[] windowhandles = driver.getWindowHandles().toArray();
		
		//mail page
		driver.switchTo().window((String) windowhandles[0]);
		Thread.sleep(5000);
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	
		//help page
		driver.switchTo().window((String) windowhandles[1]);
		Thread.sleep(5000);
		String pagetitle1 = driver.getTitle();
		System.out.println(pagetitle1);
		driver.close();
		
		//terms page
		driver.switchTo().window((String) windowhandles[3]);
		Thread.sleep(5000);
		String pagetitle3 = driver.getTitle();
		System.out.println(pagetitle3);
		driver.close();
		
		//privacy page
		driver.switchTo().window((String) windowhandles[2]);
		Thread.sleep(5000);
		String pagetitle4 = driver.getTitle();
		System.out.println(pagetitle4);
		
		driver.close();
		
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
