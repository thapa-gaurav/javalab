
import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of  array element:\t");
        int arrayLength = input.nextInt();
        System.out.print("Enter the array element one by one:\t");
        int[] arr = new int[arrayLength];

        //input array
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = input.nextInt();
        }

        //sorting array using bubble sort
        int temp;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //output array
        System.out.println("After sorting array:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(arr[i]);
        }
    }
}
