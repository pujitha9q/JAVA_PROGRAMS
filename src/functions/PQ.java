package functions;

import java.util.Scanner;

public class PQ
{
    public static void average(int a, int b,int c)
    {
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
    public static void isEven(int n)
    {
        if(n%2 ==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println(false);
        }
    }
    public static boolean palindrome(int n)
    {
         int or =n;
        int rev =0;
        while (n>0)
        {
            int rem = n % 10;
           // System.out.print(rem);
             rev = rev * 10 +rem;
            n = n / 10;


        }
        return  or == rev;


    }
    public static void convert_palindrome(int n)
    {
        if(palindrome(n))
        {
            System.out.println(n+" is a palindrome");
        }
        else
        {

           int next = n+1;
           while (!palindrome(next))
           {
             next++;
           }
            System.out.println(next+" is a palindrome");



        }
    }
    public static void main(String[] args) {
       // average(50,50,50);
       // isEven(5);
       // palindrome(321);
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            int num = sc.nextInt();
            convert_palindrome(num);
        }
    }
}
