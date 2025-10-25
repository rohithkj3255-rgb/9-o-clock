package qedge.Sep1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action_Handling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com//");
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']")));
		ac.click().perform();
		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(200);
			ac.sendKeys(Keys.ARROW_UP).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		
		
		driver.findElement(By.name("firstName")).sendKeys("Simon");
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Next']")));
		ac.click().perform();
		
		Thread.sleep(5000);
		
		Select listbox = new Select(driver.findElement(By.xpath("//div[@id='month']//div[@role='combobox']//div")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println(all_items.size());
		
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
