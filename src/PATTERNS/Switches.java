package PATTERNS;

import java.util.Scanner;

public class Switches
{
    public  static void main(String args[])
    {
       /* int number = 2;
        switch (number)
        {
            case 1 : System.out.println("samosa");break;
            case 2 : System.out.println("burger"); break;
            case 3: System.out.println("mango shake"); break;
            default:
                System.out.println("invalid choice");


        }*/
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case '+' : System.out.println(a+b); break;
            case '-': System.out.println(a-b);break;
            case '*': System.out.println(a*b); break;
            case '/': System.out.println(a/b);break;
            default:
                System.out.println("invalid choice");
        }

    }
}
