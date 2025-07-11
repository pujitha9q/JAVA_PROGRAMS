package functions;


public class Sum_N
{
    public static void sum(int n)
    {
        int sum =0;
        while (n>0) {

            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);


    }
    public static void main(String[] args) {
        sum(248);
    }
}
