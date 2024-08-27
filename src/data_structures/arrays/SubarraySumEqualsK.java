package data_structures.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sahil on 11/08/2024
 */
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {-1,-1,1};
        System.out.println(calculate(arr, 0));
    }

    public static int calculate(int[] arr, int value) {
        Map<Integer,Integer> map= new HashMap<>();
//        map.put(0,1);
        int currentSum = 0;
        int count = 0;
        for (int num : arr) {
            currentSum += num;
            if(map.containsKey(currentSum-value)){
                count+=map.get(currentSum-value);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}