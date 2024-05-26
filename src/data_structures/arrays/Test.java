package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 28/01/2024
 */
public class Test {

    public static void main(String[] args) {
       StringBuffer db= new StringBuffer("hello");
       StringBuffer db1= new StringBuffer("hello");
       StringBuffer db4= new StringBuffer("hello");
       db4.append("sa");
       String db2="hello";
       String db3="hello";
        System.out.println(db.equals(db1));
        System.out.println(db4.equals(db1));
        System.out.println(db2==db3);

        int[][]myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
//        sumDiagonalElements(myArray2D);
        int[]myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[]myArray1 = {9,5,7,8,1,3,4,6,9};
        System.out.println(findMaxStockProfit(myArray1));
//        System.out.println(findMaxStockProfit(myArray1));
//        findTopTwoScores(myArray);
    }
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
            System.out.println("\n"+array[i][i]+"\n");
        }
        return sum;
    }
    public static int[] findTopTwoScores(int[] array){
        int[] arr= new int [2];
        for (int i=0;i<array.length;i++){
            if (arr[0]<array[i]){
                arr[1]=arr[0];
                arr[0]=array[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static int findMaxStockProfit(int[] array){
       int maxProfit=0;
       int minPrice=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
           if (minPrice<array[i]){
               minPrice=array[i];
           }
           else if (minPrice-array[i]>maxProfit){
               maxProfit=minPrice-array[i];
           }
        }

        return maxProfit;
    }
}
