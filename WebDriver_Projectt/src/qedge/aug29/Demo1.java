package qedge.aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys("admin");
		
		String username1 = username.getAttribute("value");
		System.out.println(username1);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		
		String password1 = password.getAttribute("value");
		System.out.println(password1);
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(5000);
		
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		
		if(Actual.contains(Expected))
				{
			           System.out.println("Login is success:::"+Expected+"    "+Actual);
				}
		else
		{
			String txt = driver.findElement(By.id("spanMessage")).getText();
			System.out.println(txt + "  " + Expected + "   " + Actual);
		}
		
		driver.quit();

	}

}
