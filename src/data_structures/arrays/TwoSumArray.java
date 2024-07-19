package data_structures.arrays;

import java.util.*;

/**
 * @author Sahil on 26/05/2024
 */
public class TwoSumArray {


    public static void main(String[] args) {
        int[] arr= {3,4,2};
        System.out.println(Arrays.toString(twoSumWithTwoPointer(arr,6)));
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
        int i=0;
        for (int num:arr){
            if (hashMap.containsKey(targetValue-num)){
                arr1[0]=hashMap.get(targetValue-num);
                arr1[1]=i;
                return arr1;
            }else{
                hashMap.put(num,i);

            }
            i++;
        }
        return arr1;
    }


    public static int[] twoSumWithTwoPointer(int[] arr, int targetValue){
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==targetValue){
                int[] result=new int[2];
                result[0]=left;
                result[1]=right;
                return result;
            }
            if (right-1==left){
                left=left+1;
                right=arr.length-1;
                continue;
            }
            right=right-1;
        }
        return new int[] {0,0};
    }
}


