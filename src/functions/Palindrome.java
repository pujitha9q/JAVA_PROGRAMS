package functions;

import java.util.Scanner;

public class Palindrome {
    public static boolean check_palindrome(int n) {
        int rev = 0;
        int org = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        return org == rev;
    }
public static  void convert_prime(int n)
{
    if(check_palindrome(n))
    {
        System.out.println(n+"palindrome");
    }
    else
    {
        int next = n+1;
        while (!check_palindrome(next))
        {
            next++;
        }
        System.out.println(next+" palindrome");
    }
}

        public static void main(String args[])
        {

            Scanner sc = new Scanner(System.in);
           for(int i=0;i<3;i++)
           {
               int  n = sc.nextInt();
               convert_prime(n);
           }
        }
    }


