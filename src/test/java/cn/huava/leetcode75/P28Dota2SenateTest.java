package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P28Dota2Senate}
 *
 * @author Camio1945
 */
class P28Dota2SenateTest {
  @Test
  void test() {
    P28Dota2Senate solution = new P28Dota2Senate();
    assertEquals("Radiant", solution.predictPartyVictory("DRRDRDRDRDDRDRDR"));
    assertEquals("Dire", solution.predictPartyVictory("DDRRR"));
    assertEquals("Dire", solution.predictPartyVictory("RDD"));
    assertEquals("Radiant", solution.predictPartyVictory("RD"));
  }
}
