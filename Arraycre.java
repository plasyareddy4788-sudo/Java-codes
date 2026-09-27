import java.util.*;
public class Arraycre {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
        int i=0;
        for (i=0;i<3;i++)
        {
            a[i]=s.nextInt();
        }
        for (i=0;i<3;i++)
        System.out.println(a[i]);
    }
}

