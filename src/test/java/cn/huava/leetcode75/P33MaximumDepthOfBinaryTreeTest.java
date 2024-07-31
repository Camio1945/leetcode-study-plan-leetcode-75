package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P33MaximumDepthOfBinaryTree}
 *
 * @author Camio1945
 */
class P33MaximumDepthOfBinaryTreeTest {
  @Test
  void test() {
    example1();
  }

  private static void example1() {
    P33MaximumDepthOfBinaryTree solution = new P33MaximumDepthOfBinaryTree();
    P33MaximumDepthOfBinaryTree.TreeNode three = new P33MaximumDepthOfBinaryTree.TreeNode(3);
    P33MaximumDepthOfBinaryTree.TreeNode nine = new P33MaximumDepthOfBinaryTree.TreeNode(9);
    P33MaximumDepthOfBinaryTree.TreeNode twenty = new P33MaximumDepthOfBinaryTree.TreeNode(20);
    P33MaximumDepthOfBinaryTree.TreeNode fifteen = new P33MaximumDepthOfBinaryTree.TreeNode(15);
    P33MaximumDepthOfBinaryTree.TreeNode seven = new P33MaximumDepthOfBinaryTree.TreeNode(7);
    three.left = nine;
    three.right = twenty;
    twenty.left = fifteen;
    twenty.right = seven;
    assertEquals(3, solution.maxDepth(three));
  }
}
