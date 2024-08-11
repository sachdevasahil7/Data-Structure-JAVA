package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 11/08/2024
 */
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[]arr={4, 3, 2, 7, 2, 3, 1};
        System.out.println(Arrays.toString(findDuplicates(arr).toArray()));
    }
//this method only good when we have condition that the number of elements are not greater than the
// index of array
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultSet = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                resultSet.add(index + 1);
            }
            nums[index] = nums[index] * -1;
        }
        return resultSet;
    }
}
