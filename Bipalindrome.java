import java.util.*;
public class Bipalindrome
{
    public static void main(String[] args)

    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        int temp=n,sum=0;
        while(temp!=0)
        {
            sum=(temp&1)|(sum<<1);
            temp>>=1;
        }
        if(n==sum)
        {
            System.out.println("binary palindrome");
        }
        else{
            System.out.println("not binary palindrome");
        }
    }
}
