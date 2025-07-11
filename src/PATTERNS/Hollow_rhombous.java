package PATTERNS;

public class Hollow_rhombous {
    public static void main(String[] args) {
        // rhombus(5);
        diamond(7);
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        // reverse star
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}

    /*public static void rhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            // hollow rectangle - stars
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n|| j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }*/


