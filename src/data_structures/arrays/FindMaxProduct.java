package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 09/04/2024
 */
public class FindMaxProduct {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        System.out.println(Arrays.toString(findMaxProduct(intArray))); // (40,50)
    }
    public static int[] findMaxProduct(int[] arr){
        int[] result= new int[2];
        int n= arr[arr.length-1];
        int max=0;
        int min=Integer.MIN_VALUE;
        int maxNaturalSum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            if (maxNaturalSum-arr[i]>max){
                min=max;
                max=arr[i];
            }
        }
        result[0]=min;
        result[1]=max;
        return result;
    }
}
