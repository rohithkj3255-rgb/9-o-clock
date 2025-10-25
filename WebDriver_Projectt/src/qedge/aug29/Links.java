package qedge.aug29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rediff.com/");
		
		Thread.sleep(5000);
		
		
		
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println(all_links.size());
		
		for (WebElement each : all_links) {
			
			Thread.sleep(200);
			System.out.println(each.getText());
			
		}
		
		driver.quit();
		
		

	}

}
