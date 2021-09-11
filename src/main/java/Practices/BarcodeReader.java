package Practices;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BarcodeReader {
    public static WebDriver driver;

    public static void main(String [] arg) throws IOException, NotFoundException, InterruptedException {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        myProjectQRCode();

    }

    public static void normalQR() throws NotFoundException, IOException {
        driver.get("https://barcode.tec-it.com/en/?data=sathez%20sk");
        String qrCodeImage = driver.findElement(By.tagName("img")).getAttribute("src");
        String res = decodeQRCode(qrCodeImage);
        System.out.println(res);
    }

    public static void myProjectQRCode() throws NotFoundException, IOException, InterruptedException {
        driver.get("https://skoolgo.pixelmindit.com:6300/#/");
        driver.findElement(By.id("userName")).sendKeys("admin@pixel.com");
        driver.findElement(By.id("password")).sendKeys("sk12345");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(5000);
        WebElement Element= driver.findElement(By.xpath("//p[text()='Backup and Restore']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
        WebElement Info= driver.findElement(By.xpath("//p[text()='Information']"));
        WebElement addbranch= driver.findElement(By.xpath("//a[text()='Add Branch']"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.moveToElement(Info).click().build().perform();
        action.doubleClick(addbranch).build().perform();
        Thread.sleep(3000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1500)");

        WebElement eyebutton = driver.findElement(By.xpath("//span[@class='bg-info action-icon pointer']"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click();", eyebutton);
        Thread.sleep(3000);
        String qrCodeImage  =driver.findElement(By.tagName("svg")).getAttribute("shape-rendering");
      //  String qrCodeImage = driver.findElement(By.tagName("img")).getAttribute("src");
        String res = decodeQRCode(qrCodeImage);
        System.out.println(qrCodeImage);
        System.out.println(res);
    }


    private static String decodeQRCode(String qrCodeImage) throws IOException, NotFoundException {
        URL url = new URL(qrCodeImage);
        BufferedImage bufferedImage = ImageIO.read(url);
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result = new MultiFormatReader().decode(bitmap);
        return result.getText();
    }
}
