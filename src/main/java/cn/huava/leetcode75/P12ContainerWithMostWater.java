package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75">11.
 * Container With Most Water</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/container-with-most-water/solutions/3701708/best-method-c-java-python-beginner-friendly">rahulvarma5297</a>
 *
 * @author Camio1945
 */
public class P12ContainerWithMostWater {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;
    while (left < right) {
      int w = right - left;
      int hLeft = height[left];
      int hRight = height[right];
      int h = Math.min(hLeft, hRight);
      int area = w * h;
      maxArea = Math.max(maxArea, area);
      if (hLeft < hRight) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }
}
