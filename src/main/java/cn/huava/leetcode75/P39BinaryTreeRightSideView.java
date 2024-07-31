package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/binary-tree-right-side-view/?envType=study-plan-v2&envId=leetcode-75">199.
 * Binary Tree Right Side View</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/binary-tree-right-side-view/solutions/3176211/solution">deleted_user</a>
 *
 * @author Camio1945
 */
public class P39BinaryTreeRightSideView {
  private final List<Integer> res = new ArrayList<>();

  private int maxLevel = 0;

  public List<Integer> rightSideView(TreeNode root) {
    rightFirstDfs(root, 1);
    return res;
  }

  private void rightFirstDfs(TreeNode node, int level) {
    if (node == null) {
      return;
    }
    // important
    if (level > maxLevel) {
      res.add(node.val);
      maxLevel = level;
    }
    // The order of these 2 lines are very important
    rightFirstDfs(node.right, level + 1);
    rightFirstDfs(node.left, level + 1);
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
