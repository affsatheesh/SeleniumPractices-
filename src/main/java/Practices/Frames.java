package Practices;

import com.google.zxing.NotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Frames {


    public static WebDriver driver;

    public static void main(String[] arg) throws IOException, NotFoundException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        frameHandling();
    }

    public static void frameHandling() {
        driver.get("http://www.leafground.com/pages/frame.html");
//        driver.switchTo().frame(0);
//        WebElement iframe1 = driver.findElement(By.xpath("//button [@id='Click']"));
//        iframe1.click();
//        String frameDetails = iframe1.getText();
//        System.out.println("first frame details : " + frameDetails);
//        driver.switchTo().defaultContent();

//        driver.switchTo().frame(1);
//        driver.switchTo().frame("frame2");
//        WebElement iframe2 = driver.findElement(By.xpath("//button[@id='Click1']"));
//        iframe2.click();
//        String frameDetails2 = iframe2.getText();
//        System.out.println("second frame details : " + frameDetails2);
//        driver.switchTo().defaultContent();

        WebElement tagnameDetails = driver.findElement(By.tagName("iframe"));
        System.out.println(tagnameDetails);
        driver.close();
    }
}
