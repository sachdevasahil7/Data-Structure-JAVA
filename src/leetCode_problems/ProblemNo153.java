package leetCode_problems;

/**
 * @author Sahil on 26/08/2024
 */
public class ProblemNo153 {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(new ProblemNo153().findMin(arr));
    }
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1,ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                ans=Math.min(ans,nums[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
}
