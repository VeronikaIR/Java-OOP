// Lab 3: Five.java
// Program breaks apart a five-digit number

package problem2;

import java.util.Scanner;

public class Five {

   public static void main( String args[] ) {
      int originalNumber;
      int number;
      String inputString;

      // read five-digit number from standard input and store in var originalNumber
      Scanner input = new Scanner(System.in);
      System.out.println("Input a five digit number: ");
      originalNumber = input.nextInt();

      if (originalNumber < 10_000 || originalNumber > 99_999) {
         System.out.println("Number isn't five digit!");
      }
      //System.exit(0);

      // determine the 5 digits
      int digit1; // first digit of number
      int digit2; // second digit of number
      int digit3; // third digit of number
      int digit4; // fourth digit of number 
      int digit5; // fifth digit of number


      digit1 = originalNumber / 10000; // get leftmost digit
      number = originalNumber % 10000; // get rightmost four digits

      digit2 = number / 1000;
      number %= 1000; //number = number % 1000;

      digit3 = number / 100;
      number %= 100;

      digit4 = number / 10;
      digit5 = number % 10;

      if(digit1 == digit5 && digit2 == digit4){
         inputString = String.format("%d is a palindrome\n", originalNumber);
      }
      else{
         inputString = String.format("%d is NOT a palindrome\n", originalNumber);
      }

      System.out.println(inputString);

      /* write code here that will separate the remainder of the digits in the 
         variable "number" and assign each one to the corresponding integer 
         variable */

      // create the result string
      /* write a statement that creates a string that displays each digit 
         separated by three spaces. Name this string resultString for use in
         the call to showMessageDialog in lines 38-39 of the template code */

      // output  results on standard output
   }

} // end class Five

