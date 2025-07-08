//write a java program to read 2 integer number m and n and check whether m is a multiple of n.

import java.util.Scanner;

public class MmultibleOfN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = input.nextInt();
        System.out.println("Enter the value of n:");

        int n = input.nextInt();
        if (n % m == 0) {
            System.out.println(m + " is multiple of " + n);
        } else {
            System.out.println(m + " is not multiple of " + n);
        }
    }
}
