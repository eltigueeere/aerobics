package solution;

import java.util.*;

class SolutionIntervalo {

    public static List<int[]> mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(intervals));
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                merged.add(current);
                current = next;
            }
        }
        merged.add(current); // último

        return merged;
    }

    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 },
                { 17, 20 }
        };
        System.out.println(mergeIntervals(intervals));
    }

}