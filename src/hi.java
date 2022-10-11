import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
       /* Scanner in =new Scanner(System.in);
        System.out.print("Enter a number ");
        int n= in.nextInt();
        boolean k= even(n);
        System.out.print(k);*/

        for(int i=10;i<100;i++)
        {

            if (even(i))
            {
                boolean k= even(i);
                System.out.println(i);
            }
        }
    }
     static boolean even(int n) {
         if(n%2==0)
         {
             return false;
         }
         return true;

     }



    }
