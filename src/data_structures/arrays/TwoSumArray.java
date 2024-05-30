package data_structures.arrays;

import java.util.*;

/**
 * @author Sahil on 26/05/2024
 */
public class TwoSumArray {


    public static void main(String[] args) {
        int[] arr= {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        System.out.println(Arrays.toString(twoSum(arr,164)));
    }


/*
* x+y=targetValue
* y=targetValue-x
* if y means set contain x-targetValue then return x and y value else add current
* num in y (Set)
* */

    public static int[] twoSum(int[] arr, int targetValue){
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        int[]arr1= new int[2];
        for (int num:arr){
            if (hashMap.containsKey(targetValue-num)){
                arr1[0]=hashMap.get(targetValue-num);
                arr1[1]=num;
                return arr1;
            }else{
                hashMap.put(num,num);
            }
        }
        return arr1;
    }
}


