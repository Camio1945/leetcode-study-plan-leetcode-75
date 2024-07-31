package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P34LeafSimilarTrees}
 *
 * @author Camio1945
 */
class P34LeafSimilarTreesTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P34LeafSimilarTrees solution = new P34LeafSimilarTrees();
    P34LeafSimilarTrees.TreeNode root1 = buildRoot1ForExample1();
    P34LeafSimilarTrees.TreeNode root2 = buildRoot2ForExample1();
    assertTrue(solution.leafSimilar(root1, root2));
  }

  private static void example2() {
    P34LeafSimilarTrees solution = new P34LeafSimilarTrees();
    P34LeafSimilarTrees.TreeNode root1 = buildRoot1ForExample2();
    P34LeafSimilarTrees.TreeNode root2 = buildRoot2ForExample2();
    assertFalse(solution.leafSimilar(root1, root2));
  }

  private static P34LeafSimilarTrees.TreeNode buildRoot1ForExample1() {
    P34LeafSimilarTrees.TreeNode one = new P34LeafSimilarTrees.TreeNode(1);
    P34LeafSimilarTrees.TreeNode two = new P34LeafSimilarTrees.TreeNode(2);
    P34LeafSimilarTrees.TreeNode three = new P34LeafSimilarTrees.TreeNode(3);
    P34LeafSimilarTrees.TreeNode four = new P34LeafSimilarTrees.TreeNode(4);
    P34LeafSimilarTrees.TreeNode five = new P34LeafSimilarTrees.TreeNode(5);
    P34LeafSimilarTrees.TreeNode six = new P34LeafSimilarTrees.TreeNode(6);
    P34LeafSimilarTrees.TreeNode seven = new P34LeafSimilarTrees.TreeNode(7);
    P34LeafSimilarTrees.TreeNode eight = new P34LeafSimilarTrees.TreeNode(8);
    P34LeafSimilarTrees.TreeNode nine = new P34LeafSimilarTrees.TreeNode(9);
    three.left = five;
    three.right = one;
    five.left = six;
    five.right = two;
    one.left = nine;
    one.right = eight;
    two.left = seven;
    two.right = four;
    return three;
  }

  private static P34LeafSimilarTrees.TreeNode buildRoot2ForExample1() {
    P34LeafSimilarTrees.TreeNode one = new P34LeafSimilarTrees.TreeNode(1);
    P34LeafSimilarTrees.TreeNode two = new P34LeafSimilarTrees.TreeNode(2);
    P34LeafSimilarTrees.TreeNode three = new P34LeafSimilarTrees.TreeNode(3);
    P34LeafSimilarTrees.TreeNode four = new P34LeafSimilarTrees.TreeNode(4);
    P34LeafSimilarTrees.TreeNode five = new P34LeafSimilarTrees.TreeNode(5);
    P34LeafSimilarTrees.TreeNode six = new P34LeafSimilarTrees.TreeNode(6);
    P34LeafSimilarTrees.TreeNode seven = new P34LeafSimilarTrees.TreeNode(7);
    P34LeafSimilarTrees.TreeNode eight = new P34LeafSimilarTrees.TreeNode(8);
    P34LeafSimilarTrees.TreeNode nine = new P34LeafSimilarTrees.TreeNode(9);
    three.left = five;
    three.right = one;
    five.left = six;
    five.right = seven;
    one.left = four;
    one.right = two;
    two.left = nine;
    two.right = eight;
    return three;
  }

  private static P34LeafSimilarTrees.TreeNode buildRoot1ForExample2() {
    P34LeafSimilarTrees.TreeNode one = new P34LeafSimilarTrees.TreeNode(1);
    P34LeafSimilarTrees.TreeNode two = new P34LeafSimilarTrees.TreeNode(2);
    P34LeafSimilarTrees.TreeNode three = new P34LeafSimilarTrees.TreeNode(3);
    one.left = two;
    one.right = three;
    return one;
  }

  private static P34LeafSimilarTrees.TreeNode buildRoot2ForExample2() {
    P34LeafSimilarTrees.TreeNode one = new P34LeafSimilarTrees.TreeNode(1);
    P34LeafSimilarTrees.TreeNode two = new P34LeafSimilarTrees.TreeNode(2);
    P34LeafSimilarTrees.TreeNode three = new P34LeafSimilarTrees.TreeNode(3);
    one.left = three;
    one.right = two;
    return one;
  }
}
