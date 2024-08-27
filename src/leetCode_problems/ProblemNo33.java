package leetCode_problems;

/**
 * @author Sahil on 27/08/2024
 */
public class ProblemNo33 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2}; //SEARCH IN ROTATED ARRAY
        System.out.println(new ProblemNo33().search(arr,0));
    }
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1,ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
            }
            if(nums[mid]>=nums[0]){
                if(nums[start]<=target&&nums[mid]>=target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[mid]<=target&&nums[end]>=target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}
