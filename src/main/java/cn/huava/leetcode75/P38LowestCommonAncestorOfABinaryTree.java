package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75">236.
 * Lowest Common Ancestor of a Binary Tree</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/solutions/65226/my-java-solution-which-is-easy-to-understand">0xBAAAAAAD</a>
 *
 * <pre>
 * We have two target to find.
 * First, we find target on the left tree, and then find target on the right tree,
 * there will be 4 kind of results:
 *
 * 1. One target is on the left tree and the other is on the right tree,
 *    in this case the root is the answer;
 *
 * 2. One target is on the left tree and the other is not on the right tree,
 *    that means both targets are on the left tree,
 *    and the other target is definitely below the found left node,
 *    so the left node is the answer;
 *
 * 3. One target is on the right tree and the other is not on the left tree,
 *    that means both targets are on the right tree,
 *    and the other target is definitely below the found right node,
 *    so the right node is the answer;
 *
 * 4. No target is either on the left or right tree, return null.
 * </pre>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P38LowestCommonAncestorOfABinaryTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if (left != null && right != null) {
      return root;
    }
    return left != null ? left : right;
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
