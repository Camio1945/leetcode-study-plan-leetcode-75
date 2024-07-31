package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P35CountGoodNodesInBinaryTree}
 *
 * @author Camio1945
 */
class P35CountGoodNodesInBinaryTreeTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private void example1() {
    P35CountGoodNodesInBinaryTree solution = new P35CountGoodNodesInBinaryTree();
    P35CountGoodNodesInBinaryTree.TreeNode one = new P35CountGoodNodesInBinaryTree.TreeNode(1);
    P35CountGoodNodesInBinaryTree.TreeNode newOne = new P35CountGoodNodesInBinaryTree.TreeNode(1);
    P35CountGoodNodesInBinaryTree.TreeNode three = new P35CountGoodNodesInBinaryTree.TreeNode(3);
    P35CountGoodNodesInBinaryTree.TreeNode newThree = new P35CountGoodNodesInBinaryTree.TreeNode(3);
    P35CountGoodNodesInBinaryTree.TreeNode four = new P35CountGoodNodesInBinaryTree.TreeNode(4);
    P35CountGoodNodesInBinaryTree.TreeNode five = new P35CountGoodNodesInBinaryTree.TreeNode(5);
    three.left = one;
    three.right = four;
    one.left = newThree;
    four.left = newOne;
    four.right = five;
    assertEquals(4, solution.goodNodes(three));
  }

  private void example2() {
    P35CountGoodNodesInBinaryTree solution = new P35CountGoodNodesInBinaryTree();
    P35CountGoodNodesInBinaryTree.TreeNode two = new P35CountGoodNodesInBinaryTree.TreeNode(2);
    P35CountGoodNodesInBinaryTree.TreeNode three = new P35CountGoodNodesInBinaryTree.TreeNode(3);
    P35CountGoodNodesInBinaryTree.TreeNode newThree = new P35CountGoodNodesInBinaryTree.TreeNode(3);
    P35CountGoodNodesInBinaryTree.TreeNode four = new P35CountGoodNodesInBinaryTree.TreeNode(4);
    three.left = newThree;
    newThree.left = four;
    newThree.right = two;
    assertEquals(3, solution.goodNodes(three));
  }

  private void example3() {
    P35CountGoodNodesInBinaryTree solution = new P35CountGoodNodesInBinaryTree();
    P35CountGoodNodesInBinaryTree.TreeNode one = new P35CountGoodNodesInBinaryTree.TreeNode(1);
    assertEquals(1, solution.goodNodes(one));
  }
}
