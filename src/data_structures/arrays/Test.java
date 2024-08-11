package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 28/01/2024
 */
public class Test {

    public static void main(String[] args) {

        int[]myArray = {7,1,5,3,6,4};
//        System.out.println(maxProfit(myArray));
//        int[] list=twoSumTwoPointers(myArray,163);
//        System.out.println(Arrays.toString(list));
        System.out.println(getNthFib(2));
    }
    static int first=0;
    static int second=1;
    public static int getNthFib(int n) {  //2
        if(n<=2){
            return second;
        }
        int sum=first+second;
        first=second;
        second=sum;
        return getNthFib(n-1);
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
    public static int[] twoSumTwoPointers(int[] nums, int target) {

        Arrays.sort(nums);
        //{-4,-1,1,3,5,6,8,11}     10
        for(int i=0;i<nums.length-2;i++) { //1st pointer
            int left = i+1; //2nd pointer
            int right = nums.length-1; //3rd pointer
            while (left < right) {
                int sum = nums[i]+nums[left] + nums[right];
                if (sum == target) {
                    return new int[]{left, right};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new int[]{};
    }
    public static int maxProfit(int[] prices) {
        if(prices==null||prices.length<2){
            return 0;
        }
        int i=0;
        int j=1;
        int max=0;
        while(j<prices.length){
            int I=prices[i];
            int J=prices[j];
            if(I>=J){
                i=j;
                j++;
            }else{
                int diff=J-I;
                if(max<diff){
                    max=diff;
                }
                j++;
            }
        }
        return max;
    }





}
