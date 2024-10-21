package data_structures.arrays;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author Sahil on 19/07/2024
 */
public class LongestSubarrayWithSum {
    public static void main(String[] args) {
        int[]arr={1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(longestSubarrayWithSum(arr,15)));
    }
    public static int[] longestSubarrayWithSum(int[] arr, int target) {
        int[] result = new int[]{-1, -1};
        int sum=0;
        int endIndex=0;
        int startIndex=0;
        int max=-1;
        while(endIndex<arr.length) {
            sum += arr[endIndex]; ///first endIndex increase 15+6=21
            if (sum==target){ ///sum==target
                int currentDiff=endIndex-startIndex;  //endIndex index and startIndex index   4 --->6
                if(max<currentDiff){
                    max=currentDiff;
                    result[0]=startIndex;
                    result[1]=endIndex;
                }
            }
            endIndex++;
            while (sum>target){  //sum>target 21   15
                sum-=arr[startIndex]; //21-1 ==20-2 =18 -3=
                startIndex++;
                }
            }
        return result;
    }
}
