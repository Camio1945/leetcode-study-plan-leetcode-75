package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75">1207.
 * Unique Number of Occurrences</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/unique-number-of-occurrences/solutions/4577893/beats-100-users-c-java-python-javascript-2-approaches-explained">MarkSPhilip31</a>
 *
 * @author Camio1945
 */
public class P21UniqueNumberOfOccurrences {
  public boolean uniqueOccurrences(int[] arr) {
    Arrays.sort(arr);
    Set<Integer> occurrenceSet = new HashSet<>();
    int occurrence = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      occurrence++;
      if ((i == n - 1) || (arr[i] != arr[i + 1])) {
        if (occurrenceSet.contains(occurrence)) {
          return false;
        }
        occurrenceSet.add(occurrence);
        occurrence = 0;
      }
    }
    return true;
  }
}
