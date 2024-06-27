package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 17/06/2024
 */
public class SmallestDifference {
    public static void main(String[] args) {
        int [] arr1={-1, 5, 10, 20, 28, 3};
        int [] arr2={26, 134, 135, 15, 17};
        System.out.println(Arrays.toString(new SmallestDifference().getSmallestDiff(arr1,arr2)));
    }


    public int[] getSmallestDiff(int[] arr1, int[]arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] result={0,0};
        int arr1_pointer=0;
        int arr2_pointer=0;
        int smallestDiff=Integer.MAX_VALUE;
        while(arr1_pointer<arr1.length&&arr2_pointer<arr2.length){
            int array1_value=arr1[arr1_pointer]; //array_1 value as per index(pointer)
            int array2_value=arr2[arr2_pointer]; //array_2 value as per index(pointer)
            int diff=Math.abs(array2_value-array1_value);

            if (smallestDiff>=diff){ //compare smallest value
                smallestDiff=diff;
                result[0]=array1_value;
                result[1]=array2_value;
            }
            if (array1_value<array2_value){ //value_1 smaller than value_2 then increment in pointer_1(array_1 index)
                arr1_pointer=arr1_pointer+1;
            }else{
                arr2_pointer=arr2_pointer+1; //otherwise increment array_2 pointer(array_2index)
            }
        }
        return result;
    }
}
