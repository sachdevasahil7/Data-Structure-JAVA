package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 10/08/2024
 */
public class MinimumMaximum {


    public static void main(String[] args) {
        int[] arr = {20,-40,-6,-79,-85,-95};
        System.out.println(inimumDeletions(arr));
//        System.out.println(minimumDeletions(arr));
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
    public static int inimumDeletions(int[] arr) {
        int min=arr[0],max=arr[arr.length-1];
        int left=1,right=arr.length-2;
        int minIndex=0,maxIndex=arr.length;
        if (min>max){
            min=max;
            max=arr[0];
            minIndex=maxIndex;
            maxIndex=0;
        }
        while(left<right){
            if (arr[left]<min){
                min=arr[left];
                minIndex=left;
            } if(arr[right]>max){
                max=arr[right];
                maxIndex=right;
            } if(arr[right]<min){
                min=arr[right];
                minIndex=right;
            } if (arr[left]>max){
                max=arr[left];
                maxIndex=left;
            }
            left++;
            right--;
        }
        if(minIndex>maxIndex){
            int temp=minIndex;
            minIndex=maxIndex;
            maxIndex=temp;
        }
        int result=0;
        if(maxIndex<arr.length/2){
           result=minIndex+maxIndex;
        }else{
            result=(minIndex+1)+maxIndex-arr.length-1;
        }
        return result;
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
