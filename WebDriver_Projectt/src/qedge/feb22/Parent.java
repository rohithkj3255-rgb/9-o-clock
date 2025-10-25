package qedge.feb22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {

	public static WebDriver driver;
	
	public static void launchURL(String url)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public static void adminlogin(String username,String password)
	{
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
	}
	
	public static void quit()
	{
		driver.quit();
	}
	
		
	
		// TODO Auto-generated method stub

	}


