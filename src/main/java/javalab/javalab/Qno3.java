

//3.	Write a program that finds the largest element in an array
import java.util.Scanner;

public class Qno3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number[] = new int[5];
        int largest = 0;
        System.out.print("Enter the array elements one by one\n");
        for (int i = 0; i < 5; i++) {
            number[i] = myObj.nextInt();
            if(number[i] > largest){
                largest = number[i];
            }
        }
        System.out.print("The largest number of the array is " + largest);
        
    }
}
