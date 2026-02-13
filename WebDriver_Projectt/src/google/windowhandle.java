package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowhandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/pages/navigation/windows-names/");
        String parentwindow=driver.getWindowHandle();
        driver.findElement(By.id("gobasicajax")).click();
        Set<String> windowhandle=driver.getWindowHandles();
        for(String window:windowhandle){
            if(!window.equals(parentwindow)){
                System.out.println(driver.getTitle());
                driver.findElement(By.id("window-name-button")).click();

            }
        }
        driver.switchTo().window(parentwindow);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
