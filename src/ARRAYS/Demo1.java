package ARRAYS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo1
{
    public static void main(String[] args) {
        //int arr[] = new int[50];
        // u cant atore beyond size and runtime you can't change anything in size
        // null values  or zeroes before storing.
        int marks[]= new int[50];
        Scanner sc = new Scanner(System.in);
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();
         marks[3] = sc.nextInt();
        System.out.println("phy ="+marks[0]);
        System.out.println("chem ="+marks[1]);
        marks[2] = marks[2]+1;
        System.out.println("marks ="+marks[2]);
 int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println(" percentage="+percentage+"%");
// to find length of the array
        System.out.println(" Length of the array = "+ marks.length);

    }
}
