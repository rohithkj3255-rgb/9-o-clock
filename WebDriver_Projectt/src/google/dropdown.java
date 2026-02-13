package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='withOptGroup']/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        driver.findElement(By.xpath("//div[text()='A root option']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
driver.findElement(By.id("selectOne")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.id("react-select-3-option-0-2")).click();
        WebElement Staticdropdown=driver.findElement(By.id("oldSelectMenu"));
        Select dropdown=new Select(Staticdropdown);
        dropdown.selectByValue("4");
        driver.findElement(By.xpath("//div[text()='Select...']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        driver.findElement(By.xpath("//div[text()='Blue']")).click();



    }
}
