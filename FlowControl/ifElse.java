package FlowControl;

/**
 * ifElse
 */
import java.util.Scanner;

public class ifElse {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your grade number : ");

        int number = input.nextInt();

        if (number >= 90 && number <= 100) {
            System.out.println("A Grade");
        }

        else if (number >= 60 && number < 90) {
            System.out.println("B Grade");
        }

        else if (number >= 40 && number < 60) {
            System.out.println("C Grade");
        }

        else if (number >= 0 && number < 40) {
            System.out.println("Fail");
        }

        else {
            System.out.println("Please enter a valid number ");
        }

        input.close();

    }
}