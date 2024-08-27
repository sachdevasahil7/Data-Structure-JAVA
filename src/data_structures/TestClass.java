package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author Sahil on 23/07/2024
 */
public class TestClass {

    public static void main(String[] args) {
        List<Object>arr= new ArrayList<>();
        List<Object>temp1=new ArrayList<>();
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
        System.out.println(Arrays.toString(arr.toArray()));
        System.out.println(productSum(arr));
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
}
