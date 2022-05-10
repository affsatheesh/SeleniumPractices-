package JavaPractices;

public class RemoveJunk {

    public static void main(String []arg)
    {

        String junk = "@#$%^&*()_(**Hi()####Satheesh";

       String s = junk.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(s);
    }
}
