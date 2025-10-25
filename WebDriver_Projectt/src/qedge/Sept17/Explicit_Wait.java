package qedge.Sept17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		//Create new account wait until create my account is clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		driver.findElement(By.linkText("Create new account")).click();
		
		//First name
		mywait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Rohith");

	}

}
