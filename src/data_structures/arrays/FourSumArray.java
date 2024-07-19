package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 19/07/2024
 */
public class FourSumArray {
    public static void main(String[] args) {

        int[]myArray = {7, 6, 4, -1, 1, 2};
        List<Integer[]>list=fourSumProblem(myArray,16);
        for (Integer[] arr:list){
            System.out.println(Arrays.toString(arr));
        }
    }


    public static List<Integer[]> fourSumProblem(int[] arr, int targetSum){


}
