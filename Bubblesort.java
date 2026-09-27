import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = {2, 5, 1, 4, 7, 8};
        int i=0;
        for (i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if (a[j]>a[j+1])
                {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
            }
        }
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
