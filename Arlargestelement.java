import java.util.Scanner;
public class Arlargestelement
{
    public static void main(String []args) 
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
        int i=0,max=a[0];
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
        for (i=0;i<3;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }

        }
        System.out.println(max);
    }
}
