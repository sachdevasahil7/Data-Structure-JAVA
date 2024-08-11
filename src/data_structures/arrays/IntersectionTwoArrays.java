package data_structures.arrays;

import java.util.*;

/**
 * @author Sahil on 02/08/2024
 */
public class IntersectionTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersectionTwoArrays(int [] arr,int[] arr2){
        Map <Integer,Integer> arrMap= new HashMap<>();
        List<Integer>list= new ArrayList<>();
        for (int i:arr){
            arrMap.put(i,arrMap.getOrDefault(i,0)+1);
        }
        for (int i:arr2){
            if (arrMap.get(i)!=null&&arrMap.get(i)>0){
                list.add(i);
                arrMap.put(i,arrMap.get(i)-1);
            }
        }
        int [] result = new int[list.size()];
        int index=0;
        for (int i:list){
            result[index]=i;
            index++;
        }
    return result;
    }
    public int[] intersectionTwoArray(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Integer>list = new ArrayList<>();
        int arr1Length=arr1.length-1;
        int arr2Length=arr2.length-1;
        int i=0,j=0;
        while(i<arr1Length&&j<arr2Length){
            if (arr1[i]<arr2[j]){
                i++;
            }
            else if (arr1[i]>arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] result= new int[list.size()];
        int index=0;
        for (int num :list){
            result[index]=num;
            index++;
        }
        return result;
    }


}
