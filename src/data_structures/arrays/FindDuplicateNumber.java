package data_structures.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 08/04/2024
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] duplicate={3,5,2,4};

        System.out.println(maxNumOfMarkedIndices(duplicate));
    }
    public static int maxNumOfMarkedIndices(int[] nums) {
        int count=0;
        int left=0;
        int median=nums.length+1/2;
        int right=median+1;
        Arrays.sort(nums);
        while(left<=median){
            boolean result=2*nums[left]<=nums[right];
            if(result){
                count=count+2;
            }
            if(right==nums.length-1){
                left=left+1;
                right=nums.length-1;
                continue;
            }
            right=right+1;
        }
        return count;
    }
    public static  int countPairs(List<Integer> nums, int target) {
        int count=0;
        int left=0;
        int right=nums.size()-1;
        while(left<right){
            int sum=nums.get(left)+nums.get(right);
            if(sum<target){
                count++;
            }
            if(left==right-1){
                left=left+1;
                right=nums.size()-1;
                continue;
            }
            right=right-1;
        }
        return count;
    }
    public static int [] findDuplicateInArray(int[] arr){
        int[] uniqueArr= new int[arr.length];
        int counter=0;
        for (int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for (int j =i+1; j< arr.length;j++){
                if (arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate){
                uniqueArr[counter++]=arr[i];
            }
        }
        return Arrays.copyOf(uniqueArr,counter);
    }
}
