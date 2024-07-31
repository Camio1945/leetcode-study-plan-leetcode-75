package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/total-cost-to-hire-k-workers/?envType=study-plan-v2&envId=leetcode-75">2462.
 * Total Cost to Hire K Workers</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P52TotalCostToHireKWorkers {

  public long totalCost(int[] costs, int k, int candidates) {
    PriorityQueue<Integer> headWorkers = new PriorityQueue<>();
    PriorityQueue<Integer> tailWorkers = new PriorityQueue<>();
    initQueue(costs, candidates, headWorkers, tailWorkers);
    long answer = 0;
    int nextHead = candidates;
    int nextTail = costs.length - 1 - candidates;
    for (int i = 0; i < k; i++) {
      if (tailWorkers.isEmpty()
          || (!headWorkers.isEmpty() && headWorkers.peek() <= tailWorkers.peek())) {
        answer += headWorkers.poll();
        // Only refill the queue if there are workers outside the two queues.
        if (nextHead <= nextTail) {
          headWorkers.add(costs[nextHead]);
          nextHead++;
        }
      } else {
        answer += tailWorkers.poll();
        // Only refill the queue if there are workers outside the two queues.
        if (nextHead <= nextTail) {
          tailWorkers.add(costs[nextTail]);
          nextTail--;
        }
      }
    }
    return answer;
  }

  private static void initQueue(
      int[] costs,
      int candidates,
      PriorityQueue<Integer> headWorkers,
      PriorityQueue<Integer> tailWorkers) {
    // headWorkers stores the first k workers.
    // tailWorkers stores at most last k workers without any workers from the first k workers.
    for (int i = 0; i < candidates; i++) {
      headWorkers.add(costs[i]);
    }
    for (int i = Math.max(candidates, costs.length - candidates); i < costs.length; i++) {
      tailWorkers.add(costs[i]);
    }
  }
}
