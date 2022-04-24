import java.util.Random;

public class SquareMatrixTest {

    //create a method to generate a matrix
    public static int[][] generateMatrix(){

        Random random = new Random();
        int matrixSIze = random.nextInt(11) + 2;
        int[][] matrix = new int[matrixSIze][matrixSIze];

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        int[][] matrix = generateMatrix();
        SquareMatrix squareMatrix = new SquareMatrix(matrix);
        squareMatrix.printAll();



    }
}
