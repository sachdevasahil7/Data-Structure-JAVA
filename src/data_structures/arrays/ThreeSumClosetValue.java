package data_structures.arrays;

/**
 * @author Sahil on 04/08/2024
 */
public class ThreeSumClosetValue {
    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        new ThreeSumClosetValue().threeSumClosest(nums,1);
    }
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length<4){
            return 0;
        }
        int i=0;
        int j=i+1;
        int k=j+1;
        int closetSum=Integer.MAX_VALUE;
        while(i<nums.length-2){
            int sum=nums[i]+nums[j]+nums[k];
            if((sum-target)<=closetSum){
                closetSum=sum-target;
                i++;
            }
            if (sum>target){
                j++;
            }
            if (sum<target){
                k--;
            }
            if (j+1==k){
                i++;
            }
        }
        return closetSum;
    }

}
