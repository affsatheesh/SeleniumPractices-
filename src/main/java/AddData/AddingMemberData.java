package AddData;

import com.opencsv.CSVReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddingMemberData extends Helper
{
    public static WebDriver driver = null;
    public static void main(String[] arg) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
          driver.get("https://skoolgo.pixelmindit.com:5700/#/");

        driver.findElement(By.id("userName")).sendKeys("superadmin@pixel.com");
        driver.findElement(By.id("password")).sendKeys("sk12345");
        driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        WebElement Packages = driver.findElement(By.xpath("//p[text()='Members']"));
        WebElement Addpackage = driver.findElement(By.xpath("//a[text()='Old Member Registration']"));
        Actions action = new Actions(driver);
        action = new Actions(driver);
        Thread.sleep(3000);
        action.moveToElement(Packages).click().build().perform();
        action.doubleClick(Addpackage).build().perform();

        String csv_file = "./Data/Data.csv";
        CSVReader reader1 = new CSVReader(new FileReader(csv_file));
        String[] cell = reader1.readNext();
        while ((cell = reader1.readNext()) != null) {
            String fullName = cell[0];
            String Emailid = cell[1];
            String phonenumbers = cell[2];
            String personalid = cell[3];
            String DOB = cell[4];
/*            String Day = cell[4];
            String Month = cell[5];
            String Year = cell[6];*/
            String Nationality = cell[5];
            String Gender = cell[6];
            String Branch = cell[7];
            String Packagename = cell[8];
            String EndDate = cell[9];

            driver.findElement(By.id("fullName")).sendKeys(fullName);
            driver.findElement(By.id("email")).sendKeys(Emailid);
            driver.findElement(By.xpath("//input[@class='PhoneInputInput']")).sendKeys(phonenumbers);
            driver.findElement(By.id("personalId")).sendKeys(personalid);

            Thread.sleep(3000);
            WebElement DOBs = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']"));
            DOBs.click();

            String dd = "dob";
          //  dobAdder(driver,DOB,dd);

            WebElement nationality = driver.findElement(By.id("nationality"));
            Select select = new Select(nationality);
            select.selectByVisibleText(Nationality);

            Thread.sleep(2000);
            WebElement gender = driver.findElement(By.id("gender"));
            Select selectsgender = new Select(gender);
            selectsgender.selectByVisibleText(Gender);

            Thread.sleep(2000);
            WebElement branch = driver.findElement(By.id("branch"));
            Select selectbranch1 = new Select(branch);
            selectbranch1.selectByVisibleText(Branch);
            Thread.sleep(2000);

            WebElement Element = driver.findElement(By.id("Notes"));
            js.executeScript("arguments[0].scrollIntoView();", Element);

            WebElement packageName = driver.findElement(By.id("packageName"));
            Select packageName1 = new Select(packageName);
            packageName1.selectByVisibleText(Packagename);

            Thread.sleep(3000);

            WebElement Enddate = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']//following::input[9]"));
            Enddate.click();
            String ed = "Enddate";
           // dobAdder(driver,EndDate,ed);

            WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-success mx-1 px-4']"));
            JavascriptExecutor executor1 = (JavascriptExecutor) driver;
            executor1.executeScript("arguments[0].click();", submit);
            Thread.sleep(3000);

        }
    }
}

