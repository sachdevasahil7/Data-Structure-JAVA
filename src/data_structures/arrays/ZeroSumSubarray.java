package data_structures.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sahil on 05/07/2024
 */
public class ZeroSumSubarray {

    public static void main(String[] args) {
        int[] arr={2, 3, 4, -5, -3, 4, 5};
        System.out.println(new ZeroSumSubarray().zeroSumSubarray(arr));
    }

    public boolean zeroSumSubarray(int[] nums) {
        Set<Integer> set= new HashSet<>();
        set.add(0);
        if (nums.length==0){
            return false;
        }
        if (nums[0]==0){
            return true;
        }
        int sum=0;
        for (int number:nums){
            sum=number+sum;
            if (!set.add(sum)){
                return true;
            }
        }
        return false;
    }
}
