
import java.util.Scanner;

public class Qno9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of length:");
        int length = input.nextInt();
        System.out.println("Enter the value of widht:");
        int width = input.nextInt();
        System.out.println("Area of the rectangle is " + length * width);
        System.out.println("Perimeter of the rectangle is " + (length + width) * 2);

    }
}
