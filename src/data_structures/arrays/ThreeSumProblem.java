package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 02/07/2024
 */
public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] arr={12, 3, 1, 2, -6, 5, -8, 6};
//        int[] arr={8, 10, -2, 49, 14};
        List<Integer[]> result=threeNumberSum(arr,0);
        for (Integer[]ar:result){
            System.out.println(Arrays.toString(ar));
        }
    }
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
      List<Integer[]> result= new ArrayList<>();
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++){
            int left=i+1;
            int right=array.length-1;
            while (left<right){
                int sum=array[i]+array[left]+array[right];
                if (sum==targetSum){
                    Integer[] arr= new Integer[3];
                    arr[0]=array[i];
                    arr[1]=array[left];
                    arr[2]=array[right];
                    result.add(arr);
                    left+=1;
                    right-=1;
                }
               else if (sum<targetSum){
                    left+=1;
                }
                else{
                    right-=1;
                }
            }
        }
        return result;
    }
}
