package qedge.feb13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsXpath {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[contains(@id,'u_0_')])[4]")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
