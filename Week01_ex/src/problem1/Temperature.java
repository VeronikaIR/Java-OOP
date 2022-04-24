package problem1;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        double celsius;
        double fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Input 1 for Fahrenheit to Celsius or " +
                " 2 for Celsius to Fahrenheit: ");
        int option = input.nextInt();
        if(option != 1 && option !=2){
            System.out.println("Invalid option choice!");
        }

        if(option == 1) {

            System.out.print("Input degrees Fahrenheit: ");
            fahrenheit = input.nextDouble();
            celsius = (5.0 / 9.0 * (fahrenheit - 32));
            System.out.printf("Celsius: %.1f%n", celsius);
        }

        //format specifiers:
        // %s -String
        // %d - int
        // %f - double -> %.2f - два знака след десетичната запетая
        //                %.0f - форматира като цяло число
        // \n %n - new line

        if(option == 2) {
            System.out.print("Input degrees Celsius: ");
            celsius = input.nextDouble();
            fahrenheit = 9.0 / 5.0 * celsius + 32;
            System.out.printf("Fahrenheit: %.1f\n", fahrenheit);
        }
    }

}
