package data_structures.search;

/**
 * @author Sahil on 12/08/2024
 */
public class FindThirdLargest {
    public static void main(String[] args) {
        int[] arr={1,2,-2147483648};
        System.out.println(new FindThirdLargest().thirdMax(arr));
    }
    public int thirdMax(int[] nums) {
        if(nums.length<3){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
        int max=Integer.MIN_VALUE;
        int mid=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i: nums){
            if(i==max||i==mid||i==min){
                continue;
            }
            if(i>max){
                min=mid;
                mid=max;
                max=i;
            }
            else if (i>mid){
                min=mid;
                mid=i;
            }
            else if(i>min){
                min=i;
            }
        }
        return min;
    }
}
