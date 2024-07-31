package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/number-of-provinces/?envType=study-plan-v2&envId=leetcode-75">547.
 * Number of Provinces</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.cn/problems/number-of-provinces/solutions/550107/python-duo-tu-xiang-jie-bing-cha-ji-by-m-vjdr/comments/1780073">陆小6</a>
 *
 * @author Camio1945
 */
public class P44NumberOfProvinces {
  public int findCircleNum(int[][] isConnected) {
    UnionFind unionFind = new UnionFind(isConnected.length);
    for (int i = 0; i < isConnected.length; i++) {
      unionFind.add(i);
      for (int j = 0; j < i; j++) {
        if (isConnected[i][j] == 1) {
          unionFind.union(i, j);
        }
      }
    }
    return unionFind.size;
  }

  private static class UnionFind {
    private int[] p;
    private int size = 0;

    public UnionFind(int length) {
      p = new int[length];
    }

    public void add(int i) {
      p[i] = i;
      size++;
    }

    public void union(int i, int j) {
      int rootOfI = findRootOf(i);
      int rootOfJ = findRootOf(j);
      if (rootOfI != rootOfJ) {
        p[rootOfI] = p[rootOfJ];
        size--;
      }
    }

    private int findRootOf(int i) {
      if (p[i] != i) {
        p[i] = findRootOf(p[i]);
      }
      return p[i];
    }
  }
}
