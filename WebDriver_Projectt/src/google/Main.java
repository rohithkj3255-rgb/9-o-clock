package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        String Selectedproduct = products.get(0).getText();
        System.out.println("Selectedproduct:" + Selectedproduct);
        String splitselectedproduct = Selectedproduct.split("-")[0].trim();
        System.out.println("Selectedproduct:" + splitselectedproduct);
        driver.findElements(By.xpath("//div[@class='product-action']/button")).get(0).click();
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        String cartname = driver.findElement(By.cssSelector("p.product-name")).getText();
        Assert.assertTrue(cartname.contains(splitselectedproduct), "Passed selected product in cart");
        System.out.println("After assertion…");

        System.out.println("product in cart:" + cartname);
        if (cartname.contains(splitselectedproduct)) {
            System.out.println("Pass selected product in the cart");
        } else {
            System.out.println("Failed No selected product in the cart");
        }
    }





    }
