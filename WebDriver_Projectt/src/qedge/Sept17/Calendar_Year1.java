package qedge.Sept17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Year1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		String doj = "12/02/2027";
		String temp[]=doj.split("/");
		String date=temp[0];
		String month=temp[1];
		String year =temp[2];
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("praven@qedgetech.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='search-date']")).click();
		
		String CalYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!CalYear.equals(year))
			
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			CalYear =driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		
		String CalMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!CalMonth.equalsIgnoreCase(month))
			
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			CalMonth =driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		for (WebElement each : rows) {
			
			List<WebElement> cols = each.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				
				if(eachcell.getText().equals(date))
				{
					Thread.sleep(5000);
					eachcell.click();
				}
				
			}
			
		}
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
