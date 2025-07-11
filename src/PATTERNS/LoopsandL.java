package PATTERNS;

import java.util.Scanner;

public class LoopsandL {
    public static void main(String args[]) {
        /*// print from 1 to 10
        int n=1;

        while(n<=10)
        {
            System.out.println("number ="+n);
            n++;
        }*/
        // print numbers from 1 to n
       /* int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       int counter = 1;

        while(counter <=n)
        {
            System.out.println("From 1 to n:"+counter);
            counter++;
        }*/
        // sum of 'n ' natural numbers
       /* int n;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int counter =1 ;
        while(counter <=n)
        {
             sum = sum +counter;
            counter++;

        }
        System.out.println("sum="+sum);*/
        // pattern
      /*  int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("* * * *");
        }*/
        // print  reverse of  a number
       /* int number;
        Scanner sc = new Scanner(System.in);
        number =sc.nextInt();
        while(number>0)
        {
            int lastdigit = number%10;
            System.out.print(lastdigit+"");
            number = number/10;


        }*/
        // reverse the number
        // do - while()
       /* int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int counter=0;
        do
            {
                System.out.println("Hello world");
                counter++;
            }
            while (n<0);

    }*/
        // multiple of a number

        /*Scanner sc = new Scanner(System.in);

        do {
            int n;
            n = sc.nextInt();

            if(n%10==0) {
               break;
           }
            System.out.println(n);
        }
        while (true);*/
        // continue keyword
    /*    for(int i=0;i<=5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
*/
        // display all the numbers except the multiple of 10
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%10==0)
            {
                continue;
            }
            else {
                System.out.println(i);
            }

        }

    }
}
