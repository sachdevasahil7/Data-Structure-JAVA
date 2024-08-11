package data_structures.arrays;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author Sahil on 19/07/2024
 */
public class LongestSubarrayWithSum {
    public static void main(String[] args) {
        int[]arr={0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
        System.out.println(Arrays.toString(longestSubArray(arr,1)));
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
    public static int[] longestArray(int[] array,int target){
        TreeMap<Integer,Integer[]>map= new TreeMap<>();
        int index=0;
        int j=index+1;
        int sum=array[index];
        while(index<array.length-2){
            if (j==array.length){
                index++;
                j=index;
                sum=array[index];
            }
            sum=sum+array[j];
            if(sum==target){
                map.put(j-index,new Integer[]{index,j});
                index++;
                j=index;
                sum=array[index];
            }else  if (sum>target){
                index++;
                j=index;
                sum=array[index];
            }
            j++;
        }
        if (!map.isEmpty())
        return Arrays.stream(map.lastEntry().getValue()).mapToInt(Integer::intValue).toArray();
       return new int[]{};
    }

    public static int[] longestSubArray(int[] array,int target){
        TreeMap<Integer,Integer[]>map= new TreeMap<>();
        int index=0;
        int j=1;
        int sum=array[index];
        while(index<array.length-2&&j<array.length-1){
          sum=sum+array[j];
          if(sum==target){
              map.put(j-index,new Integer[]{index,j});
              index=j;
          }
          else if(sum>target){
              index++;
              j=index+1;
              sum=array[index];
          }else{
              j++;
          }
        }
        if (!map.isEmpty())
            return Arrays.stream(map.lastEntry().getValue()).mapToInt(Integer::intValue).toArray();
        return new int[]{};
    }



}
