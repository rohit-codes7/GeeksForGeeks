import java.util.*;

class Solution {
    // Strict non-overlap: next.start > lastFinish
    public static int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        // Sort by finish time
        Arrays.sort(idx, Comparator.comparingInt(i -> finish[i]));

        int count = 0;
        int lastFinish = Integer.MIN_VALUE; // ensures first activity is considered

        for (int i : idx) {
            if (start[i] > lastFinish) {   // <-- strict '>'
                count++;
                lastFinish = finish[i];
            }
        }
        return count;
    }

}
