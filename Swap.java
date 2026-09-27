import java.util.*;
public class Swap
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        System.out.println("enter a number");
        int m=s.nextInt();
        n=n^m;
        m=n^m;
        n=n^m;
        System.out.println(n);
        System.out.println(m);
    }
}
