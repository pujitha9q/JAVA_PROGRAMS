package PATTERNS;

import java.util.Scanner;

/*
package PATTERNS;

import java.util.Scanner;

public class Patterns
{
    public static void main(String args[])
    {
      */
/*  int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }*//*

        // inverted star pattern
       */
/* int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n-i+1;j++)
           {
               System.out.print("*");
           }
            System.out.println(" ");
        }
*//*

        //half - pyramid pattern
      */
/*  int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.println(" ");
        }*//*

        // print character pattern
        char ch ='A';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
*/
public class Patterns
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int p=1;p<=n;p++)
        {
            for(int j=1;j<=p;j++)
            {
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
                    System.out .println(n);
                }
                else
                {
                    continue;
                }
            }

        }
    }
}