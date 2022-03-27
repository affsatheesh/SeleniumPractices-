package AddData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Helper {

    public static String MonthName(String mnth) {
        switch (mnth) {

            case "01":
                String January = "January";
                return January;
            case "1":
                String January1 = "January";
                return January1;
            case "02":
                String february = "February";
                return february;
            case "2":
                String february2 = "February";
                return february2;
            case "03":
                String March = "March";
                return March;
            case "3":
                String March3 = "March";
                return March3;
            case "04":
                String April = "April";
                return April;
            case "4":
                String April4 = "April";
                return April4;
            case "05":
                String May = "May";
                return May;
            case "5":
                String May5 = "May";
                return May5;
            case "06":
                String June = "June";
                return June;
            case "6":
                String June6 = "June";
                return June6;
            case "07":
                String July = "July";
                return July;

            case "7":
                String July7 = "July";
                return July7;

            case "08":
                String August = "August";
                return August;

            case "8":
                String August8 = "August";
                return August8;

            case "09":
                String September = "September";
                return September;

            case "9":
                String September9 = "September";
                return September9;

            case "10":
                String October = "October";
                return October;

            case "11":
                String November = "November";
                return November;
            case "12":
                String December = "December";
                return December;
            default:
                String Invalidmonth = "Invalid month";
                return Invalidmonth;
        }
    }

    public static String Dates(String counts) {
        switch (counts) {
            case "01":
                String counts1 = "1";
                return counts1;
            case "02":
                String counts2 = "2";
                return counts2;
            case "03":
                String counts3 = "3";
                return counts3;
            case "04":
                String counts4 = "4";
                return counts4;
            case "05":
                String counts5 = "5";
                return counts5;
            case "06":
                String counts6 = "6";
                return counts6;
            case "07":
                String counts7 = "7";
                return counts7;
            case "08":
                String counts8 = "8";
                return counts8;
            case "09":
                String counts9 = "9";
                return counts9;
            case "10":
                String counts10 = "10";
                return counts10;
            case "11":
                String counts11 = "11";
                return counts11;
            case "12":
                String counts12 = "12";
                return counts12;
            case "13":
                String counts13 = "13";
                return counts13;
            case "14":
                String counts14 = "14";
                return counts14;
            case "15":
                String counts15 = "15";
                return counts15;
            case "16":
                String counts16 = "16";
                return counts16;
            case "17":
                String counts17 = "17";
                return counts17;
            case "18":
                String counts18 = "18";
                return counts18;
            case "19":
                String counts19 = "19";
                return counts19;
            case "20":
                String counts20 = "20";
                return counts20;
            case "21":
                String counts21 = "21";
                return counts21;
            case "22":
                String counts22 = "22";
                return counts22;
            case "23":
                String counts23 = "23";
                return counts23;
            case "24":
                String counts24 = "24";
                return counts24;
            case "25":
                String counts25 = "25";
                return counts25;
            case "26":
                String counts26 = "26";
                return counts26;
            case "27":
                String counts27 = "27";
                return counts27;
            case "28":
                String counts28 = "28";
                return counts28;
            case "29":
                String counts29 = "29";
                return counts29;
            case "30":
                String counts30 = "30";
                return counts30;
            case "31":
                String counts31 = "31";
                return counts31;

            default:
                String Invalidmonth = "Invalid month";
                return Invalidmonth;
        }
    }

    public static String Dates1(String counts) {
        switch (counts) {
            case "1":
                String counts1 = "01";
                return counts1;
            case "2":
                String counts2 = "02";
                return counts2;
            case "3":
                String counts3 = "03";
                return counts3;
            case "4":
                String counts4 = "04";
                return counts4;
            case "5":
                String counts5 = "05";
                return counts5;
            case "6":
                String counts6 = "06";
                return counts6;
            case "7":
                String counts7 = "07";
                return counts7;
            case "8":
                String counts8 = "08";
                return counts8;
            case "9":
                String counts9 = "09";
                return counts9;
            case "10":
                String counts10 = "10";
                return counts10;
            case "11":
                String counts11 = "11";
                return counts11;
            case "12":
                String counts12 = "12";
                return counts12;
            case "13":
                String counts13 = "13";
                return counts13;
            case "14":
                String counts14 = "14";
                return counts14;
            case "15":
                String counts15 = "15";
                return counts15;
            case "16":
                String counts16 = "16";
                return counts16;
            case "17":
                String counts17 = "17";
                return counts17;
            case "18":
                String counts18 = "18";
                return counts18;
            case "19":
                String counts19 = "19";
                return counts19;
            case "20":
                String counts20 = "20";
                return counts20;
            case "21":
                String counts21 = "21";
                return counts21;
            case "22":
                String counts22 = "22";
                return counts22;
            case "23":
                String counts23 = "23";
                return counts23;
            case "24":
                String counts24 = "24";
                return counts24;
            case "25":
                String counts25 = "25";
                return counts25;
            case "26":
                String counts26 = "26";
                return counts26;
            case "27":
                String counts27 = "27";
                return counts27;
            case "28":
                String counts28 = "28";
                return counts28;
            case "29":
                String counts29 = "29";
                return counts29;
            case "30":
                String counts30 = "30";
                return counts30;
            case "31":
                String counts31 = "31";
                return counts31;

            default:
                String Invalidmonth = "Invalid month";
                return Invalidmonth;
        }
    }

/*    public static String Dateformetchanger(String Dayformet)
    {
        int ik2 = Integer.parseInt(Dayformet);
        String Day = null;
        if (ik2 < 10) {
            Day = Dates(Dayformet);
        }
        return Day;
    }*/

    public static void DisableImageChrome(ChromeOptions options) {
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
    }

    public static void dobAdder(WebDriver driver, String DOB) throws InterruptedException {

        WebElement year = driver.findElement(By.xpath("//h6[text()='2022']"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(year, "2022"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", year);
        String[] Dob = DOB.split("/");
        String Dayformet = Dob[0];
        String Monthformet = Dob[1];
        String Year = Dob[2];


        String Month = MonthName(Monthformet);
        String Day = Dates(Dayformet);


        //  Thread.sleep(1000);
        Actions action1 = new Actions(driver);
        WebElement myyear = driver.findElement(By.xpath("//div[text()='" + Year + "']"));
        wait.until(ExpectedConditions.textToBePresentInElement(myyear, Year));
        action1.moveToElement(myyear).build().perform();
        action1.click().build().perform();
     //   Thread.sleep(1000);


        for (int j = 0; j <= 13; j++) {
         //   Thread.sleep(1000);
            WebElement monthstart1 = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']"));
            wait.until(ExpectedConditions.visibilityOf(monthstart1));
            String monthdetails1 = monthstart1.getText();
            String Jan = "January";
            String sty1 = monthdetails1.split(" ")[0];

            if (Jan.equalsIgnoreCase(sty1)) {
                break;
            } else {
             //   Thread.sleep(1000);
                Actions action3 = new Actions(driver);
                WebElement date1 = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']"));
                wait.until(ExpectedConditions.elementToBeClickable(date1));
                action3.moveToElement(date1).click().build().perform();
            }
        }

        //Thread.sleep(2000);
        for (int i = 0; i <= 13; i++) {
            WebElement monthstart = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']"));
            String monthdetails = monthstart.getText();
            String sty = monthdetails.split(" ")[0];

            if (Month.equalsIgnoreCase(sty)) {
                //   Thread.sleep(2000);
 /*               WebElement day = driver.findElement(By.xpath("//p[text()='" + Day + "']"));
                wait.until(ExpectedConditions.textToBePresentInElement(day, Day));
                Actions action = new Actions(driver);
                action.doubleClick(day).build().perform();*/
                //   Thread.sleep(2000);

            //    Thread.sleep(1000);
                //  WebElement day = driver.findElement(By.xpath("//p[text()='" + Day + "']"));
                //    List<WebElement> day = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));
                List<WebElement> day = driver.findElements(By.xpath("//div[@role='presentation']"));

                for (WebElement Days : day) {
                    String tex = Days.getText();
                    if (tex.equalsIgnoreCase(Day)) {
                        wait.until(ExpectedConditions.elementToBeClickable(Days));
                        Actions action = new Actions(driver);
                        action.doubleClick(Days).build().perform();
                        //   Thread.sleep(2000);
                        break;
                    } else {
                    }
                }
                break;
            } else {
                Actions action2 = new Actions(driver);
                //  Thread.sleep(2000);
                WebElement date = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[1]/div[1]/button[2]"));
                wait.until(ExpectedConditions.elementToBeClickable(date));
                action2.moveToElement(date).click().build().perform();
                //   Thread.sleep(2000);
            }
        }
    }


    public static void endDateAdder(WebDriver driver, String DOB) throws InterruptedException, ParseException {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        String[] Dob = DOB.split("/");

        String Dayformet = Dob[0];
        String Monthformet = Dob[1];
        String Year1 = Dob[2];
        String Year = Year1.substring(2, 4);
        System.out.println(Year);

        int mo = Monthformet.length();
        int mo1 = 1;
        String Month1 = null;

        if (mo == mo1) {
            Month1 = 0 + Monthformet;
        } else {
            Month1 = Monthformet;
        }

        String Month = MonthName(Month1);


        int ne = Dayformet.length();
        int ne1 = 1;
        String Day = null;
        if (ne == ne1) {
            Day = 0 + Dayformet;
        } else {
            Day = Dayformet;
        }


        //  String Day1 = Dates1(Dayformet);

        String completeDate = Year + Month1 + Day;

        int endData = Integer.parseInt(completeDate);

        SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd");
        Date currentDate = new Date();
        String CurrentDates = formatter.format(currentDate);

        String replacedstr = CurrentDates.replace("/", "");
        int current = Integer.parseInt(replacedstr);

       // Thread.sleep(1000);
        if (endData <= current) {

            System.out.println("Below Current Date");
            WebElement packageName = driver.findElement(By.id("packageName"));
            wait.until(ExpectedConditions.visibilityOf(packageName));
            Select packageName1 = new Select(packageName);
            packageName1.selectByVisibleText("Old System - Expired");
         //   Thread.sleep(1000);
            WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-success mx-1 px-4']"));
        //    JavascriptExecutor executor1 = (JavascriptExecutor) driver;
         //   wait.until(ExpectedConditions.elementToBeClickable(submit));
         //   executor1.executeScript("arguments[0].click();", submit);
         //   Thread.sleep(1000);
            driver.navigate().refresh();


          /*  String todayDate =  CurrentDates.substring(0,2);
            System.out.println(todayDate);
            List<WebElement> day = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

            for (WebElement Days:day) {
                String tex = Days.getText();
                if (tex.equalsIgnoreCase(todayDate)) {
                    wait.until(ExpectedConditions.elementToBeClickable(Days));
                    Actions action = new Actions(driver);
                    action.doubleClick(Days).build().perform();

                    driver.navigate().refresh();

                    break;
                } else {

                }
                break;
            }*/

        } else {
            System.out.println("Above Current Date");

            Thread.sleep(1000);
            WebElement Enddate = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']//following::input[13]"));
            wait.until(ExpectedConditions.elementToBeClickable(Enddate));
            Enddate.click();

            WebElement year = driver.findElement(By.xpath("//h6[text()='2022']"));
            wait.until(ExpectedConditions.textToBePresentInElement(year, "2022"));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", year);

            Actions action1 = new Actions(driver);
            WebElement myyear = driver.findElement(By.xpath("//div[text()='" + 20 + Year + "']"));
            wait.until(ExpectedConditions.textToBePresentInElement(myyear, Year));
            action1.moveToElement(myyear).build().perform();
            action1.doubleClick().build().perform();

         //   Thread.sleep(1000);

            int date44 = 22;
            int ik = Integer.parseInt(Year);

            if (ik > date44) {

                for (int j = 0; j <= 13; j++) {
                    //   Thread.sleep(1000);
                    WebElement monthstart1 = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']"));
                    wait.until(ExpectedConditions.visibilityOf(monthstart1));
                    String monthdetails1 = monthstart1.getText();

                    String Jan = "January";
                    String sty1 = monthdetails1.split(" ")[0];

                    if (Jan.equalsIgnoreCase(sty1)) {
                        break;
                    } else {
                        //   Thread.sleep(1000);
                        Actions action3 = new Actions(driver);
                        WebElement date1 = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']"));
                        wait.until(ExpectedConditions.elementToBeClickable(date1));
                        action3.moveToElement(date1).click().build().perform();
                    }
                }
            }


            // Thread.sleep(3000);

            for (int i = 0; i <= 13; i++) {
                WebElement monthstart = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']"));
                wait.until(ExpectedConditions.visibilityOf(monthstart));
                String monthdetails = monthstart.getText();
                String sty = monthdetails.split(" ")[0];

                if (Month.equalsIgnoreCase(sty)) {
                    //  Thread.sleep(2000);
                    //  WebElement day = driver.findElement(By.xpath("//p[text()='" + Day + "']"));
                    //    List<WebElement> day = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));
                    List<WebElement> day = driver.findElements(By.xpath("//div[@role='presentation']"));
                    for (WebElement Days : day) {
                        String tex = Days.getText();

                        String Day1 = Dates(Day);

                        if (tex.equalsIgnoreCase(Day1)) {
                            wait.until(ExpectedConditions.elementToBeClickable(Days));
                            Actions action = new Actions(driver);
                            action.doubleClick(Days).build().perform();
                    //            Thread.sleep(1000);
                            WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-success mx-1 px-4']"));
                        //    JavascriptExecutor executor1 = (JavascriptExecutor) driver;
                        //    wait.until(ExpectedConditions.elementToBeClickable(submit));
                        //    executor1.executeScript("arguments[0].click();", submit);
                            Thread.sleep(3000);
                           // driver.navigate().refresh();

                            break;
                        } else {
                        }
                    }
                    break;
                } else {
                    Actions action2 = new Actions(driver);
                    //  Thread.sleep(2000);
                    WebElement date = driver.findElement(By.xpath("//button[@tabindex='0']//following::button[3]"));
                    wait.until(ExpectedConditions.elementToBeClickable(date));
                    action2.moveToElement(date).click().build().perform();
                    //   Thread.sleep(3000);
                }
            }
        }
    }
}




/*
               if (validcalname.equalsIgnoreCase("dob")) {

                       } else if (validcalname.equalsIgnoreCase("Enddate")){
                       Actions action4 = new Actions(driver);
                       WebElement date1 = driver.findElement(By.xpath("//button[@tabindex='0']//following::button[3]"));
                       action4.moveToElement(date1).click().build().perform();
                       }*/
