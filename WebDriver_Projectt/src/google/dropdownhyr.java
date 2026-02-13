package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dropdownhyr {
public static void main (String[] args){
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
   WebElement Staticdropdown = driver.findElement(By.id("course"));
   Select dropdown = new Select(Staticdropdown);
   dropdown.selectByValue("java");
    Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Java");
    WebElement dynamicdropdown = driver.findElement(By.id("ide"));
    Select multidropdown = new Select(dynamicdropdown);
    multidropdown.selectByVisibleText("IntelliJ IDEA");
Assert.assertEquals(multidropdown.getFirstSelectedOption().getText(),"IntelliJ IDEA");
multidropdown.selectByIndex(2);
    List<WebElement>  Selectedoption= multidropdown.getAllSelectedOptions();

    List<String> actual = new ArrayList<>();
    for(WebElement option:Selectedoption){
        actual.add(option.getText());
    }
List<String> expected= Arrays.asList("IntelliJ IDEA","Visual Studio");
    Assert.assertEquals(actual,expected);
}

}
