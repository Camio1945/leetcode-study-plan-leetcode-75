package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P40MaximumLevelSumOfABinaryTree}
 *
 * @author Camio1945
 */
class P40MaximumLevelSumOfABinaryTreeTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P40MaximumLevelSumOfABinaryTree solution = new P40MaximumLevelSumOfABinaryTree();
    P40MaximumLevelSumOfABinaryTree.TreeNode one = new P40MaximumLevelSumOfABinaryTree.TreeNode(1);
    P40MaximumLevelSumOfABinaryTree.TreeNode seven =
        new P40MaximumLevelSumOfABinaryTree.TreeNode(7);
    P40MaximumLevelSumOfABinaryTree.TreeNode zero = new P40MaximumLevelSumOfABinaryTree.TreeNode(0);
    P40MaximumLevelSumOfABinaryTree.TreeNode newSeven =
        new P40MaximumLevelSumOfABinaryTree.TreeNode(7);
    P40MaximumLevelSumOfABinaryTree.TreeNode negativeEight =
        new P40MaximumLevelSumOfABinaryTree.TreeNode(-8);
    one.left = seven;
    one.right = zero;
    seven.left = newSeven;
    seven.right = negativeEight;
    assertEquals(2, solution.maxLevelSum(one));
  }

  private static void example2() {
    P40MaximumLevelSumOfABinaryTree solution = new P40MaximumLevelSumOfABinaryTree();
    P40MaximumLevelSumOfABinaryTree.TreeNode n1 = new P40MaximumLevelSumOfABinaryTree.TreeNode(989);
    P40MaximumLevelSumOfABinaryTree.TreeNode n2 =
        new P40MaximumLevelSumOfABinaryTree.TreeNode(10250);
    P40MaximumLevelSumOfABinaryTree.TreeNode n3 =
        new P40MaximumLevelSumOfABinaryTree.TreeNode(98693);
    P40MaximumLevelSumOfABinaryTree.TreeNode n4 =
        new P40MaximumLevelSumOfABinaryTree.TreeNode(-89388);
    P40MaximumLevelSumOfABinaryTree.TreeNode n5 =
        new P40MaximumLevelSumOfABinaryTree.TreeNode(-32127);
    n1.right = n2;
    n2.left = n3;
    n2.right = n4;
    n4.right = n5;
    assertEquals(2, solution.maxLevelSum(n1));
  }
}
