package qedge.aug31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_items {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		String Expected_Item = "baby";
		boolean Item_Exist = false;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println(all_items.size());
		
		for (WebElement each : all_items) {
			
			String Actual_Items = each.getText();
			Thread.sleep(500);
			System.out.println(Actual_Items);
			if(Actual_Items.equalsIgnoreCase(Expected_Item))
			{
				Item_Exist = true;
				break;
			}
			
		}
		if(Item_Exist)
		{
			System.out.println(Expected_Item+ "   " + " Item exist in listbox");
			
			
		}
		else
		{
			System.out.println(Expected_Item+ "   " + " Item not exist in listbox");
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
