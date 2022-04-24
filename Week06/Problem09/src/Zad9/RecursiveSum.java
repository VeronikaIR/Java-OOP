package Zad9;

public class RecursiveSum {

    public static void main(String[] args) {

        System.out.printf("%-5s%-5s\n", "i", "sum");
        for(int i = 1; i < 11; i++){
            System.out.printf("%-5d%-5.2f\n", i, computeIterativeRecursive(i));
        }
    }

    private static double computeIterativeRecursive(int i){

        if( i <= 0){
            return 0;
        }


        return i / (2.0 * i + 1) + computeIterativeRecursive(i - 1);
    }

    private static double computeIterative(int i){
        double sum = 0;

        while (i > 0){
            sum += i / (2.0 * i + 1);
            i--;
        }
        return sum;
    }
}
