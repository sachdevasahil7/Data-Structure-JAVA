package data_structures.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 26/05/2024
 */
public class ValidateSubsequence {
    public static void main(String[] args) {
    Integer[] array={5, 1, 22, 25, 6, -1, 8, 10};
    Integer[] sequence={1, 6, -1, 10};
//        System.out.println(isValidSubsequence(Arrays.asList(array),Arrays.asList(sequence)));
        Integer i= 140;
        Integer i2=-110;
        int i3= 140;
        Integer i4=-110;

        System.out.println(i==i3);
        System.out.println(i.equals(i3));
    }


    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence) {
       if (array.size()<sequence.size()){
           return false;
       }
        int index=0;
        for (int num:array){
            if (num==sequence.get(index)){
                index+=1;
            }
            if (index==sequence.size()){
                return true;
            }
        }
        return false;
    }
}
