package leetCode_problems;

/**
 * @author Sahil on 21/08/2024
 */
public class ProblemNo713 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(numSubarrayProductLessThanK(arr,0));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<2){
            return 0;
        }
        int count=0;
        long product=1l;
        int start=0;
        int end=0;
        int numLength=nums.length;
        while(end<numLength){
            product*=nums[end];
            if (product >= k) {
                while (product>=k){
                    product/=nums[start];
                    start++;
                }
            }
            count+=1+(end-start);
            end++;
        }
        return count;
    }
}
