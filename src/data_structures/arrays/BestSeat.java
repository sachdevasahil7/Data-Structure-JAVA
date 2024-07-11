package data_structures.arrays;

/**
 * @author Sahil on 05/07/2024
 */
public class BestSeat {
    public static void main(String[] args) {
//        int[] arr= {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1};
//        int[] arr= {1, 0, 1, 0, 0, 0, 1};
        int[] arr= {1,1, 1};
//        int[] arr= {1, 0, 0,1, 0, 0, 1};
        System.out.println(new BestSeat().bestSeat(arr));
    }
    public int bestSeat(int[] seats) {
        int bestSeat=-1;
        int maxSpace=1;
       if (seats.length<1){
           return bestSeat;
       }
       int leftPointer=0;
        for (int i=1;i<=seats.length-1;i++){
            if (seats[i]==1){
                if (i-leftPointer>maxSpace){
                    maxSpace=i-leftPointer;
                    bestSeat=(i+leftPointer)/2;
                }
                leftPointer=i;
            }
        }

        return bestSeat;
    }

}
