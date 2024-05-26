package data_structures.arrays;

/**
 * @author Sahil on 08/04/2024
 */
public class FindMissingNumber {
    public static void main(String[] args) {
       int[] myArray = {1,2,3,4,6};
        System.out.println(findMissingNumber(myArray));
    }
    public static int findMissingNumber(int[] arr){
        int n=arr[arr.length-1];
        int sumOfNaturalNumber=(n*(n+1))/2;
        int actualSum=0;
        for(int array:arr){
            actualSum+=array;
        }
        System.out.println(sumOfNaturalNumber);
        System.out.println(actualSum);
        return sumOfNaturalNumber-actualSum;
    }
}
