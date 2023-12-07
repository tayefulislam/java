
import java.util.Scanner;

public class recap {

    public static void main(String[] arg) {
        // Get int , double and float value;

        Scanner input = new Scanner(System.in);

        // Get int value;

        System.out.print("Please enter any 'int' value : ");
        int intNumber = input.nextInt();

        // get 'FLoat' value;

        System.out.print("Please enter any 'float' value : ");
        float floatNumber = input.nextFloat();

        // DOuble value
        System.out.print("Please enter any double value : ");

        double doubleNumber = input.nextDouble();
        // out put
        System.out.println("The int number is : " + intNumber);
        System.out.println("the float number is : " + floatNumber);

        System.out.println("The Double number is : " + doubleNumber);
        input.close();

    }

}