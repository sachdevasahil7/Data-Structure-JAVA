package data_structures.arrays;

/**
 * @author Sahil on 08/04/2024
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2,3,4,5,6,6,7,8};
        System.out.println(removeDuplicate(nums));
        int[] numsw = {1, 1, 2,3,4,5,6,6,7,8};
        System.out.println(removeDuplicates(numsw));
    }

    public static int removeDuplicate(int [] nums){
        int i=0;
        for(int j = 1; j < nums.length;j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
