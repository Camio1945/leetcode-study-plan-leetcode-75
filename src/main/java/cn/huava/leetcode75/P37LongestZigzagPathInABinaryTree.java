package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75">1372.
 * Longest ZigZag Path in a Binary Tree</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/solutions/3433060/image-explanation-easy-complete-intuition-c-java-python">aryan_0077</a>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P37LongestZigzagPathInABinaryTree {
  private int maxLen = 0;

  public int longestZigZag(TreeNode root) {
    solve(root, true, 0);
    solve(root, false, 0);
    return maxLen;
  }

  private void solve(TreeNode node, boolean goLeft, int currLen) {
    if (node == null) {
      return;
    }
    maxLen = Math.max(maxLen, currLen);
    solve(node.left, true, goLeft ? 1 : currLen + 1);
    solve(node.right, false, goLeft ? currLen + 1 : 1);
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
