package data_structures.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sahil on 23/06/2024
 */
public class LongestPeak {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(arr));
    }
    public static int longestPeak(int[] array) {
        int longestPeak=0;
        Set<Integer> set= new HashSet<>();
        if(!set.add(longestPeak)){

        }
        for (int i=1;i<array.length-1;i++) {
            boolean isPeak = array[i - 1] < array[i] && array[i + 1] < array[i];
            if (isPeak) {
                int leftDirection = 0;
                int rightDirection = 0;
                for (int left = i; left >= 1; left--) {
                    if (array[left] > array[left - 1]) {
                        leftDirection += 1;
                    } else {
                        break;
                    }
                }
                for (int right = i; right <= array.length - 2; right++) {
                    if (array[right] > array[right + 1]) {
                        rightDirection += 1;
                    } else {
                        break;
                    }
                }
                int totalElements = rightDirection + leftDirection+1;
                longestPeak = Math.max(longestPeak, totalElements);
            }
        }
        return longestPeak;
    }
}
