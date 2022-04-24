import java.util.Scanner;

public class RouteCipherTest {

    public static void main(String[] args) {

        //tests in examples
        System.out.println("When key is 5");
        RouteCipher routeCipher = new RouteCipher(5);

        System.out.println("Encrypted text: " + routeCipher.encrypt("ABORT THE MISSION, YOU HAVE BEEN SPOTTED"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("ATSYVNTEDXXTEANITROBHSOESPOEHOMEIUB"));

        System.out.println("When key is -5");
        routeCipher.setKey(-5);
        System.out.println("Encrypted text: " + routeCipher.encrypt("ABORT THE MISSION, YOU HAVE BEEN SPOTTED"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("ATSYVNTEDXXTEANITROBHSOESPOEHOMEIUB"));

        System.out.println("When key is 4");
        routeCipher.setKey(4);
        System.out.println("Encrypted text: " + routeCipher.encrypt("THISISTHEPLAINTEXT"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("TIEIXTXXEAHSIHSPNTLT"));

        System.out.println("When key is -4");
        routeCipher.setKey(-4);
        System.out.println("Encrypted text: " + routeCipher.encrypt("THISISTHEPLAINTEXT"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("TIEIXTXXEAHSIHSPNTLT"));

    }
}
