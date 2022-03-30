package AddData;

import com.opencsv.CSVReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class OldMemberReg extends Helper {
    public static WebDriver driver = null;

    public static void main(String[] arg) throws IOException, InterruptedException, ParseException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        DisableImageChrome(options);
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
        //  driver.get("https://web.jeemgym.com:7000/#/");
        driver.get("https://skoolgo.pixelmindit.com:6100/#/");

        driver.findElement(By.id("userName")).sendKeys("ce@pixelmindit.com");
        driver.findElement(By.id("password")).sendKeys("sk12345");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //  Thread.sleep(8000);
        WebElement Packages = driver.findElement(By.xpath("//p[text()='Members']"));
        WebElement Addpackage = driver.findElement(By.xpath("//a[text()='Old Member Registration']"));
        Actions action = new Actions(driver);
        //  Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.textToBePresentInElement(Packages, "Members"));
        action.moveToElement(Packages).click().build().perform();

        wait.until(ExpectedConditions.textToBePresentInElement(Addpackage, "Old Member Registration"));

        action.doubleClick(Addpackage).build().perform();

        String csv_file = "./Data/Datamic.csv";
        CSVReader reader1 = new CSVReader(new FileReader(csv_file));
        String[] cell = reader1.readNext();
        while ((cell = reader1.readNext()) != null) {
            String fullName = cell[0];
            String admissionDate = cell[1];
            String Emailid = cell[2];
            String personalid = cell[3];
            String phonenumbers = cell[4];
            String DOB = cell[5];
            //   String Gender = cell[6];
            String Packagename = cell[7];
            String EndDate = cell[8];


            driver.findElement(By.id("fullName")).sendKeys(fullName);

            WebElement AdmissionDate = driver.findElement(By.xpath("//*[@id='NotTop']/main/div/div[1]/form/div/div[2]/div/div[2]/div/div[1]/div/input"));
            wait.until(ExpectedConditions.elementToBeClickable(AdmissionDate));
            AdmissionDate.click();

            dobAdder(driver, admissionDate);

            driver.findElement(By.id("email")).sendKeys(Emailid);

            String phonenumbers1 = phonenumbers.substring(2, 14);

            driver.findElement(By.xpath("//input[@class='PhoneInputInput']")).sendKeys("+" + phonenumbers1);
            driver.findElement(By.id("personalId")).sendKeys(personalid);

            WebElement DOBs = driver.findElement(By.xpath("//*[@id='NotTop']/main/div/div[1]/form/div/div[2]/div/div[6]/div/div[1]/div/input"));
            wait.until(ExpectedConditions.elementToBeClickable(DOBs));
            DOBs.click();

            dobAdder(driver, DOB);

/*            WebElement nationality = driver.findElement(By.id("nationality"));
            Select select = new Select(nationality);
            select.selectByVisibleText(Nationality);*/

            //  Thread.sleep(2000);
            WebElement gender = driver.findElement(By.id("gender"));
            wait.until(ExpectedConditions.visibilityOf(gender));
            Select selectsgender = new Select(gender);
            selectsgender.selectByVisibleText("Female");

            //  Thread.sleep(2000);
            WebElement branch = driver.findElement(By.id("branch"));
            wait.until(ExpectedConditions.visibilityOf(branch));
            Select selectbranch1 = new Select(branch);
            selectbranch1.selectByVisibleText("Jeem Gym");
            //   Thread.sleep(2000);

            WebElement Element1 = driver.findElement(By.id("Notes"));
            js.executeScript("arguments[0].scrollIntoView();", Element1);
            wait.until(ExpectedConditions.visibilityOf(Element1));

            WebElement packageName = driver.findElement(By.id("packageName"));
            wait.until(ExpectedConditions.visibilityOf(packageName));
            Select packageName1 = new Select(packageName);
            packageName1.selectByVisibleText(Packagename);

            //  Thread.sleep(2000);

 /*           WebElement Enddate = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']//following::input[9]"));
            wait.until(ExpectedConditions.elementToBeClickable(Enddate));
            Enddate.click();*/

            endDateAdder(driver, EndDate);

            System.out.println(fullName);

/*            WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-success mx-1 px-4']"));
            JavascriptExecutor executor1 = (JavascriptExecutor) driver;
            wait.until(ExpectedConditions.elementToBeClickable(submit));
            executor1.executeScript("arguments[0].click();", submit);*/
            Thread.sleep(2000);

        }
    }
}
