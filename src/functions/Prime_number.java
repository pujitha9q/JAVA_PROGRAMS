package functions;

public class Prime_number
{
    public static void Primes_IN_Range(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }

    }
     public static boolean isPrime(int n)
     {

       boolean isPrime = true;
       // corner cases
       if( n==2)
       {
           return true;
       }
       for(int i=2;i<=n-1;i++)
       {
           if(n%i ==0)
           {
               isPrime = false;
               break;
           }
       }
       return isPrime;

     }
     public static boolean optimised_primee(int n)
     {
         // corner cases
         if(n==2)
         {
             return  true;
         }
         for(int i=2;i<=Math.sqrt(n);i++)
         {
             if(n%i ==0)
             {
                 return false;
             }
         }
         return true;
     }
     public static void pattern(int n)
     {
         int count =1;
         for(int i=n;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
             {

                 System.out.print(count+" ");
               count += 2;
             }
             System.out.println(" ");
         }
     }
    public static void main(String[] args) {
       // System.out.println(isPrime(2));
        //System.out.println(optimised_primee(9));
      // Primes_IN_Range(20);
       // if any value doesn't return then direct call
        // otherwise sout why ??
        pattern(5);
    }
}
