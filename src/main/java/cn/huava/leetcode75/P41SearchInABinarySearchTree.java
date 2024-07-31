package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/search-in-a-binary-search-tree/?envType=study-plan-v2&envId=leetcode-75">700.
 * Search in a Binary Search Tree</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P41SearchInABinarySearchTree {

  @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if (val == root.val) {
      return root;
    }
    if (val < root.val) {
      return searchBST(root.left, val);
    }
    return searchBST(root.right, val);
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
