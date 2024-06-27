package data_structures.arrays;

/**
 * @author Sahil on 20/06/2024
 */
public class SpiralTraversal {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
//        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};
//        int[][] arr = {{4, 2, 3, 6, 7, 8, 1, 9, 5, 10},{12, 19, 15, 16, 20, 18, 13, 17, 11, 14}};
        printSpiralOrder(arr);
    }

    //[       StCol      EndCol
    //   StRow [1, 2, 3,  4],
    //         [12, 13,14,5],
    //         [11, 16,15,6],
    //   EndRow[10, 9, 8, 7]
    //  ]
    public static void printSpiralOrder(int[][] matrix){

        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;
        int startCol=0;
        while (startRow<=endRow&&startCol<=endCol){

         for(int i=startRow;i<=endCol;i++){
             System.out.println(matrix[startCol][i]);
         }
        startRow++;

         for(int i=startRow;i<=endRow;i++){
             System.out.println(matrix[i][endCol]);
         }
            endCol--;
            if (startRow<=endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.println(matrix[endRow][i]);
                }
            }
         endRow--;
            if (startCol<=endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.println(matrix[i][startCol]);
                }
            }
        startCol++;
        }
    }


}
