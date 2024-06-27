package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 17/06/2024
 */
public class MoveElementToEnd {


    public static void main(String[] args) {
        Integer[] arr = {2, 1, 2, 2, 2, 3, 4, 2};
        List<Integer> result = new MoveElementToEnd().moveElementToEnd(Arrays.asList(arr), 2);
        System.out.println(Arrays.toString(result.toArray()));
    }


    public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        List<Integer> result = new ArrayList<>();
        int count = 0;

        // Move all non-toMove elements to the front of the list
        for (Integer num : array) {
            if (num != toMove) {
                result.add(num);
                count++;
            }
        }

        // Append toMove elements to the end
        for (int i = 0; i < array.size() - count; i++) {
            result.add(toMove);
        }

        return result;
    }
}
