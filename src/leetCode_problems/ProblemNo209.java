package leetCode_problems;

/**
 * @author Sahil on 21/08/2024
 */
public class ProblemNo209 {
    public static void main(String[] args) {
        int[] arr={1,4,4};
        System.out.println(minSubArrayLen(1,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
    int end=0,start=0,total=Integer.MAX_VALUE,sum=0,n=nums.length;
    while (end<n){
        sum+=nums[end];
        while (sum>=target){
            sum-=nums[start];
            total=Math.min(total,end-start+1);
            start++;
        }
        end++;
    }
    return total==Integer.MAX_VALUE?0:total;
    }
}
