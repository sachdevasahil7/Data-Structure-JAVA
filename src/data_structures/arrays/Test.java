package data_structures.arrays;

import java.util.*;

/**
 * @author Sahil on 28/01/2024
 */
public class Test {

    static int first = 0;
    static int second = 1;

    public static void main(String[] args) {

        int[] myArray = {7, 1, 5, 3, 6, 4};
//        System.out.println(maxProfit(myArray));
//        int[] list=twoSumTwoPointers(myArray,163);
//        System.out.println(Arrays.toString(list));
//        System.out.println(getNthFib(2));
            char[] chars={'h','e','l','l','o'};
        System.out.println(new Test().reverseString(chars));
    }

    public static int longestStreakOfAdjacentOnes(int[] array) {
        Map<Integer, Integer> map = new TreeMap<>();
        int start = 0;
        int end = 1;
        boolean carryUsed = false;
        int count = 0;
        while (end < array.length) {
            if (array[start] == 1) {
                if (array[end] == 0) {
                    if (!carryUsed) {
                        carryUsed = true;
                    } else {
                        start++;
                        end = start;
                        carryUsed = false;
                    }
                }
            } else {
                if (!carryUsed) {
                    carryUsed = true;
                }
                count += 1;
                end += 1;
            }
        }
        return 0;
    }


    public static int getNthFib(int n) {  //2
        if (n <= 2) {
            return second;
        }
        int sum = first + second;
        first = second;
        second = sum;
        return getNthFib(n - 1);
    }
    public boolean reverseString(char[] s) {
            int end=s.length-1;
            int start=0;
            while (start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
        return false;
    }

    public static void rotateArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7}, newArray = new int[arr.length];

        //rotate()
        //k-1
        //rotate()
        int n = 2, l = arr.length, forward = 0, back = l - n;

        for (int i = 0; i < arr.length; i++) {
            if (i < n) {
                newArray[back] = arr[i];
                back++;
            } else {
                newArray[forward] = arr[i];
                forward++;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }


    public static List<Integer[]> threeSumProblem(int[] arr, int targetSum) {
        List<Integer[]> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int left = i + 1;
            int right = arr.length - 2;
            int topRight = arr.length - 1 - i;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right] + arr[topRight];
                if (sum == targetSum) {
                    Integer[] result = new Integer[4];
                    result[0] = arr[i];
                    result[1] = arr[left];
                    result[2] = arr[right];
                    result[3] = arr[topRight];
                    list.add(result);
                }
                if (sum < targetSum) {
                    left = left + 1;
                } else {
                    right = right - 1;
                }
            }
        }
        return list;
    }

    public static int[] twoSumTwoPointers(int[] nums, int target) {

        Arrays.sort(nums);
        //{-4,-1,1,3,5,6,8,11}     10
        for (int i = 0; i < nums.length - 2; i++) { //1st pointer
            int left = i + 1; //2nd pointer
            int right = nums.length - 1; //3rd pointer
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
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
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int max = 0;
        while (j < prices.length) {
            int I = prices[i];
            int J = prices[j];
            if (I >= J) {
                i = j;
                j++;
            } else {
                int diff = J - I;
                if (max < diff) {
                    max = diff;
                }
                j++;
            }
        }
        return max;
    }


}
