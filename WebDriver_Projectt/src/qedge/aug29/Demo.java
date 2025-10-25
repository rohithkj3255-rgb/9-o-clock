package qedge.aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		String forgotpass = driver.findElement(By.linkText("Forgotten password?")).getText();
		System.out.println(forgotpass);
		
		String forgotpass1 = driver.findElement(By.linkText("Forgotten password?")).getAttribute("href");
		System.out.println(forgotpass1);
		
		driver.quit();

	}

}
