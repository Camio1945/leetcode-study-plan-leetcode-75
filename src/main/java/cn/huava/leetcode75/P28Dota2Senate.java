package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/dota2-senate/?envType=study-plan-v2&envId=leetcode-75">649.
 * Dota2 Senate</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/dota2-senate/solutions/3483399/simple-diagram-explanation">L30XL1U</a>
 * <br>
 * key point: instead of eliminating a senator who has already moved, the best move for each team is
 * to eliminate the next senator who has the power to vote.
 *
 * @author Camio1945
 */
public class P28Dota2Senate {
  public String predictPartyVictory(String senate) {
    Queue<Integer> radiant = new LinkedList<>();
    Queue<Integer> dire = new LinkedList<>();
    int n = senate.length();
    for (int i = 0; i < n; i++) {
      if (senate.charAt(i) == 'R') {
        radiant.add(i);
      } else {
        dire.add(i);
      }
    }
    while (!radiant.isEmpty() && !dire.isEmpty()) {
      if (radiant.poll() < dire.poll()) {
        radiant.add(n++);
      } else {
        dire.add(n++);
      }
    }
    return radiant.isEmpty() ? "Dire" : "Radiant";
  }
}
