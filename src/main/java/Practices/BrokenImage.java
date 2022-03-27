package Practices;

import com.google.zxing.NotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class BrokenImage {

    public static WebDriver driver;

    public static void main(String[] arg) throws IOException, NotFoundException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver=new ChromeDriver(capabilities);
        brokenImageChcking();
    }

    public static void brokenImageChcking() {
        driver.get("http://www.leafground.com/pages/Image.html");
        WebElement img = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
        if (img.getAttribute("naturalWidth").equals("0")) {
            System.out.println("its broken image");
        }
        else
        {
            System.out.println("its Not broken image");
        }

    }
}


