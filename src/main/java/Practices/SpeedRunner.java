package Practices;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TopLevelElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.HashMap;

public class SpeedRunner {

    public static void main(String[] args) {
        Firefox();
        Chrome();
    }

    /*
     | Chrome Lunching
    */
    public static void Chrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        DisableImageChrome(options);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }

    /*
    | Firefox Lunching
    */
    public static void Firefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        DisableImageFirefox(options);
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.google.com/");
    }


    public static void DisableImageChrome(ChromeOptions options) {
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
    }

    public static void DisableImageFirefox(FirefoxOptions options) {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("permissions.default.image", 2);
        options.setProfile(profile);
        options.setCapability(FirefoxDriver.PROFILE, profile);
    }
}
