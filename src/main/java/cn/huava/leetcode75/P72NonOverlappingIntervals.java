package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/non-overlapping-intervals/?envType=study-plan-v2&envId=leetcode-75">435.
 * Non-overlapping Intervals</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/non-overlapping-intervals/solutions/3785409/beat-s-100-c-java-python-beginner-friendly">rahulvarma5297</a>
 *
 * @author Camio1945
 */
public class P72NonOverlappingIntervals {
  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    int[] prev = intervals[0];
    int res = 0;
    for (int i = 1; i < intervals.length; i++) {
      int[] arr = intervals[i];
      if (arr[0] >= prev[1]) {
        prev = arr;
      } else {
        res++;
      }
    }
    return res;
  }
}
