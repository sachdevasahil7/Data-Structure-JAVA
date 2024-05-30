package data_structures.arrays;

import java.util.Arrays;

/**
 * @author Sahil on 30/05/2024
 */
public class NonConstructibleChange {


    /*
    *
    * 1 step sort array
    * 2: add all coins in array starting from 0
    * 3: if change +1 is greater than next element of array that is the not available change
    *
    * */
    public static void main(String[] args) {
        int[] coins ={5, 7, 1, 1, 2, 3, 22};
        int[] coinsNew ={1, 1, 1, 1, 1};
        //{1,1,2,3,5,7,22}
        System.out.println(new NonConstructibleChange().nonConstructibleChange(coinsNew));
    }
    public int nonConstructibleChange(int[] coins) {
        if (coins.length<=1){
            return 1;
        }
            int change=0;
        Arrays.sort(coins);
        for (int i =0;i <coins.length;i++){
            if (change+1<coins[i]){
                System.out.println(change+1);
                return change+1;
            }
            change+=coins[i];
        }
        return change+1;
    }
}
