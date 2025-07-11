package PATTERNS;
import java.util.*;
public class PrimeNumber {
    public static void main(String args[])
    {
       /* int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                isPrime = false;
            }

        }
        if(isPrime==true)
        {
            System.out .println("n is prime number");
        }
        else {
            System.out.println("not a prime number");
        }*/
        // another method

        // Math.sqrt
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year %4 ==0 & year%100 !=0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year ");
        }


    }
}
