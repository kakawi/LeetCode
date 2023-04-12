package com.leetcode.dynamicprogramming.medium;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * BFS O(ns). The problem asks for fewest coins. It is natural to think of BFS which guarantees the
 * shortest path.
 * <p>
 * Idea: use Queue to add All coins to previous sums of All coins level by level until get `target amount`
 * Otherwise return `-1`
 */
public class CoinChange_322_4_BFS implements CoinChange_322 {

  @Override
  public int coinChange(int[] coins, int amount) {
    final Queue<Integer> queue = new ArrayDeque<>();
    queue.add(0);

    int result = 0;
    // Because we're using BFS, we do not need to store any intermediate value
    final boolean[] visited = new boolean[amount + 1];

    while (!queue.isEmpty()) {
      int n = queue.size();
      for (int i = 0; i < n; i++) {
        int sum = queue.poll();
        if (sum == amount) {
          return result;
        }

        // not to stuck in an infinitive loop
        if (sum > amount || visited[sum]) {
          continue;
        }

        visited[sum] = true;
        for (int coin : coins) {
          queue.add(sum + coin);
        }
      }
      result++;
    }

    return -1;
  }
}
