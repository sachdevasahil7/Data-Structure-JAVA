package leetCode_problems;

/**
 * @author Sahil on 21/08/2024
 */
public class ProblemNo2302 {
    public static void main(String[] args) {
        int[] arr={2,1,4,3,5};
        System.out.println(countSubarrays(arr,10));
    }
    public static long countSubarrays(int[] nums, long k) {
        long result=0l; int counter=0;
        long sum=0;
        int start=0;
        int end=0;
        long product=0;
        int n=nums.length;
        while(end<n){
            counter++;
            sum+=nums[end];
            product=sum*counter;
            while(product>=k){
                sum-=nums[start];
                counter--;
                start++;
                product=sum*counter;

            }
            result+=(end-start+1);
            end++;
        }
        return  result;
    }
}
