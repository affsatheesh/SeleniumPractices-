package JavaPractices;

public class ReverseNumber {

    public static void main(String [] arg)
    {
        long num = 12345;
        long rev =0;

        while(num!=0)
        {
            rev =rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
