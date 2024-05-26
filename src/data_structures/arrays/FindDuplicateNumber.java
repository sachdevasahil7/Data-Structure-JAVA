package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 08/04/2024
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] duplicate={1, 1, 2, 2, 3, 4, 5};
        findDuplicateInArray(duplicate);
    }
    public static int [] findDuplicateInArray(int[] arr){
        int[] uniqueArr= new int[arr.length];
        int counter=0;
        for (int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for (int j =i+1; j< arr.length;j++){
                if (arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate){
                uniqueArr[counter++]=arr[i];
            }
        }
        return Arrays.copyOf(uniqueArr,counter);
    }
}
