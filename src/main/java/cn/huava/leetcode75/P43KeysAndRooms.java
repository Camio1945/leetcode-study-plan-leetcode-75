package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/keys-and-rooms/?envType=study-plan-v2&envId=leetcode-75">841.
 * Keys and Rooms</a> <br>
 *
 * @author Camio1945
 */
public class P43KeysAndRooms {
  private final Set<Integer> visited = new HashSet<>();

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    dfs(rooms, 0);
    return visited.size() == rooms.size();
  }

  private void dfs(List<List<Integer>> rooms, int index) {
    visited.add(index);
    List<Integer> keys = rooms.get(index);
    for (Integer key : keys) {
      if (!visited.contains(key)) {
        dfs(rooms, key);
      }
    }
  }
}
