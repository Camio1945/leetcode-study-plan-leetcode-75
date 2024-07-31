package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75">1161.
 * Maximum Level Sum of a Binary Tree</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/solutions/994867/java-bfs">Selinaqianli</a>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P40MaximumLevelSumOfABinaryTree {

  public int maxLevelSum(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    long maxSum = Integer.MIN_VALUE;
    int currLevel = 0;
    int res = 0;
    while (!queue.isEmpty()) {
      currLevel++;
      long sumOfCurrLevel = 0;
      // important: a single variable is needed
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        assert node != null;
        sumOfCurrLevel += node.val;
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      if (sumOfCurrLevel > maxSum) {
        maxSum = sumOfCurrLevel;
        res = currLevel;
      }
    }
    return res;
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
