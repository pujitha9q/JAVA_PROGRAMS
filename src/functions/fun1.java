package functions;

public class fun1
{
    public static int demo(int n)
    {
        int f = 1;
        for(int i=1;i<=n;i++)
        {
            f = f*i;
        }
        return f;
    }
    public static int  binomial_coefficient(int n , int r)
    {
       int fact_n = demo(n);
       int fact_r = demo(r);
       int fact_nmr = demo(n-r);
       int binomial_coefficient = fact_n/(fact_r * fact_nmr);
       return binomial_coefficient;
    }
    public static void main(String[] args) {
        System.out.println(binomial_coefficient(5,2));
    }
}
