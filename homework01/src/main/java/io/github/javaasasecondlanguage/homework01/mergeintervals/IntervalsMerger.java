package io.github.javaasasecondlanguage.homework01.mergeintervals;

import java.util.*;

public class IntervalsMerger {
    public class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            if (o1[0] < o2[0]) {
                return -1;
            } else if (o1[0] > o2[0]) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /**
     * Given array of intervals, merge overlapping intervals
     * and sort them by start in ascending order
     * Interval is defined as [start, end] where start < end
     * <p>
     * Examples:
     * [[1,3][2,4][5,6]] -> [[1,4][5,6]]
     * [[1,2][2,3]] -> [[1,3]]
     * [[1,4][2,3]] -> [[1,4]]
     * [[5,6][1,2]] -> [[1,2][5,6]]
     *
     * @param intervals is a nullable array of pairs [start, end]
     * @return merged intervals
     * @throws IllegalArgumentException if intervals is null
     */

    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            throw new IllegalArgumentException("Argument is null");
        }

        List<int[]> merge = new ArrayList<int[]>(Arrays.asList(intervals));
        Collections.sort(merge, new IntervalComparator());
        Integer i = 0;

        while (i < merge.size() - 1) {
            var left = merge.get(i);
            var right = merge.get(i + 1);

            if (overlap(left, right)) {
                merge.set(i, mergeCouple(left, right));
                merge.remove(i + 1);
            } else {
                ++i;
            }
        }

        return merge.toArray(new int[][]{});
    }

    private boolean overlap(int[] left, int[] right) {
        var one = left[1] >= right[0] && left[1] <= right[1];
        var two = right[1] >= left[0] && right[1] <= left[1];
        return one || two;
    }

    private int[] mergeCouple(int[] left, int[] right) {
        return new int[] {
            Math.min(left[0], right[0]),
            Math.max(left[1], right[1])
        };
    }
}
