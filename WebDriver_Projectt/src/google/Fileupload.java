package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Fileupload {
    public static void main (String[] args) throws AWTException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        //using Sendkeys
//driver.findElement(By.i'd("uploadfile")).sendKeys("C:\\Users\\rames\\Downloads\\Alekya_Resume_updated.docx");
driver.findElement(By.id("uploadfile")).click();
System.out.println("Clicked");
        //using Robot class
        Robot rb = new Robot();
//put path to file in a clipboard
        StringSelection ss = new StringSelection("C:\\Users\\rames\\Downloads\\Alekya_Resume_updated.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
//CTRL+V
        rb.keyPress(KeyEvent.VK_CONTROL);//press contrl Key
        rb.keyPress(KeyEvent.VK_V);//press contrl Key

        rb.keyPress(KeyEvent.VK_CONTROL);//press contrl Key
        rb.keyPress(KeyEvent.VK_V);//press contrl Key
        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
}
}
