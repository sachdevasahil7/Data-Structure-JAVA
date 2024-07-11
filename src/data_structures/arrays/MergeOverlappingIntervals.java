package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 05/07/2024
 */
public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        new MergeOverlappingIntervals().mergeOverlappingIntervals(arr);
    }
    /*1 2
     * 3 5
     * 4 7
     * 6 8
     * 9 10
     * */

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
//in case of one interval, no merges possible
        if (intervals.length < 1) return intervals;
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int[] previousInterval = intervals[0];
        List<int[]> mergedIntervals = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
// if currentInterval overlaps with previousInterval,
// we merge and update the previousInterval
// we don't add it right away to the result as we need to check it with
// the next intervals
            if (previousInterval[1] >= currentInterval[0]) {
                previousInterval[1] = Math.max(currentInterval[1], previousInterval[1]);
            } else {
// if previousInterval doesn't overlap with currentInterval,
// then we add previousInterval to result and update previousInterval to currentInterval
// we don't add it right away as it needs to be compared with
// the next intervals
                mergedIntervals.add(previousInterval);
                previousInterval = currentInterval;
            }
//                Il if it's the last element of the intervals array, then we
// don't have any more comparisons to be done,
// so add the previous interval to the result
                if (i == intervals.length - 1) {
                    mergedIntervals.add(previousInterval);
                }
            }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
    }