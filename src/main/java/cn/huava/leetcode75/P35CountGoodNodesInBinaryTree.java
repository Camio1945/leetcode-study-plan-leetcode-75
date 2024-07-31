package cn.huava.leetcode75;

import java.util.ArrayList;
import java.util.List;

/**
 * <a
 * href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/?envType=study-plan-v2&envId=leetcode-75">1448.
 * Count Good Nodes in Binary Tree</a> <br>
 *
 * @author Camio1945
 */
public class P35CountGoodNodesInBinaryTree {
  public int goodNodes(TreeNode root) {
    List<TreeNode> goodsNodes = new ArrayList<>();
    dfs(root, goodsNodes, root.val);
    return goodsNodes.size();
  }

  private void dfs(TreeNode node, List<TreeNode> goodsNodes, int maxAncestor) {
    if (node == null) {
      return;
    }
    if (node.val >= maxAncestor) {
      goodsNodes.add(node);
    }
    maxAncestor = Math.max(maxAncestor, node.val);
    dfs(node.left, goodsNodes, maxAncestor);
    dfs(node.right, goodsNodes, maxAncestor);
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
