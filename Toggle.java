
import java.util.*;

public class Toggle {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        int i=2;
        n=n^(1<<i);
        System.out.println(n);
        
    }
    
}
