package ARRAYS;
import  java.util.*;
public class MAX_NUM {
    public static int getLargest(int numbers[])
    {
        int large = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(large < numbers[i])
            {
                large = numbers[i];
            }
        }
       return large;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println(" Largest Value is : "+getLargest(numbers));
    }
}
