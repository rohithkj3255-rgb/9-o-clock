package qedge.aug31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection_Listbox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rohit/Downloads/MultiListboxHtmlpage_lyst1738761742773.html");
		Thread.sleep(5000);
		
		Select multilistbox = new Select(driver.findElement(By.name("multiSelection")));
		boolean variable = multilistbox.isMultiple();
		
		for(int i=0;i<=8;i++)
		{
			Thread.sleep(200);
			multilistbox.selectByIndex(i);
		}
		List<WebElement> Selected_items = multilistbox.getAllSelectedOptions();
		System.out.println(Selected_items.size());
		
		for (WebElement each : Selected_items) {
			
			Thread.sleep(200);
			System.out.println(each.getText());
			
		}
		
		multilistbox.deselectByVisibleText("Yellow");
		Thread.sleep(2000);
		multilistbox.deselectByVisibleText("Red");
		Thread.sleep(2000);
		multilistbox.deselectAll();
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
