import java.util.Scanner;
public class Rightshift

{
    public static void main(String []args) 
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
        int n=3;
        int i,j;
        int k=s.nextInt();
        k=k%n;
        
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
        i=0;
        j=n-1;
        while(i!=j && i<j)
        {
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
            i++;
            j--;
        }
        i=0;
        j=k-1;
        while(i!=j && i<j)
        {
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
            i++;
            j--;
        }
        i=k;
        j=n-1;     
        while(i!=j && i<j)
        {
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
            i++;
            j--;
        }
        
        for (i=0;i<3;i++)
        {
            System.out.println(a[i]);
        }
    }
}
