package problem2;

import java.util.Scanner;

public class ComputeByMenu {
    private double x;
    private Scanner input;
    private int userChoice;

    public ComputeByMenu(double x){
        this.x = x;
        input = new Scanner(System.in);

    }

    public void displayMenu(){
        for(int i = 0; i < 60; i++){
            System.out.println();
        }
        System.out.print(" 1. Update the floating point number '\n' 2. Compute and display exp(x) '\n' 3. Compute and display sin(x0) '\n' 4. Compute and display floor(x) '\n' 5. Exit");
    }

    public void doSelection(int choice){
        switch (choice){
            case 1:
                System.out.print("Enter x: ");
                x = input.nextDouble();
                break;
            case 2:
                System.out.printf("Exp(%.2f) = %.2f%n", x, Math.exp(x));
                break;
            case 3:
                System.out.printf("Sin(%.2f) = %.2f%n", x, Math.sin(x)); //radians
                //Math.toRadians(x) -> degrees to radians
                break;
            case 4:
                System.out.printf("Floor(%.3f) = %.3f%n", x, Math.floor(x));
                break;
            case 5:
                System.exit(0);
        }
        System.out.println("Press Enter to continue...");
        input.nextLine();
        input.nextLine();

        displayMenu();
    }

    public int getUserChoice(){
        while (true){
            displayMenu();
            int userChoice;
            do{
                System.out.println("Select a menu option: ");
                userChoice = input.nextInt();
            }while (userChoice < 1 || userChoice > 5);{
                doSelection(userChoice);
            }
        }
    }

}
