package leetCode_problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sahil on 21/08/2024
 */
public class ProblemNo974 {

    public static void main(String[] args) {
        int[] arr={4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(arr,5));
        Math.min(1,3);
    }
    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> count= new HashMap<>();
        count.put(0,1);
        int result=0;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            int mod=sum%k;
            if (mod<0){
                mod=mod+k;
            }
            if(count.containsKey(mod)){
                result+=count.get(mod);
                count.put(mod,count.get(mod)+1);
            }else{
                count.put(mod,count.getOrDefault(mod,0)+1);
            }
        }
        return result;
    }

}
