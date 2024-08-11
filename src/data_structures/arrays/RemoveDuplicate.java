package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 17/07/2024
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,5,6,6,6,7};
            System.out.println(new RemoveDuplicate().removeDuplicates(arr));
    }
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=0; i<=nums.length-2;i++){
            if(nums[i]!=nums[i+1]){
                nums[index++]=nums[i+1];
            }

        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
    public int removeTwiceDuplicates(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-2 && nums[i]==nums[i+2]){
                continue;
            }
            nums[c]=nums[i];
            c++;
        }
        return c;
    }
}
