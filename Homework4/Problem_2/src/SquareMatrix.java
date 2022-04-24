

public class SquareMatrix {

    private int [][] dataArray;

    public SquareMatrix(){
       this.dataArray = new int[0][0];
    }

    public SquareMatrix(int[][] matrix){

        this.setDataArray(matrix);
    }

    public SquareMatrix(SquareMatrix matrix){
        this.setDataArray(matrix.dataArray);
    }

    public void setDataArray(int[][] intsMatrix){
        if(intsMatrix != null){
            this.dataArray = new int[intsMatrix.length][intsMatrix.length];

            for(int i = 0; i < intsMatrix.length; i++){
                for(int j = 0; j < intsMatrix.length; j++){
                   this.dataArray[i][j] = intsMatrix[i][j];
                }
            }
        }
        else{
            this.dataArray = new int[0][0];
        }
    }

    public int[][] getDataArray(){

        int[][] copyDataArray = new int[dataArray.length][dataArray.length];

        for(int i = 0; i < copyDataArray.length; i++){
            for(int j = 0; j < copyDataArray.length; j++){
                copyDataArray[i][j] = this.dataArray[i][j];
            }
        }
        return copyDataArray;
    }

    public int findMaxSum(){

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < dataArray.length - 1; i++){
            for(int j = 0; j < dataArray[i].length - 1; j++){
                int currSum = dataArray[i][j] + dataArray[i][j+1] +
                              dataArray[i+1][j] + dataArray[i+1][j+1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    void printAll(){

        int maxSum = this.findMaxSum();
        System.out.println("Maximum sum is: " + maxSum);
        System.out.println("All submatrices with maximum sum are: " );

        for(int i = 0; i < dataArray.length - 1; i++){
            for(int j = 0; j < dataArray[i].length - 1; j++){
                int currSum = dataArray[i][j] + dataArray[i][j+1] +
                        dataArray[i+1][j] + dataArray[i+1][j+1];
                if(currSum == maxSum){
                    System.out.printf("[%d, %d]\n", i, j);
                  //  System.out.printf("[%d, %d]\n", i+1, j+1);  //???
                }
            }
        }



    }

    @Override
    public String toString(){
        String dataArrayToString = "";

        for(int i = 0; i < dataArray.length; i++){
            for(int j = 0; j < dataArray[i].length; j++){
                dataArrayToString += String.format("%d ",dataArray[i][j]);
            }
        }
        return dataArrayToString;

    }


}
