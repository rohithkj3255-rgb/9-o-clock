package google;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
    public static void main (String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
       // WebElement enteremail= (WebElement) jse.executeScript("return document.getElementById('email');");
        //enteremail.sendKeys("Alekya");
        jse.executeScript("document.getElementById('email').value='Alekya';");
        //jse.executeScript("document.getElementById('loginbutton').click();");
        jse.executeScript("document.getElementById('email').style.border='5px red Solid';");
        jse.executeScript("document.getElementById('pageFooter').scrollBy(0,200);");
       jse.executeScript("document.getElementById('pageFooter').scrollIntoView();");

    }

}
