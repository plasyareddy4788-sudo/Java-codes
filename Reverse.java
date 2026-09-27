import java.util.*;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
        int i=0;
        System.out.println("enter array");
        for (i=0;i<3;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("array is");
        for (i=0;i<3;i++)
        {
            System.out.println(a[i]);
        }
        for(i=2;i>=0;i--)
        {
            System.out.println(a[i]);
        }

    }
}
