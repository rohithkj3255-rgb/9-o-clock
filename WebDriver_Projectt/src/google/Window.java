package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Window {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //single window
        String parentwindow=driver.getWindowHandle();
        System.out.println("parentwindow-" + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //child window
        driver.findElement(By.id("newWindowBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Set<String> windowhandles=driver.getWindowHandles();
        for(String handle:windowhandles){
            if(!handle.equals(parentwindow)){
                driver.switchTo().window(handle);
                System.out.println("switched to child window");
               // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
                driver.findElement(By.id("firstName")).sendKeys("Alekya");
                //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
                driver.findElement(By.id("lastName")).sendKeys("Gobburi");
                driver.findElement(By.id("registerbtn")).click();
                String actualmsg=driver.findElement(By.id("msg")).getText();
                Assert.assertEquals(actualmsg,"Registration is Successful");

            }
        }
        driver.switchTo().window(parentwindow);
        driver.findElement(By.id("name")).sendKeys("Ramesh");
        driver.quit();

    }
}
