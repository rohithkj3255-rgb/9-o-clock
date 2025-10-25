package qedge.feb13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.location='https://www.amazon.in/'");
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.partialLinkText("About Amaz"));
		
		js.executeScript("document.scrollIntoView",element);
		element.click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
