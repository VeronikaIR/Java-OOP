import java.util.Arrays;

public class RouteCipher {

    private int key;

    public RouteCipher(int key){
        this.setKey(key);
    }

    public int getKey(){
        return this.key;
    }

    void setKey(int key){
            this.key = key;
    }

    public String encrypt(String plainText){

        //absolute value defines the number of the columns
        int columns = Math.abs(key);
        int rows;

        //create new char array and then put only letters from plain text
        char[] onlyLetters = getOnlyLetters(plainText);

        //we get the size of the text to determine the size of the text block
        int textSize = onlyLetters.length;

        if(textSize % columns == 0){
            rows = textSize / columns;
        }
        else{
            rows = (textSize / columns) + 1;
        }
        //we create a 2D char matrix (text block) to fill it with plain text
        char[][] textBlock = new char[rows][columns];

        //a variable to iterate a plain text
        int textIndex = 0;


        //we fill matrix with the given plain text
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(textIndex < textSize) {
                    textBlock[i][j] = onlyLetters[textIndex];
                    textIndex++;
                }
                else{
                    textBlock[i][j] = 'X';
                }
            }
        }

        int minRow = 0, minCol = 0;
        int allElementsInMatrix = rows * columns;
        int countElements = 0;

        String encryptedText = "";

        if(key > 0){

            //if key is positive number we encrypt text
            //by spiralling inwards starting from the top left corner
            // in a counterclockwise direction
            int maxRow = rows-1, maxCol = columns-1;
            while (countElements < allElementsInMatrix){

                if(countElements < allElementsInMatrix) {
                    //cycle for the left wall of the matrix
                    for (int i = minRow; i <= maxRow; i++) {
                        encryptedText += textBlock[i][minCol];
                        countElements++;
                    }
                } else{break;}
                minCol++;

                if(countElements < allElementsInMatrix){
                    //cycle for the bottom wall of the matrix
                    for(int i = minCol; i <= maxCol; i++){
                        encryptedText += textBlock[maxRow][i];
                        countElements++;
                    }
                } else{break;}
                maxRow--;

                if(countElements < allElementsInMatrix){
                    //cycle for the right wall of the matrix
                    for(int i = maxRow; i >= minRow; i--){
                        encryptedText += textBlock[i][maxCol];
                        countElements++;
                    }
                } else{break;}
                maxCol--;

                if(countElements < allElementsInMatrix){
                    //cycle for the bottom wall of the matrix
                    for(int i = maxCol; i >= minCol; i--){
                        encryptedText += textBlock[minRow][i];
                        countElements++;
                    }
                } else{break;}
                minRow++;
            }
        }
        else{
            //when a key is a negative number
            //encrypt text by spiraling inwards
            //starting from the bottom right corner
            //in a counterclockwise direction

            int maxRow = rows, maxCol = columns;

            while(minRow < maxRow && minCol < maxCol){

                if(countElements == allElementsInMatrix){
                    break;
                }
                for (int i = maxRow - 1; i >= minRow; i--) {
                    encryptedText += textBlock[i][maxCol - 1];
                    countElements++;
                }
                maxCol--;
                if(countElements == allElementsInMatrix){
                    break;
                }
                for (int i = maxCol - 1; i >= minCol; i--) {
                    encryptedText += textBlock[minRow][i];
                    countElements++;
                }
                minRow++;
                if(countElements == allElementsInMatrix){
                    break;
                }
                for(int i = minRow; i < maxRow; i++){
                    encryptedText += textBlock[i][minCol];
                    countElements++;
                }
                minCol++;
                if(countElements == allElementsInMatrix){
                    break;
                }
                for(int i = minCol; i < maxCol; i++){
                    encryptedText += textBlock[maxRow - 1][i];
                    countElements++;
                }
                maxRow--;
            }
        }
        return encryptedText;
    }

    private char[] getOnlyLetters(String plainText){

        String tempStr = "";
        for(int i = 0; i < plainText.length(); i++){
            if((plainText.charAt(i) >= 'A' && plainText.charAt(i) <= 'Z') || (plainText.charAt(i) >= 'a' && plainText.charAt(i) <= 'z')){
                tempStr += plainText.charAt(i);
            }
        }

        tempStr.toUpperCase();
        char[] toReturn = tempStr.toCharArray();
        return toReturn;
    }

    public String decrypt(String cipherText){

        //absolute value defines the number of the columns
        int columns = Math.abs(key);
        int rows;

        //create new char array and then put only letters from plain text
        char[] onlyLetters = getOnlyLetters(cipherText);

        //we get the size of the text to determine the size of the text block
        int textSize = onlyLetters.length;


        if(textSize % columns == 0){
            rows = textSize / columns;
        }
        else{
            rows = (textSize / columns) + 1;
        }
        //a variable to iterate a cipher text
        int textIndex = 0;

        char[][] cipherTextMatrix = new char[rows][columns];

        String decryptedText = "";
        int minRow = 0, minCol = 0;
        int allElementsInMatrix = rows * columns;
        int countElements = 0;


        int rowS = rows;
        int colS = columns;

        if(key > 0) {

            while (minRow < rows && minCol < columns) {
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = minRow; i < rows; i++) {
                    cipherTextMatrix[i][minCol] = onlyLetters[countElements];
                    countElements++;
                }
                minCol++;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = minCol; i < columns; i++) {
                    cipherTextMatrix[rows - 1][i] = onlyLetters[countElements];
                    countElements++;
                }
                rows--;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = rows - 1; i >= minRow; i--) {
                    cipherTextMatrix[i][columns - 1] = onlyLetters[countElements];
                    countElements++;
                }
                columns--;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = columns - 1; i >= minCol; i--) {
                    cipherTextMatrix[minRow][i] = onlyLetters[countElements];
                    countElements++;
                }
                minRow++;
            }
        }
        else {
                while (minRow < rows && minCol < columns) {
                    if (countElements == allElementsInMatrix) {
                        break;
                    }
                    for (int i = rows - 1; i >= minRow; i--) {
                        cipherTextMatrix[i][columns - 1] = onlyLetters[countElements];
                        countElements++;
                    }
                    columns--;
                    if (countElements == allElementsInMatrix) {
                        break;
                    }
                    for (int i = columns - 1; i >= minCol; i--) {
                        cipherTextMatrix[minRow][i] = onlyLetters[countElements];
                        countElements++;
                    }
                    minRow++;
                    if (countElements == allElementsInMatrix) {
                        break;
                    }
                    for (int i = minRow; i < rows; i++) {
                        cipherTextMatrix[i][minCol] = onlyLetters[countElements];
                        countElements++;
                    }
                    minCol++;
                    if (countElements == allElementsInMatrix) {
                        break;
                    }
                    for (int i = minCol; i < columns; i++) {
                       cipherTextMatrix[rows - 1][i] = onlyLetters[countElements];
                        countElements++;
                    }
                    rows--;
                }
            }

        for(int i = 0; i < rowS; i++){
             for(int j = 0; j < colS; j++) {
                 decryptedText += cipherTextMatrix[i][j];
             }
        }

       return decryptedText;
    }

    public String toString(){

        return String.format("Route Cipher key = %d", key);
    }

}
