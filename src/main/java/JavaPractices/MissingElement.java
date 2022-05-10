package JavaPractices;

import java.util.HashSet;
import java.util.Set;

public class MissingElement {

    public static void main(String[] arg) {
        usingHashSet();
    }

    public void normal() {
        String array[] = {"java", "Selenium", "TestNG", "java", "Python"};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println("Duplicate =>" + array[i]);
                } else {
                    System.out.println("not a Duplicate =>" + array[i]);
                }
            }
        }
    }

    public static void usingHashSet() {
        String array[] = {"java", "Selenium", "TestNG", "java", "Python"};
        Set<String> hs = new HashSet<String>();

        for (String hss : array) {
            if (hs.add(hss) == false) {
                System.out.println("this is a duplicate"+ hss);
            }
        }
        System.out.println(hs);
    }
}
