package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/?envType=study-plan-v2&envId=leetcode-75">1318.
 * Minimum Flips to Make a OR b Equal to c</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P69MinimumFlipsToMakeAOrBEqualToC {

  public int minFlips(int a, int b, int c) {
    int res = 0;
    while (a > 0 || b > 0 || c > 0) {
      int bitA = a & 1;
      int bitB = b & 1;
      int bitC = c & 1;
      if (bitA == 0 && bitB == 0 && bitC == 1) {
        res += 1;
      } else if (bitA == 0 && bitB == 1 && bitC == 0) {
        res += 1;
      } else if (bitA == 1 && bitB == 0 && bitC == 0) {
        res += 1;
      } else if (bitA == 1 && bitB == 1 && bitC == 0) {
        res += 2;
      }
      a >>= 1;
      b >>= 1;
      c >>= 1;
    }
    return res;
  }
}
