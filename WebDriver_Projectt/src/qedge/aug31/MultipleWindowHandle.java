package qedge.aug31;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindowHandle {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//click all links and generate window id's of child windows
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		
		Set<String> all_wins = driver.getWindowHandles();
		System.out.println(all_wins);
		
		for (String each : all_wins) {
			
			if(!parent.equals(each)) {
				Thread.sleep(1000);
				driver.switchTo().window(each);
				String pagetitle = driver.getTitle();
				System.out.println(pagetitle);
				Thread.sleep(2000);
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		Select yearlistbox = new Select(driver.findElement(By.id("day")));
		List<WebElement> all_items = yearlistbox.getOptions();
		System.out.println(all_items.size());
		
		for (WebElement each : all_items) {
			
			Thread.sleep(200);
			System.out.println(each.getText());
			
		}
		
		
		
		driver.quit();

	}

}
