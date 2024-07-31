package cn.huava.leetcode75;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a
 * href="https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75">2215.
 * Find the Difference of Two Arrays</a> <br>
 * Note: The solution is right but the performance is bad
 *
 * @author Camio1945
 */
public class P20FindTheDifferenceOfTwoArrays {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    Set<Integer> set1 =
        Arrays.stream(nums1).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
    Set<Integer> set2 =
        Arrays.stream(nums2).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
    set1.stream().filter(i -> !set2.contains(i)).forEach(l1::add);
    set2.stream().filter(i -> !set1.contains(i)).forEach(l2::add);
    return List.of(l1, l2);
  }
}
