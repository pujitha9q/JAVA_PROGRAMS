package PATTERNS;


public class Patterns_part {
    public static void  demo(int n) {
        for(int i = 1;i<=n;i++)

        {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0"+" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        demo(5);
    }
}

