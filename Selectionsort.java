import java.util.*;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = {2, 5, 1, 4, 7, 8};
        int i=0;
        for (i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

