package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P37LongestZigzagPathInABinaryTree}
 *
 * @author Camio1945
 */
class P37LongestZigzagPathInABinaryTreeTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P37LongestZigzagPathInABinaryTree solution = new P37LongestZigzagPathInABinaryTree();
    P37LongestZigzagPathInABinaryTree.TreeNode n1 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n2 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n3 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n4 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n5 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n6 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n7 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n8 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    n1.right = n2;
    n2.left = n3;
    n2.right = n4;
    n4.left = n5;
    n4.right = n6;
    n5.right = n7;
    n7.right = n8;
    assertEquals(3, solution.longestZigZag(n1));
  }

  private static void example2() {
    P37LongestZigzagPathInABinaryTree solution = new P37LongestZigzagPathInABinaryTree();
    P37LongestZigzagPathInABinaryTree.TreeNode n1 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n2 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n3 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n4 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n5 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n6 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    P37LongestZigzagPathInABinaryTree.TreeNode n7 =
        new P37LongestZigzagPathInABinaryTree.TreeNode(1);
    n1.left = n2;
    n1.right = n3;
    n2.right = n4;
    n4.left = n5;
    n4.right = n6;
    n5.right = n7;
    assertEquals(4, solution.longestZigZag(n1));
  }
}
