package data_structures.arrays;

import java.sql.SQLOutput;

/**
 * @author Sahil on 20/10/2024
 */
public class FirstDuplicateValue {
    public int firstDuplicateValue(int[] array) {
        for(int i=0;i<array.length;i++){
            int value= Math.abs(array[i]);
            if(array[value-1]<0){
                return value;
            }
            array[value-1]=-array[value-1];
        }
        return -1;
    }


    public static void main(String[] args) {
         int[] arr={2, 1, 5, 3, 3, 2, 4};
        System.out.println(new FirstDuplicateValue().firstDuplicateValue(arr));
    }
    }
