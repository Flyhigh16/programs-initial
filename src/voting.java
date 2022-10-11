import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("check eligible or no ");
        int age= in.nextInt();
        boolean p=check(age);
        System.out.print(p);
    }
    static boolean check(int n)
    {
        if (n>=18)
        {
            return true;
        }
        return false;
    }
}
