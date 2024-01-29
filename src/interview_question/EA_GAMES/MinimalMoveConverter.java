package interview_question.EA_GAMES;

/**
 * @author Sahil on 26/01/2024
 */
public class MinimalMoveConverter {
    public static int minimalMoves(String A, String B) {
        int moves = 0;
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();

        for (int i = 0; i < B.length(); i++) {
            if (aArray[i] != bArray[i]) {
                int index = findMatchingIndex(aArray, bArray[i], i);
                if (index != -1) {
                    swap(aArray, i, index);
                } else {
                    aArray[i] = bArray[i];
                }
                moves++;
            }
        }
        return moves;
    }

    private static int findMatchingIndex(char[] arr, char target, int startIndex) {
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String A = "adb";
        String B = "dba";
        System.out.println("Minimal moves: " + minimalMoves(A, B));
    }
}