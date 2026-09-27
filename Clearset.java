import java.util.*;

public class Clearset{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        int c=0,temp=n;
        while((temp&1)==0)
        {
            c++;
            temp>>=1;
        }
        int d=n & ~(1<<c);//(1<<c) take the count position in binary and the complement it
        System.out.println(d);
    }
    
}
