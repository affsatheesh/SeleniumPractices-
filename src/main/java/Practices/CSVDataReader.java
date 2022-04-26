package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CSVDataReader extends NewCSV {
    public static void main(String[] arg) {
        List<String[]> ls = get("./Data/Data1.csv");
        for (String[] alldata : ls) {

//            String joined = String.join( " ",alldata);
//            System.out.println(joined); // FullName Email

            String[] datas = Arrays.toString(alldata).replace("[", "")
                    .replace("]", "").split(",");
            String fullname = datas[1];
            System.out.println(fullname);
            // Email
            // sasz
        }
    }
}
