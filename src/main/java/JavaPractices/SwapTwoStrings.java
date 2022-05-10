package JavaPractices;

public class SwapTwoStrings {



    public static void main(String []arg)
    {
        String a = "hello";
        String b = "World";

        a =a+b; //helloWorld

        b=a.substring(0,b.length());
        a=a.substring(b.length());

        System.out.println(a);
        System.out.println(b);


    }
}
