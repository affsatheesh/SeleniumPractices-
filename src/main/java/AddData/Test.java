package AddData;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] arg) {
/*      String nes =  MonthName(10);
        System.out.println(nes);*/
        testing();

/*        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));*/
    }

    public static String MonthName(int month) {
        switch (month) {
            case 1:
                String January = "January";
                return January;
            case 2:
                String february = "February";
                return february;
            case 3:
                String March = "March";
                return March;
            case 4:
                String April = "April";
                return April;
            case 5:
                String May = "May";
                return May;
            case 6:
                String June = "June";
                return June;
            case 7:
                String July = "July";
                return July;
            case 8:
                String August = "August";
                return August;
            case 9:
                String September = "September";
                return September;
            case 10:
                String October = "October";
                return October;
            case 11:
                String November = "November";
                return November;
            case 12:
                String December = "December";
                return December;
            default:
                String Invalidmonth = "Invalid month";
                return Invalidmonth;
        }
    }

    public static void testing() {
        String Year = "25";
        String Monthformet = "02";
        String Dayformet = "22";

        String completeDate = Year + Monthformet + Dayformet;
        int endData = Integer.parseInt(completeDate);

        SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd");
        Date currentDate = new Date();
        String CurrentDates = formatter.format(currentDate);
        String replacedstr = CurrentDates.replace("/", "");
        // System.out.println(replacedstr);

        int current = Integer.parseInt(replacedstr);

        System.out.println("current" + current);
        System.out.println("enddate" + endData);

        if (endData <= current) {
            String todayDate = CurrentDates.substring(0, 2);
            System.out.println(todayDate);
            System.out.println("Below Current Date");
        } else {
            System.out.println("Above Current Date");
        }
    }


}
