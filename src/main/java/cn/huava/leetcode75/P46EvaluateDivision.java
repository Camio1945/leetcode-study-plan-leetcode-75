package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/evaluate-division/?envType=study-plan-v2&envId=leetcode-75">399.
 * Evaluate Division</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/evaluate-division/solutions/171649/1ms-dfs-with-explanations/comments/271473">redlogo</a>
 *
 * @author Camio1945
 */
public class P46EvaluateDivision {

  private static final double NEGATIVE_ONE = -1.0;

  /**
   * example:
   *
   * <pre>
   * {
   *   "a" : {
   *     "b": 2.0
   *   },
   *   "b" : {
   *     "a" : 0.5 (aka 1 / 2.0),
   *     "c" : 3.0
   *   },
   *   "c" : {
   *     "b" : 0.3333333333333333 (aka 1 / 3)
   *   }
   * }
   * </pre>
   */
  private final HashMap<String, HashMap<String, Double>> map = new HashMap<>();

  public double[] calcEquation(
      List<List<String>> equations, double[] values, List<List<String>> queries) {
    // build big double direction map
    int n = equations.size();
    for (int i = 0; i < n; i++) {
      String start = equations.get(i).get(0);
      String end = equations.get(i).get(1);
      double ratio = values[i];
      map.putIfAbsent(start, HashMap.newHashMap(n));
      map.get(start).put(end, ratio);
      map.putIfAbsent(end, HashMap.newHashMap(n));
      map.get(end).put(start, 1.0 / ratio);
    }
    // deal with every query
    double[] res = new double[queries.size()];
    for (int i = 0; i < queries.size(); i++) {
      String start = queries.get(i).get(0);
      String end = queries.get(i).get(1);
      // first check if start or end exist in big map or not
      if (!map.containsKey(start) || !map.containsKey(end)) {
        res[i] = NEGATIVE_ONE;
        continue;
      }
      // enter dfs loop, for each query, there is a new visited set
      res[i] = dfs(start, end, new HashSet<>());
    }
    return res;
  }

  public double dfs(String start, String end, Set<String> visited) {
    if (map.get(start).containsKey(end)) {
      return map.get(start).get(end);
    }
    // mark visited
    visited.add(start);
    for (Map.Entry<String, Double> entry : map.get(start).entrySet()) {
      if (visited.contains(entry.getKey())) {
        continue;
      }
      double res = dfs(entry.getKey(), end, visited);
      if (Double.compare(res, NEGATIVE_ONE) != 0) {
        return res * entry.getValue();
      }
    }
    return NEGATIVE_ONE;
  }
}
