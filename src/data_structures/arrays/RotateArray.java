package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 11/08/2024
 */
public class RotateArray {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
        new RotateArray().rotate(arr,4);
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);
    }

    public int[] rotateArray(int[] arr,int startIndex,int endIndex){
        while (startIndex<endIndex){
            int temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
        return arr;
    }
}
