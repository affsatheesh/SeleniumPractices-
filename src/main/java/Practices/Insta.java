package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Insta {

    public static WebDriver driver = null;

    public static void main(String[] arg) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/?hl=en");

        driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']")).sendKeys("6379709559");
        driver.findElement(By.name("password")).sendKeys("02@Timeover");

        driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();

        Thread.sleep(5000);
        driver.navigate().refresh();

        driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']")).click();

        driver.findElement(By.xpath("//a[@class='xWeGp']")).click();

    }
}
