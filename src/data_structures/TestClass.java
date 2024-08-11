package data_structures;

import java.util.Arrays;


/**
 * @author Sahil on 23/07/2024
 */
public class TestClass {

    public static void main(String[] args) {
        int[] arr= {1,1,2,3,3,4,4,5,6,6,6,7,8,8};
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[index]=arr[i];
                index++;
            }
            if(i==arr.length-2){
                arr[index]=arr[i+1];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }
