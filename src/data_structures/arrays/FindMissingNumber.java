package data_structures.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sahil on 08/04/2024
 */
public class FindMissingNumber {
    public static void main(String[] args) {
       int[] myArray = {11,12,13,14,16};
        System.out.println(findMissing(myArray));
    }
    public static int findMissingNumber(int[] arr){
        int n=arr[arr.length-1];
        int sumOfNaturalNumber=(n*(n+1))/2;
        int actualSum=0;
        for(int array:arr){
            actualSum+=array;
        }
        return sumOfNaturalNumber-actualSum;
    }

    public static int findMissing(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        int missingNum=Integer.MIN_VALUE;
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=arr[i-1]+1){
                missingNum=arr[i-1]+1;
                break;
            }
        }
        return missingNum;
    }
}
