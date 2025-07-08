//write java program that reads P,T,R and ouput simple interest;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of principle :");
        int p = input.nextInt();
        System.out.println("Enter the value of Time:");
        int t = input.nextInt();
        System.out.println("Enter the value of rate:");
        double r = input.nextFloat();
        
        double simpleInterest = (p * t * r) / 100;
        System.out.println("The simple interest for principle = " + p + " rate = " + r + " and time = " + t + " is " + simpleInterest);
    }
}
