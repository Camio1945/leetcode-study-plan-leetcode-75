package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/path-sum-iii/?envType=study-plan-v2&envId=leetcode-75">437.
 * Path Sum III</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/path-sum-iii/solutions/780231/java-dfs-easy-to-understand">kunal3322</a>
 *
 * @author Camio1945
 */
public class P36PathSumIii {

  private int res = 0;

  public int pathSum(TreeNode node, int targetSum) {
    if (node == null) {
      return 0;
    }
    solve(node, targetSum, 0);
    pathSum(node.left, targetSum);
    pathSum(node.right, targetSum);
    return res;
  }

  private void solve(TreeNode node, int targetSum, int parentSum) {
    if (node == null) {
      return;
    }
    int currSum = parentSum + node.val;
    if (currSum == targetSum) {
      res++;
    }
    solve(node.left, targetSum, currSum);
    solve(node.right, targetSum, currSum);
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
