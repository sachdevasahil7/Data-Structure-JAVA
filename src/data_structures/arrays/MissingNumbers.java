package data_structures.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Sahil on 05/07/2024
 */
public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr={};
        System.out.println(Arrays.toString(new MissingNumbers().missingNumbers(arr)));
    }
    public int[] missingNumbers(int[] nums) {
        if(nums.length==0){
            return new int[]{1,2};
        }
        Set<Integer> set= new HashSet<Integer>();
        int[] result=new int[2];
        int counter=0;
        for(Integer number:nums){
            set.add(number);
        }
        for(int i=1;i<=nums.length+2;i++){
            if(!set.contains(i)){
                result[counter]=i;
                counter+=1;
            }
        }
        return result;
    }
}
