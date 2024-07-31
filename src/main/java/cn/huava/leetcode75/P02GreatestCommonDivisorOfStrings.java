package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75">1071.
 * Greatest Common Divisor of Strings</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/greatest-common-divisor-of-strings/solutions/3124997/super-easy-solution-fully-explained-c-python3-java">Naman_Ag</a>
 *
 * @author Camio1945
 */
public class P02GreatestCommonDivisorOfStrings {
  public String gcdOfStrings(String str1, String str2) {
    if (!(str1 + str2).equals(str2 + str1)) {
      return "";
    }
    return str1.substring(0, gcd(str1.length(), str2.length()));
  }

  private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}
