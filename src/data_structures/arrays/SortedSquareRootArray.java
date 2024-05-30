package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 28/05/2024
 */
public class SortedSquareRootArray {

    public static void main(String[] args) {
        int[] arr={-2,-1};
        System.out.println(Arrays.toString(squareRoot(arr)));
    }


    public static int[] squareRoot(int[] arr){
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i]*arr[i];
        }
        Arrays.sort(result);
        return result;
    }
}
