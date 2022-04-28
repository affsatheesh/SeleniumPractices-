package Practices;

import com.google.zxing.NotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class WindowHandling {

    public static WebDriver driver;

    public static void main(String[] arg) throws IOException, NotFoundException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        windowHandlings();
    }

    public static void windowHandlings() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your')]")).sendKeys(selectLinkOpeninNewTab);
        Set<String> window = driver.getWindowHandles();
        for (String win : window) {
            System.out.println(win);
            String title = driver.switchTo().window(win).getCurrentUrl();
            System.out.println(title);
            if (title.contentEquals("https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode")) {
                driver.close();
                break;
            }
        }
    }
}
