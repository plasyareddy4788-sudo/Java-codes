import java.util.*;
public class Array {
    public static void main(String[] args)
    {
        int [] a={4,2,3,1,2,4,1};
        int res=0;
        for(int num:a)// to store each and ever value of array in num
        {
            res=res^num;
        }
        System.out.println(res);
    }
}
