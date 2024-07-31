package cn.huava.leetcode75;

import java.util.ArrayList;
import java.util.List;

/**
 * <a
 * href="https://leetcode.com/problems/leaf-similar-trees/?envType=study-plan-v2&envId=leetcode-75">872.
 * Leaf-Similar Trees</a> <br>
 *
 * @author Camio1945
 */
public class P34LeafSimilarTrees {

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<TreeNode> leafNodes1 = new ArrayList<>();
    List<TreeNode> leafNodes2 = new ArrayList<>();
    dfs(root1, leafNodes1);
    dfs(root2, leafNodes2);
    if (leafNodes1.size() != leafNodes2.size()) {
      return false;
    }
    for (int i = 0; i < leafNodes1.size(); i++) {
      if (leafNodes1.get(i).val != leafNodes2.get(i).val) {
        return false;
      }
    }
    return true;
  }

  private void dfs(TreeNode node, List<TreeNode> leafNodes) {
    if (node == null) {
      return;
    }
    if (node.left == null && node.right == null) {
      leafNodes.add(node);
      return;
    }
    dfs(node.left, leafNodes);
    dfs(node.right, leafNodes);
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
