package functions;

public class Binary_decimal
{
    public  static void bi_dec(int binum)
    {
        int pow =0;
        int decNum =0;

        while (binum >0)
        {
            int lastdigit = binum %10;
            decNum = decNum +(lastdigit *(int)Math.pow( 2,pow));
            pow++;
            binum = binum/10;
        }
        System.out.println("decimal number of "+ binum+"= "+decNum);
    }
    public static void main(String[] args) {
        bi_dec(10100011);

    }
}
