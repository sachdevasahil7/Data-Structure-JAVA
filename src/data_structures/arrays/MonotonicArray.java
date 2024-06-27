package data_structures.arrays;

/**
 * @author Sahil on 17/06/2024
 */
public class MonotonicArray {

    public static void main(String[] args) {
//        int[] arr={-1, -5, -10, -1100, -900, -1101, -1102, -9001};
//        int[] arr={-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        int[] arr={2,1};
        System.out.println(isMonotonic(arr));
    }
    public static boolean isMonotonic(int[] array) {
        if (array==null){
            return false;
        }
       boolean flag=true;
       int smallestNumber=Integer.MIN_VALUE;
       for (int num:array){
           num=Math.abs(num);
           if (smallestNumber > num) {
               flag=false;
           }
           smallestNumber = num;
       }
        return flag;
    }
}
