import java.util.Scanner;

public class Demo1
{
    public static void inverted_pattern(int n)
    {
        int count =1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println(" ");
        }
    }
public  static void  main(String args[])
{

    inverted_pattern(5);
}
}
