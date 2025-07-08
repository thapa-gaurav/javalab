
import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a postive number:");
        int data = input.nextInt();
        if(data < 0){
            System.out.println("Enter a positive number:");
        }else{
            System.out.println("The factorial of " + data + " is "  + factorial(data));;
        }
    }
    
    public static int factorial(int data){
        if(data == 0 || data == 1){
            return 1;
        }else{
            return data * factorial(data - 1);
        }
    }
}
