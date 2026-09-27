import java.util.Scanner;//second largest element in array
public class Arseclar
{
    public static void main(String []args) 
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
        int i=0;
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
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
            if(l<a[i])
            {    
                sl=l;
                l=a[i];
            }
            else if(a[i]>sl && a[i]!=l)
            {
                sl=a[i];
            }
        }
        System.out.println(sl);
    }
}
