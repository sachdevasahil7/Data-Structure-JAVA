package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 28/01/2024
 */
public class Test {

    public static void main(String[] args) {

//        int[]myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[]myArray = {7, 6, 4, -1, 1, 2};
        List<Integer[]>list=threeSumProblem(myArray,16);
        for (Integer[] arr:list){
            System.out.println(Arrays.toString(arr));
        }
//        System.out.println(findMaxStockProfit(myArray1));
//        findTopTwoScores(myArray);
    }

    public static List<Integer[]> threeSumProblem(int[] arr, int targetSum){
        List<Integer[]> list= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int left=i+1;
            int right=arr.length-2;
            int topRight=arr.length-1-i;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right]+arr[topRight];
                if (sum==targetSum){
                    Integer[] result= new Integer[4];
                    result[0]=arr[i];
                    result[1]=arr[left];
                    result[2]=arr[right];
                    result[3]=arr[topRight];
                    list.add(result);
                } if(sum<targetSum){
                    left=left+1;
                }else {
                    right = right - 1;
                }
            }
        }
        return list;
    }

}
