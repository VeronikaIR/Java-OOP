import java.util.Scanner;

public class HimmingDistance {

    //function to calculate the Himming Distance which is the number
    // of bits which are different at same position in both numbers
    public static int calcultateDistance(int n1, int n2){

        // xor operation to create number which represent bits
        int differentBits = n1 ^ n2;

        // counter for different number of bits
        int countingDifferentBits = 0;

        while (differentBits > 0){

            //gives 1 and increment counter
            countingDifferentBits += differentBits & 1;

            differentBits >>= 1;
        }

        //return number of different bits between number1 and number2
        return countingDifferentBits;
    }

    //create function to convert to binary entered number
    public static String toBinary(int number){

        char[] binaryArr = new char[8];

        for(int i = 0; i < 8; i++){
            binaryArr[7 - i] = ((number >> i) & 1) > 0 ? '1': '0';
        }
        return  new String(binaryArr);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;

        System.out.print("Enter first number: ");
        firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        secondNum = input.nextInt();

        System.out.println("First number in binary: " + toBinary(firstNum));
        System.out.println("Second number in binary: " + toBinary(secondNum));

        int hammingDistance = calcultateDistance(firstNum, secondNum);
        System.out.println("Himming distance is: " + calcultateDistance(firstNum, secondNum));

    }
}
