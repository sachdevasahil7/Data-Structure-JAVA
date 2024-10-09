package data_structures;

import java.util.*;


/**
 * @author Sahil on 23/07/2024
 */
public class TestClass {

    public static void main(String[] args) {
        List<Object>arr= new ArrayList<>();
        List<Object>temp1=new ArrayList<>();
//        int[] arr2={1,0};
        int[] arr2={2};
        arr.add(5);
        arr.add(2);
        temp1.add(7);
        temp1.add(-1);
        arr.add(temp1);
        arr.add(3);
        List<Object>temp=new ArrayList<>();
        List<Object>temp2=new ArrayList<>();
        temp.add(6);
        temp2.add(-13);
        temp2.add(8);
        temp.add(temp2);
        temp.add(4);
        arr.add(temp);
//        System.out.println(Arrays.toString(arr.toArray()));
        System.out.println(removeElement(arr2,3));
        int[] arr3={-5, -2, 5, 2, 4, 7, 1, 8, 0,-8};
        int[] arr14={5,0,0,6,1,6,2,2,4};
//        System.out.println(Arrays.toString(intersection(arr3,arr14)));
//        System.out.println(Arrays.toString(arrange(arr2,arr2.length)));
    }



    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int posIndex = 0;  // To hold even indices for positive numbers
        int negIndex = 1;  // To hold odd indices for negative numbers

        for (int num : nums) {
            if (num > 0) {
                ans[posIndex] = num;
                posIndex += 2;  // Move to the next even index
            } else {
                ans[negIndex] = num;
                negIndex += 2;  // Move to the next odd index
            }
        }

        return ans;
    }




    public static int subarraySum(int[] nums, int k) {
        int largestSum=nums[0];
        int sum=0;
        int count=0;
        for(int i=1;i<nums.length;i++){
            largestSum=largestSum+nums[i];
        }
        for(int i =0;i<nums.length;i++){
            sum=sum+nums[i];
            int diff=largestSum-sum;
            if(diff<k){
                continue;
            }
            else if(diff==k){
                count+=1;
                sum=0;
            }else{
                sum=0;
            }
        }
        return count;
    }

    static int sum=0;
    public static int productSum(List<Object> array) {
        return calulcate(array,0,0,1);
    }
    public static int calulcate(List<Object>list,int index,int sum,int depth){
        if(list.size()==index){
            return sum*depth;
        }
        Object element=list.get(index);
        if (element instanceof ArrayList<?>){
            sum+=calulcate((ArrayList)element,0,0,depth+1);
        }else {
            sum += (int) element;
        }
        return calulcate(list,index+1,sum,depth);
    }
    //0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0
    public static int peakElement(int[] arr,int n){
        int peak=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                peak=i;
            }
        }
        return peak;
}
    static long[] arrange(long arr[], int n){
        //4, 0, 2, 1, 3};
        //[3, 4, 2, 0, 1]
        long[] result=new long[n];
        for(int i=0;i<n;i++){
            result[i]=arr[Long.valueOf(arr[i]).intValue()];
        }
        return result;
    }

    public static int removeElement(int[] nums, int val) {

        int p1=0;
        int p2=1;
        int count=0;
        if(nums.length==1){
           return nums[0];
        }
        while(p1<nums.length&&p2<nums.length){
            if(nums[p1]!=val){
                nums[count]=nums[p1];
                count+=1;

            }
            if(nums[p2]!=val){
                nums[count]=nums[p2];
                count+=1;
            }
            p1+=2;
            p2+=2;
        }
        return count;
    }



    public static int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer>set= new HashSet<>();
    Set<Integer>list= new HashSet<>();
    for (int i: nums1){
       set.add(i);
        }
    for(int i:nums2){
        if(set.contains(i)){
            list.add(i);
        }
    }
    int[]result= new int[list.size()];
    int i=0;
    for(Integer n:list){
        result[i]=n;
        i++;
    }
    return result;
    }
}
