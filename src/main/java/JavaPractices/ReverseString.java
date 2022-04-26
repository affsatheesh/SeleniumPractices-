package JavaPractices;

import java.sql.SQLOutput;
import java.util.*;

public class ReverseString {


    public static void main(String[] arg) {
        collectionsUsing();

    }


    public void buffer() {
        String name = "sathez";
        StringBuffer buffer = new StringBuffer(name);
        System.out.println(buffer.reverse());
    }

    public static void builder() {
        String lastname = "kumar";
        StringBuilder builder = new StringBuilder(lastname);
        System.out.println(builder.reverse());
    }

    public static void normal() {
        String fullname = "satheeshkumar";

        for (int i = fullname.length() - 1; i >= 0; i--) {
            StringBuffer buffer = new StringBuffer(i);
            System.out.println(buffer);
        }
    }

    public static void ownmethod() {
        String name = "Sathez sk";
        char[] singleChar = name.toCharArray();

        String reverse = "";

        for (int i = singleChar.length - 1; i >= 0; i--) {
            reverse = reverse + singleChar[i];
        }
        System.out.print(reverse);
    }

    public static void collectionsUsing() {
        String name = "Sathez sk";
        char[] singleChar = name.toCharArray();

        List<Character> cr = new ArrayList<Character>();

        for (Character newcr:singleChar) {
            cr.add(newcr);
        }
        Collections.reverse(cr);

        Iterator ir = cr.listIterator();

        while(ir.hasNext())
        {
            System.out.print(ir.next());
        }
    }
}
