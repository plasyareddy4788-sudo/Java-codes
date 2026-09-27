import java.util.*;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Declare and initialize array
        int[] a = {1,3,5,7,9,11,13};
        int l=a[0],r=(a.length-1),m=0;
        System.out.println("Enter number to search:");
        int k = s.nextInt();

        int i;
        while (l<=r)
        {
            m=(l+r)/2;
            if (k==a[m])
            {
                System.out.println("elment found");
                return;
            }
            else if (k>a[m])
            {
                l=m+1;
            }
            else 
            {
                r=m-1;
            }
        }
        
        
    System.out.println("element not found");
            
        
    }
}
