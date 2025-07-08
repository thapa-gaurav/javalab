
import java.util.Scanner;

//Write a java program thats reads user input check whether it is alphabet or not
public class AlphabetOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character:\t");
        char inputData = input.next().charAt(0);

        if (Character.isLetter(inputData)) {
            System.out.print(inputData + " is an alphabet.");
        } else {
            System.out.print(inputData + " is not an alphabet.");
        }

        if ((int) inputData >= 65 && (int) inputData <= 122) {

        } else {

        }
    }
}
