package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/?envType=study-plan-v2&envId=leetcode-75">1466.
 * Reorder Routes to Make All Paths Lead to the City Zero</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/solutions/3337365/from-bad-to-good-dfs-java">hridoy100</a>
 *
 * @author Camio1945
 */
public class P45ReorderRoutesToMakeAllPathsLeadToTheCityZero {
  /**
   *
   *
   * <pre>
   * example :
   * key : 0
   * value : [ [1,1], [4,0] ]
   * key = 0 means this entry stores the information about which other nodes can be connected by node 0
   * value : [
   *   [1,1], // the first 1 means node 1 is connected to node 0 (the key),
   *          // the second 1 means node 1 is the destination, and node 0 is the source
   *          // the second 1 also means, if we want go from node 1 to node 0, we need to reorient 1 time
   *   [4,0]  // the 4 in [4,0] means node 4 is connected to node 0 (the key),
   *          // the 0 in [4,0] means node 4 is the source, and node 0 is the destination
   *          // the 0 also means, if we want go from node 4 to node 0, we don't need to reorient
   * ]
   * </pre>
   */
  Map<Integer, List<int[]>> nodeToConnectionInfosMap = new HashMap<>();

  int ans = 0;

  public int minReorder(int n, int[][] connections) {
    for (int[] con : connections) {
      int src = con[0];
      int dest = con[1];
      addConnectionInfoForSrc(src, dest);
      addConnectionInfoForDest(src, dest);
    }
    dfs(0, -1);
    return ans;
  }

  private void addConnectionInfoForSrc(int src, int dest) {
    List<int[]> srcConnectionInfos = nodeToConnectionInfosMap.getOrDefault(src, new ArrayList<>());
    srcConnectionInfos.add(new int[] {dest, 1});
    nodeToConnectionInfosMap.put(src, srcConnectionInfos);
  }

  private void addConnectionInfoForDest(int src, int dest) {
    List<int[]> destConnectionInfos =
        nodeToConnectionInfosMap.getOrDefault(dest, new ArrayList<>());
    destConnectionInfos.add(new int[] {src, 0});
    nodeToConnectionInfosMap.put(dest, destConnectionInfos);
  }

  void dfs(int node, int prevNode) {
    List<int[]> connectionInfos = nodeToConnectionInfosMap.getOrDefault(node, new ArrayList<>());
    for (int[] connectionInfo : connectionInfos) {
      int nextNode = connectionInfo[0];
      if (nextNode != prevNode) {
        ans += connectionInfo[1];
        dfs(nextNode, node);
      }
    }
  }
}
