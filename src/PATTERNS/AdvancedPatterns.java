package PATTERNS;

public class AdvancedPatterns
{
 /*   public static void hollow_rectangle(int r, int c)
{
  for(int i=1;i<=r;i++)
  {
      for(int j = 1;j<=c;j++)
      {
          if( i==1 || i==r|| j==1|| j==c)
          {
              System.out.print("*");
          }
          else
          {
              System.out.print(" ");
          }
      }
      System.out.println();
  }
}
    public static void main(String[] args) {
       hollow_rectangle(4,4);
    }*/

  // inverted rotated half pyramid
  /*    public  static  void demo(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
      demo(4);
    }*/
    // inverted half pyramid with numbers

/*    public static void demo2(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {

                System.out.print(j+" ");

            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        demo2(5);
    }*/
 /*   public static void demo3(int n)
    { int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        demo3(5);
    }*/


    }

