package JavaPractices;

public class SwapNumber {


    public static void main(String[] arg) {
        //  withUsingvariable();
       // withoutUsingvariable();
        withoutUsingvariable1();
        withoutUsingvariable2();

    }


    public static void withUsingvariable() {

        int x = 20;
        int y = 50;
        int t = x;

        x = y;
        y = t;

        System.out.println(x);
        System.out.println(y);
    }

    public static void withoutUsingvariable() {

        int x = 20;
        int y = 50;

        x = x + y; //     20+50=70
        y = x - y;  //     20-50=30
        x = x - y;  //     20-50=30

        System.out.println(x);
        System.out.println(y);
    }

    public static void withoutUsingvariable1() {

        int x = 20;
        int y = 50;

        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println(x);
        System.out.println(y);
    }

    public static void withoutUsingvariable2() {

        int x = 20;
        int y = 50;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x);
        System.out.println(y);
    }


    //  System.out.println(mysalary + "Seniur Salary ==> " + seniorSalary);
/*
        int first = 20;
        int second = 50;

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println(first);
        System.out.println(second);*/

}
