package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Logicalframework {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
String Actualurl=driver.getCurrentUrl();
Assert.assertEquals(Actualurl,"https://www.google.com/");
driver.findElement(By.id("APjFqb")).click();
driver.findElement(By.id("APjFqb")).sendKeys("API");
List<WebElement> list= driver.findElements(By.xpath("//div[@class='OBMEnb']//ul/li//div[@class='wM6W7d']"));
for( WebElement listed:list){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    String name=listed.getText();
    System.out.println(name);
    if(name.contains("api full form")){
        listed.click();
        Thread.sleep(2000);
        System.out.println("Clicked");
        Thread.sleep(2000);
        break;
    }

        }




    }
}
