/*
package PATTERNS;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String args[])
    {
        int a = 25;
        long b= a;
        // implicit conversion
        float  p = 25;
        Scanner sc = new Scanner(System.in);
        float sum = sc.nextInt();
        System.out.println(sum);
    }
}
*/
package  PATTERNS;

import java.util.Scanner;

public class TypeCasting
{
   public static void main(String args[])
   {
      /* Scanner sc = new Scanner(System.in);
       float a = 23.2861523f;
       int b = (int) a;
       System.out.println(b);*/
       // explicit conversion
       /*char ch = 'a';
       int number = ch;
       char ch2 = 'b';
       int number2 = ch2;
       System.out.println(number);
       System.out.println(number2);*/

// Type promotion in java
       /*char ch = 'a';
       char ch2 = 'b';
       System.out.println((int)(ch2));
       System.out.println((int)(ch));
       System.out.println(ch2-ch);
       System.out.println(ch); // they only work in expressions*/
       /*short a = 25;
       byte b = 10;
       char c = 'c';
       byte bt = (byte)(a+b+c);
       System.out.println(bt);*/
       int a = 10;
       float b = 25.1f;
       long c = 30;
       double d = 35;
       double ans = a+b+c;
       System.out.println(ans);
       // the long value take that as the type
       
   }
}
