import java.util.*;
public class Get  // in that particular ith position you need to get 0 irrespctive of binary digit 1 or 0
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        int i=2;
        n=(n&~(1<<i));
        System.out.println(n);
    }
}
