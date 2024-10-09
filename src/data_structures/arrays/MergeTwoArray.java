package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 10/09/2024
 */
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr={0};
        int[] arr2={1};
        new MergeTwoArray().merge(arr,0,arr2,1);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
       int w=m+n-1;
       while (j>=0){
           if(i>=0&&nums1[i]>nums2[j]){
            nums1[w]=nums1[i];
            i--;
           }else{
               nums1[w]=nums2[j];
               j--;
           }
           w--;
       }
        System.out.println(Arrays.toString(nums1));
    }
}
