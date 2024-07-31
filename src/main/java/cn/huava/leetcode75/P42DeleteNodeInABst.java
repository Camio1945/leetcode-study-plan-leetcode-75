package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/delete-node-in-a-bst/?envType=study-plan-v2&envId=leetcode-75">450.
 * Delete Node in a BST</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/delete-node-in-a-bst/solutions/1590789/c-shortest-recursive-solution-detailed-explanation-with-images">_LeetCoder25_</a>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P42DeleteNodeInABst {

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    if (key < root.val) {
      // Recursively delete from left subtree
      root.left = deleteNode(root.left, key);
    } else if (key > root.val) {
      // Recursively delete from right subtree
      root.right = deleteNode(root.right, key);
    } else {
      // Node with only one child or no child
      if (root.left == null) {
        return root.right;
      }
      if (root.right == null) {
        return root.left;
      }
      // Node with two children: Get the inorder successor (smallest in the right subtree)
      TreeNode temp = root.right;
      while (temp.left != null) {
        temp = temp.left;
      }
      // Copy the inorder successor's content to this node
      root.val = temp.val;
      // Delete the inorder successor
      root.right = deleteNode(root.right, temp.val);
    }
    return root;
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
