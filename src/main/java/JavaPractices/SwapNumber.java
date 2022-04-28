package JavaPractices;

public class SwapNumber {


    public static void main(String[] arg) {

        int mysalary = 20;
        int seniorSalary = 50;

        int temp = mysalary;
        mysalary = seniorSalary;
        seniorSalary = temp;

      //  System.out.println(mysalary + "Seniur Salary ==> " + seniorSalary);

        int first = 20;
        int second = 50;

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println(first);
        System.out.println(second);


    }
}
