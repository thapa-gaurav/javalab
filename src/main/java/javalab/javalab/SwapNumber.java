
import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = input.nextInt();
        System.out.println("Enter the value of n:");
        int n = input.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("m = " + m + " n = " + n);
        
        int temp = n;
        n = m;
        m = temp;
        
        System.out.println("After swapping:");
        System.out.println("m = " + m + " n = " + n);
        
    }
}
