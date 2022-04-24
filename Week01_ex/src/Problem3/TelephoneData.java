package Problem3;

import java.util.Scanner;

public class TelephoneData {
    public static void main(String[] args) {

        int originalNumber;
        int number;

        System.out.println("Input 1 to encrypt integer or input 2 to decrypt integer");
        int option;
        Scanner intInput = new Scanner(System.in);
        option = intInput.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("Input a four digit number: ");
        originalNumber = input.nextInt();

        if (originalNumber < 1_000 || originalNumber > 9_999) {
            System.out.println("Number isn't four digit!");
            return;
            //System.exit(0);
        }


        if(option == 1) {

            // determine the 5 digits
            int digit1; // first digit of number
            int digit2; // second digit of number
            int digit3; // third digit of number
            int digit4; // fourth digit of number

            digit4 = originalNumber % 10;
            number = originalNumber / 10;
            digit3 = number % 10;
            number /= 10;
            digit2 = number % 10;
            digit1 = number / 10;


            //TODO: method
            digit1 = enctypt(digit1);
            digit2 = enctypt(digit2);
            digit3 = enctypt(digit3);
            digit4 = enctypt(digit4);

            int temp = digit1;
            digit1 = digit3;
            digit3 = temp;

            temp = digit2;
            digit2 = digit4;
            digit4 = temp;

            System.out.println("Encrypted integer:");
            System.out.printf("%d%d%d%d", digit1, digit2, digit3, digit4);

        }

        else if(option == 2){

//            int temp = digit1;
//            digit1 = digit3;
//            digit3 = temp;
//
//            temp = digit2;
//            digit2 = digit4;
//            digit4 = temp;
//
//            System.out.println("Decrypted integer:");
//            System.out.printf("%d%d%d%d", digit1, digit2, digit3, digit4);

        }

    }

    private static int enctypt(int num) {
        return (num + 7) % 10;
    }
}
