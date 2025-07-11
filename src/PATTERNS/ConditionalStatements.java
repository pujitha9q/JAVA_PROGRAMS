package PATTERNS;

import java.util.Scanner;

public class ConditionalStatements
{
    public  static void main(String args[])
    {
        /*int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age >=18)
        {
            System.out.println(" you can vote");
        }
        if(age >= 13 && age <18)
        {
            System.out.println("Teenage dream");
        }
        else {
            System.out.println("vote is invalid");
        }*/

        // larger value between 2 of them
     /*   int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b)
        {
            System.out.println("A is bigger");
        }
        else
        {
            System.out.println("B is bigger");
        }*/
        // odd - even
      /*  int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        *//*else if(n<0)
        {
            System.out.println(" neither even nor odd");
        }*//*
        else
        {
            System.out.println("ODD number");
        }*/
        int income;
        Scanner sc = new Scanner(System.in);
       int tax;
        income = sc.nextInt();
        if(income<500000)
            tax = 0;
        else if (income > 500000 && income <= 100000) {
            tax = (int)(income * 0.2);

        }
        else
        {
            tax = (int)(income*0.3);
            System.out.println("your tax is"+tax);
        }
    }
}
