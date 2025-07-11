/*

package ARRAYS;

public class Demo3 {
    public static int LinearSerach(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
                //System.out.println(" key is at index" + i);
            }
        }
                return -1;

        }


        public static void main (String[]args){
            int numbers[] = {4, 9, 23, 10, 44, 56, 16};
            int key = 200;
          int index =  LinearSerach(numbers, key);
          if(index == -1)
          {
              System.out.println(" Not Found");
          }
          else
          {
              System.out.println(" index is found at "+index);
          }
        }
    }

*/

package ARRAYS;
public  class Demo3
{
    public static int check(String s[],String key)
    {
        for (int i=0;i<s.length;i++)
        {
            if(s[i].equals(key))
            {
                return i;
            }



        }
        return -1;
    }

    public static void main(String[] args) {
    String s[] = {"apple","mango","sapota","watermelon","Dragon","banana"};
    String key = "banana";
   int index =  check(s,key);
   if(index == -1)
   {
       System.out.println("NOT FOUND");
   }
   else
   {
       System.out.println(" INDEX AT "+index+" " +"ELEMENT FOUND");
   }
    }
}