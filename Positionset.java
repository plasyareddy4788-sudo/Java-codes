import java.util.*;
public class Positionset  // in that particular ith position you need to get 0 irrespctive of binary digit 1 or 0
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        int c=0;
        while((n&1)==0)
        {
            c++;
            n>>=1;
        }
        System.out.print(c);
    }
}
