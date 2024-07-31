package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/combination-sum-iii/?envType=study-plan-v2&envId=leetcode-75">216.
 * Combination Sum III</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/combination-sum-iii/solutions/60614/simple-and-clean-java-code-backtracking">jinwu</a>
 *
 * @author Camio1945
 */
public class P58CombinationSumIii {
  private static final int END = 9;

  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> res = new ArrayList<>();
    backtrack(res, k, n, 1, new ArrayList<>());
    return res;
  }

  private void backtrack(
      List<List<Integer>> res, int k, int n, int start, List<Integer> combination) {
    if (combination.size() == k && n == 0) {
      res.add(new ArrayList<>(combination));
      return;
    }
    if (combination.size() >= k) {
      return;
    }
    for (int i = start; i <= END; i++) {
      combination.add(i);
      backtrack(res, k, n - i, i + 1, combination);
      combination.removeLast();
    }
  }
}
