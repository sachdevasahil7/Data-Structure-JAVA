package data_structures.search;

/**
 * @author Sahil on 12/08/2024
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(binarySearch(arr,0));
    }
    public static int binarySearch(int[] array, int target) {
        int median =array.length/2;
        int left=median;
        int right=array.length-median;
        int index=-1;
        if(target<array[left]){
            while(left>=0){
                if(target==array[left]){
                    index=left;
                    break;
                }
                left--;
            }
        }
        else{
            while(right<array.length){
                if(target==array[right]){
                    index=right;
                    break;
                }
                right++;
            }
        }
        return index;
    }

}
