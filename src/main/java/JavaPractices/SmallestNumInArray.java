package JavaPractices;

public class SmallestNumInArray {

    public  static void main(String []arg)
    {
        int numbers[] ={-2,3-5,55,90,4,-44,-33,100};

        int small = numbers[0];
        int large = numbers[0];

        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]>large)
            {
              large = numbers[i];
            }
            else if(numbers[i]<small)
            {
               small= numbers[i];
            }
        }
        System.out.println(small);
        System.out.println(large);



    }
}
