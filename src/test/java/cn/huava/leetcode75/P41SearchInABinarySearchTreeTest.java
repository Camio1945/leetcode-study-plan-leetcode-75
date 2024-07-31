package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P41SearchInABinarySearchTree}
 *
 * @author Camio1945
 */
class P41SearchInABinarySearchTreeTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P41SearchInABinarySearchTree solution = new P41SearchInABinarySearchTree();
    P41SearchInABinarySearchTree.TreeNode n1 = new P41SearchInABinarySearchTree.TreeNode(1);
    P41SearchInABinarySearchTree.TreeNode n2 = new P41SearchInABinarySearchTree.TreeNode(2);
    P41SearchInABinarySearchTree.TreeNode n3 = new P41SearchInABinarySearchTree.TreeNode(3);
    P41SearchInABinarySearchTree.TreeNode n4 = new P41SearchInABinarySearchTree.TreeNode(4);
    P41SearchInABinarySearchTree.TreeNode n7 = new P41SearchInABinarySearchTree.TreeNode(7);
    n4.left = n2;
    n4.right = n7;
    n2.left = n1;
    n2.right = n3;
    P41SearchInABinarySearchTree.TreeNode res = solution.searchBST(n4, 2);
    assertEquals(2, res.val);
    assertEquals(1, res.left.val);
    assertEquals(3, res.right.val);
  }

  private static void example2() {
    P41SearchInABinarySearchTree solution = new P41SearchInABinarySearchTree();
    P41SearchInABinarySearchTree.TreeNode n1 = new P41SearchInABinarySearchTree.TreeNode(1);
    P41SearchInABinarySearchTree.TreeNode n2 = new P41SearchInABinarySearchTree.TreeNode(2);
    P41SearchInABinarySearchTree.TreeNode n3 = new P41SearchInABinarySearchTree.TreeNode(3);
    P41SearchInABinarySearchTree.TreeNode n4 = new P41SearchInABinarySearchTree.TreeNode(4);
    P41SearchInABinarySearchTree.TreeNode n7 = new P41SearchInABinarySearchTree.TreeNode(7);
    n4.left = n2;
    n4.right = n7;
    n2.left = n1;
    n2.right = n3;
    assertNull(solution.searchBST(n4, 5));
  }
}
