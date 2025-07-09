
//2.	Write a program in Java to read a number and tests if it is even or odd
import java.util.Scanner;
public class Qno2 {
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
        System.out.print("Input a postive integer number:\n");
        int number = myObj.nextInt();
        
        if(number % 2 == 0){
            System.out.print(number + " is eve.");
        }else{
            System.out.print(number + " is odd.");

        }
    }
}
