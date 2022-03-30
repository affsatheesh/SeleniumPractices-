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

    public static void main(String[] arg) throws IOException, NotFoundException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        OpenNewTaps();
    }

    public static void OpenNewTaps() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your')]")).sendKeys(selectLinkOpeninNewTab);
    }
}
