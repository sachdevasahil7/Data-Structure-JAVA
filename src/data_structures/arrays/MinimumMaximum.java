package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 10/08/2024
 */
public class MinimumMaximum {


    public static void main(String[] args) {
        int[] arr = {0,-4,19,1,8,-2,-3,5};
//        System.out.println(Arrays.toString(findMinMAx(arr)));
        System.out.println(minimumDeletions(arr));
    }
    public static int[] findMinMAx(int[] arr){
        int min=arr[0];
        int max=arr[1];
        for (int i=2;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return new int[]{min,max};
    }


    public static int minimumDeletions(int[] nums) {
        if(nums.length<2){
            return 1;
        }
        if(nums.length<3){
            return 3;
        }
        int min=nums[0];
        int max=nums[1];
        int minIndex=1;
        int maxIndex=2;
        if (min>max){
            max=nums[0];
            min=nums[1];
            minIndex=2;
            maxIndex=1;
        }

        for (int i=2;i<nums.length;i++){
            if (nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
            if (nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        if(maxIndex<nums.length/2&&minIndex<nums.length/2){
            return minIndex+maxIndex;
        }
        else{
            int diff=0;
            if(minIndex>maxIndex){
                System.out.println("min : "+minIndex);
                diff=nums.length-minIndex;
                System.out.println("min : "+diff);
                return diff+maxIndex;
            }else{
                diff=nums.length-maxIndex;
                return diff+maxIndex;
            }
        }
    }
}
