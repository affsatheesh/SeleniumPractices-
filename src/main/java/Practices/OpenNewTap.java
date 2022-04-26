package Practices;

import com.google.zxing.NotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class OpenNewTap {


    public static WebDriver driver;

<<<<<<< HEAD
    public static void main(String [] arg) throws IOException, NotFoundException, InterruptedException {
=======
    public static void main(String[] arg) throws IOException, NotFoundException, InterruptedException {
>>>>>>> e5b114db44a386b410536de09c3b50eccf4bef36
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        OpenNewTaps();
    }
<<<<<<< HEAD
    
    public static void OpenNewTaps()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
=======

    public static void OpenNewTaps() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
>>>>>>> e5b114db44a386b410536de09c3b50eccf4bef36
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your')]")).sendKeys(selectLinkOpeninNewTab);
    }
}
