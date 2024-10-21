package data_structures.arrays;

import java.util.*;

/**
 * @author Sahil on 14/07/2024
 */
public class LargestRange {
    public static void main(String[] args) {
//        int[] arr={8, 4, 2, 10, 3, 6, 7, 9, 1};
//        int[] arr={1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        int[] arr={0, -5, 9, 19, -1, 18, 17, 2, -4, -3, 10, 3, 12, 5, 16, 4, 11, 7, -6, -7, 6, 15, 12, 12, 2, 1, 6, 13, 14, -2};
        //0,1,2,3,4,5,6,7,10,11,12,15

        System.out.println(Arrays.toString(largestRange(arr)));
    }
    public static int[] largestRange(int[] arr) {
        int[] result=new int[2];
        Set<Integer> set= new TreeSet<>();

        int prevCount=0;
        for (int num:arr){
            set.add(num);
        }
         arr= set.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i+1]==arr[i]+1){
                int endRange=calculateRange(arr,i);
                if (endRange>prevCount){
                    prevCount=endRange;
                    result[0]=arr[i];
                    result[1]=arr[i+endRange];
                }
            }
        }
        return  result;
    }
    public static int calculateRange(int[] arr, int startIndex){
        int endRange=0;
        for(int i=startIndex;i<=arr.length-2;i++){
            if (arr[i+1]==arr[i]+1){
                endRange+=1;
            }else{
                break;
            }
        }
        return endRange;
    }
}
