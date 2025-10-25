package qedge.aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    driver.navigate().to("https://www.google.com/");
	    System.out.println("PageTitle[1]  "+ driver.getTitle());
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.linkText("Gmail")).click();
	    System.out.println("PageTitle[2]  "  + driver.getTitle());
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().back();
	    System.out.println("PageTitle[3]   " +  driver.getTitle());
	    Thread.sleep(5000);
	    
	    driver.navigate().forward();
	    System.out.println("PageTitle[4]  " + driver.getTitle());
	    
	    Thread.sleep(5000);
	    
	    
	    driver.navigate().refresh();
	    Thread.sleep(5000);
	    
	    driver.quit();
		

	}

}
