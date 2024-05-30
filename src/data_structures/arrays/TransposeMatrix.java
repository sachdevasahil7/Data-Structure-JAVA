package data_structures.arrays;

/**
 * @author Sahil on 30/05/2024
 */
public class TransposeMatrix {


    public static void main(String[] args) {
    int[][] arr= new int[3][2];
    arr[0][0]=1;
    arr[0][1]=2;
    arr[1][0]=3;
    arr[1][1]=4;
    arr[2][0]=5;
    arr[2][1]=6;
        new TransposeMatrix().transposeMatrix(arr);

        //output
        /* arr[0][0]=1;          arr[0][1]=2
        *  arr[1][0]=3;          arr[1][1]=4;
        *   arr[2][0]=5;         arr[2][1]=6;
        * */
    }
    public int[][] transposeMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] result= new int[col][row];
        for (int i=0;i<row;i++) {
        for(int j=0;j<col;j++){
               result[j][i]=matrix[i][j];
           }
        }
        return result;
    }
}
