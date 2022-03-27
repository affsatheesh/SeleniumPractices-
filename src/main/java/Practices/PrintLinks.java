package Practices;

import com.google.zxing.NotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PrintLinks {
   public static WebDriver driver ;

    public static void main(String[] arg) throws IOException, NotFoundException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Tester"+ Keys.ENTER);
        printLinks();
    }
    public static void printLinks() throws FileNotFoundException
    {
        PrintWriter out = new PrintWriter("E:\\AutomationProjects\\SeleniumPractices-\\Notes\\Test.txt");
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        for(WebElement link:alllinks)
        {
           out.println(link.getText() + " - " + link.getAttribute("href"));
        }
        out.close();

    }
}
