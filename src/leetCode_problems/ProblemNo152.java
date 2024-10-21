package leetCode_problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author Sahil on 24/08/2024
 */
public class ProblemNo152 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
        Set<Character> set=new HashSet<>();
        int[] nums={-2,0,-1};
        int ans=nums[0];
        int leftProduct=1;
        int rightProduct=1;
        for(int i=0;i<nums.length;i++){
            leftProduct=leftProduct==0?1:leftProduct;
            rightProduct=rightProduct==0?1:rightProduct;
            rightProduct=nums[nums.length-1-i]*rightProduct;
            leftProduct=nums[i]*leftProduct;
            ans=Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        System.out.println(ans);
    }
}
