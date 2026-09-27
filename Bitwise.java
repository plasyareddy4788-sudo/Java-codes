import java.util.*;
public class Bitwise
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        if ((n&1)==1)
        {
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}