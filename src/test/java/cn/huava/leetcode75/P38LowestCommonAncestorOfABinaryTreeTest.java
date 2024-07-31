package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P38LowestCommonAncestorOfABinaryTree}
 *
 * @author Camio1945
 */
class P38LowestCommonAncestorOfABinaryTreeTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P38LowestCommonAncestorOfABinaryTree solution = new P38LowestCommonAncestorOfABinaryTree();
    P38LowestCommonAncestorOfABinaryTree.TreeNode zero =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(0);
    P38LowestCommonAncestorOfABinaryTree.TreeNode one =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(1);
    P38LowestCommonAncestorOfABinaryTree.TreeNode two =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(2);
    P38LowestCommonAncestorOfABinaryTree.TreeNode three =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(3);
    P38LowestCommonAncestorOfABinaryTree.TreeNode four =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(4);
    P38LowestCommonAncestorOfABinaryTree.TreeNode five =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(5);
    P38LowestCommonAncestorOfABinaryTree.TreeNode six =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(6);
    P38LowestCommonAncestorOfABinaryTree.TreeNode seven =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(7);
    P38LowestCommonAncestorOfABinaryTree.TreeNode eight =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(8);
    three.left = five;
    three.right = one;
    five.left = six;
    five.right = two;
    one.left = zero;
    one.right = eight;
    two.left = seven;
    two.right = four;
    assertEquals(3, solution.lowestCommonAncestor(three, five, one).val);
  }

  private static void example2() {
    P38LowestCommonAncestorOfABinaryTree solution = new P38LowestCommonAncestorOfABinaryTree();
    P38LowestCommonAncestorOfABinaryTree.TreeNode zero =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(0);
    P38LowestCommonAncestorOfABinaryTree.TreeNode one =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(1);
    P38LowestCommonAncestorOfABinaryTree.TreeNode two =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(2);
    P38LowestCommonAncestorOfABinaryTree.TreeNode three =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(3);
    P38LowestCommonAncestorOfABinaryTree.TreeNode four =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(4);
    P38LowestCommonAncestorOfABinaryTree.TreeNode five =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(5);
    P38LowestCommonAncestorOfABinaryTree.TreeNode six =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(6);
    P38LowestCommonAncestorOfABinaryTree.TreeNode seven =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(7);
    P38LowestCommonAncestorOfABinaryTree.TreeNode eight =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(8);
    three.left = five;
    three.right = one;
    five.left = six;
    five.right = two;
    one.left = zero;
    one.right = eight;
    two.left = seven;
    two.right = four;
    assertEquals(5, solution.lowestCommonAncestor(three, five, four).val);
  }

  private static void example3() {
    P38LowestCommonAncestorOfABinaryTree solution = new P38LowestCommonAncestorOfABinaryTree();
    P38LowestCommonAncestorOfABinaryTree.TreeNode one =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(1);
    P38LowestCommonAncestorOfABinaryTree.TreeNode two =
        new P38LowestCommonAncestorOfABinaryTree.TreeNode(2);
    one.left = two;
    assertEquals(1, solution.lowestCommonAncestor(one, one, two).val);
  }
}
