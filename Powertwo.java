import java.util.Scanner;

public class Powertwo{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        if((n&n-1)==0)
        {
            System.out.println("power of two");
        }
        else{
            System.out.println("not poer of two");
        }
    }
}
