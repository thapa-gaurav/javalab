//writa a java program to check whether the array is sorted or not

import java.util.Scanner;

public class Qno7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of  array element:\t");
        int arrayLength = input.nextInt();
        System.out.print("Enter the array element one by one:\t");
        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = input.nextInt();
        }
        int firstElement = arr[0];
        int status = 0;
        for (int i = 1; i < arrayLength; i++) {
            if (firstElement > arr[i]) {
                status = 1;
                break;
            }
        }
        if(status == 0){
            System.out.println("The array is sorted:");
        }else{
            System.out.println("The array is not sorted:");
        }
    }
}
