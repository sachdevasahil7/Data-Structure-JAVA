package data_structures.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 23/08/2024
 */
public class Permutation {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>tempList= new ArrayList<>();
        new Permutation().helper(arr,result,tempList);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public void helper(int [] nums,List<List<Integer>>resultList,List<Integer>temList){
        if(temList.size()== nums.length){
            resultList.add(new ArrayList<>(temList));
            return;
        }
        for(int number:nums){
            if (temList.contains(number)){
                continue;
            }
            temList.add(number);
            helper(nums,resultList,temList);
            temList.remove(temList.size()-1);
        }
    }
}
