package PATTERNS;

import java.util.Scanner;

public class TO {
    public static void  main(String args[])
    {
        // ternary operator
       /* int number = 4;
       String type =  ((number%2)==0)?"EVEN":"ODD";
        System.out.println(type);*/
        int marks;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        String demo = (marks>= 33)?"PASS":"FAIL";
        System.out.println(demo);
    }
}
