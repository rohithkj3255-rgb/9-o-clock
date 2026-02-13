package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class QAfoxwindow {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://omayo.blogspot.com/");
String parentwindow=driver.getWindowHandle();
String actualtitle =driver.getTitle();
        System.out.println("parentwindow-" + driver.getTitle());
        Assert.assertEquals(actualtitle,"omayo (QAFox.com)");
driver.findElement(By.id("link2")).click();
Thread.sleep(50000);

        String text = driver.findElement(By.id("header")).getText();
        System.out.println("Text on child window: " + text);

        System.out.println("switched window");
        Set<String> window=driver.getWindowHandles();
        for(String childwindow:window){
            if(!childwindow.equals(parentwindow)){
                System.out.println("switched to child window");
               driver.switchTo().window(childwindow);
               Thread.sleep(2000);
                System.out.println("Text on child window: " + text);
                driver.close();
                driver.switchTo().window(parentwindow);


            }
        }

        driver.quit();


    }
}

