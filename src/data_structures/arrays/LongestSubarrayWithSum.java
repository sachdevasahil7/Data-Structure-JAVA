package data_structures.arrays;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author Sahil on 19/07/2024
 */
public class LongestSubarrayWithSum {
    public static void main(String[] args) {
        int[]arr={61, 54, 1, 499, 2212, 4059, 1, 2, 3, 1, 3};
        System.out.println(Arrays.toString(longestSubarrayWithSum(arr,19)));
    }


    public static int[] longestSubarrayWithSum(int[] array, int targetSum) {
        if(array.length==1){
            if (array[0]==targetSum){
                return new int[]{0};
            }else{
                return new int[]{};
            }
        }
        TreeMap<Integer,Integer[]> map= new TreeMap<>();
        for(int i=0;i<array.length-1;i++){
            int startIdx=array[i];
            if (startIdx==targetSum){
                map.put(1 , new Integer[]{i, i});
            }
            int left=i+1;
            int sum=startIdx+array[left];
            while(targetSum>=sum) {
                if (sum == targetSum) {
                    map.put(left-i , new Integer[]{i, left});
                }
                    left = left + 1;

                if (left>=array.length){
                    break;
                }
                sum=sum+array[left];
            }
        }
        if (!map.isEmpty()) {
            return Arrays.stream(map.get(map.lastKey()))
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
        return new int[]{0};
    }

}
