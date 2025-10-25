package qedge.aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxes {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		
		
		
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		boolean element = daylistbox.isMultiple();
		System.out.println(element);
		
		Select monthlistbox  = new Select(driver.findElement(By.id("month")));
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		
		daylistbox.selectByVisibleText("1");
		Thread.sleep(2000);
		monthlistbox.selectByVisibleText("Jun");
		Thread.sleep(2000);
		yearlistbox.selectByVisibleText("1975");
		Thread.sleep(2000);
		
		daylistbox.selectByIndex(5);
		System.out.println(daylistbox.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		
		monthlistbox.selectByIndex(9);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		yearlistbox.selectByIndex(75);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		
		Thread.sleep(5000);
		
		
		
		driver.quit();
		
		

	}

}
