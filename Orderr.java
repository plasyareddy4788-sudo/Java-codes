import java.util.*;
public class Orderr
 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
        int i=0,k=1;
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
        for(i=0;i<2;i++)
        {
            if(a[i]>a[i+1])
            {
                k=0;//if not in ascending order
                break;    
            }
        }
        System.out.println(k);
    }
}
