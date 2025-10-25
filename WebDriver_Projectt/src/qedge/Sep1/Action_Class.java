package qedge.Sep1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Selenium openings in hyderabad");
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(2000);
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
