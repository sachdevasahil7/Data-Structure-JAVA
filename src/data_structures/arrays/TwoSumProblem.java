package data_structures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sahil on 09/04/2024
 */
public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,12,6};
        System.out.println(Arrays.toString(twoSum(nums,14)));
    }
    public static int[] twoSum(int[] arr,int target){
        int[] result= new int[2];
        Map<String,Object> hashmap= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (hashmap.containsKey(String.valueOf(target-arr[i]))){
                result[1]=i;
                result[0]=(int)hashmap.get(String.valueOf(target-arr[i]));
                return result;
            }
            else{
                hashmap.put(String.valueOf(arr[i]),i);
            }
        }
        return result;
    }
}
