package functions;

public class Meth_Block
{
    public static void main(String[] args) {

        int p=25;
        {
            int s = 20;
            System.out.println(s);
        }
       // block scope error-  System.out.println(s);
        System.out.println(p); // it works fine because p is defined in a method
        // inside the method the variable can be accessed as many times as possible.
    }
}
