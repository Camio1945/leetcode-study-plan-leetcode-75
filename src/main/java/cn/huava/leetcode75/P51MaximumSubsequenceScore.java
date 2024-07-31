package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/maximum-subsequence-score/?envType=study-plan-v2&envId=leetcode-75">2542.
 * Maximum Subsequence Score</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/maximum-subsequence-score/solutions/3092528/easiest-to-understand">byegates</a>
 *
 * @author Camio1945
 */
public class P51MaximumSubsequenceScore {

  public long maxScore(int[] nums1, int[] nums2, int k) {
    int n = nums1.length;
    Pair[] pairs = new Pair[n];
    for (int i = 0; i < n; i++) {
      pairs[i] = new Pair(nums1[i], nums2[i]);
    }
    // order by pair.b desc (aka nums2 desc)
    Arrays.sort(pairs, (o1, o2) -> o2.num2 - o1.num2);
    Queue<Integer> q = new PriorityQueue<>(k + 1);
    long res = 0;
    long sum = 0;
    for (Pair pair : pairs) {
      q.add(pair.num1);
      sum += pair.num1;
      if (q.size() > k) {
        Integer smallest = q.poll();
        assert smallest != null;
        sum -= smallest;
      }
      if (q.size() == k) {
        res = Math.max(res, sum * pair.num2);
      }
    }
    return res;
  }

  private record Pair(int num1, int num2) {}
}
