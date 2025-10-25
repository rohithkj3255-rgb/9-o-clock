package qedge.feb13;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https:/flipkart.com'");
		
		Thread.sleep(5000);
		
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
		String strurl = js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		
		String pagedomain = js.executeScript("return document.domain").toString();
		System.out.println(pagedomain);
		System.out.println(pagedomain.length());
		
		Thread.sleep(5000);
		driver.quit();

	}

}
