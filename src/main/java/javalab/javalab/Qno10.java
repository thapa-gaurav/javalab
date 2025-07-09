
import java.util.Scanner;

public class Qno10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius:");
        int radius = input.nextInt();
        System.out.println("Area of the circle is " + Math.PI * Math.pow(radius, 2));
        System.out.println("Perimeter of the rectangle is " + Math.PI * radius * 2);

    }
}
