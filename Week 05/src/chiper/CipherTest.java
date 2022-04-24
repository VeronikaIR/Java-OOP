package chiper;

import java.util.Locale;
import java.util.Scanner;

public class CipherTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter 1 for encrypt or 2 for decrypt: ");
            choice = input.nextInt();
        }while (choice < 1 || choice > 2);

        System.out.print("Enter SHIFT_LENGTH: ");
        int code = input.nextInt();

        CaesarCipher cipher = new CaesarCipher(code);

        System.out.print("Enter a word: ");
        String text = input.next();
        text = text.toUpperCase();

        if(choice == 1){
            System.out.println(text + " encrypted is " + cipher.encrypt(text));
        }else{
            System.out.println(text + " decrypted is " + cipher.decrypt(text));
        }
    }
}
