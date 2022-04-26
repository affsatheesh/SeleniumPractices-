package Practices;

import com.google.zxing.NotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;

public class Selectable {


    public static WebDriver driver;

    public static void main(String[] arg) throws IOException, NotFoundException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        selectable();
    }

    public static void selectable() {
        driver.get("http://www.leafground.com/pages/selectable.html");
        List<WebElement> lists = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
//        for (WebElement ele : lists) {
//            ele.click();
//        }
        int selectsize = lists.size();
        System.out.println(selectsize);
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(lists.get(0))
                .click(lists.get(1))
//                .click(lists.get(3))
//                .click(lists.get(4))
//                .click(lists.get(5))
//                .click(lists.get(6))
                .build().perform();

        action.clickAndHold(lists.get(4)).build().perform();

    }
}
