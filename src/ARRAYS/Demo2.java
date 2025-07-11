package ARRAYS;

public class Demo2
{
    public static void update(int marks[],int a)
    {
         a = 5+1;
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = marks[i]+1;

        }
    }
    public static void main(String[] args) {
        int a=5;
        int marks[] = {40,50,30};
        update(marks,a);
        // print
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]+" ");
        }
        System.out.println(a);
    }
}
