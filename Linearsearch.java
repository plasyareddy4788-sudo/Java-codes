import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Declare and initialize array
        int[] a = {2, 5, 1, 4, 7, 8};

        System.out.println("Enter number to search:");
        int k = s.nextInt();

        int i;
        for (i = 0; i < a.length; i++) {
            if (k == a[i]) {
                System.out.println("Element " + a[i] + " found at index " + i);
                break;
            }
        }

        // If loop completed without finding, i will be equal to a.length
        if (i < a.length) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }

        s.close();
    }
}
