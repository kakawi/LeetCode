package com.leetcode.dynamicprogramming.easy;

public class MinCostClimbingStairs_746_Impl implements MinCostClimbingStairs_746 {

  @Override
  public int minCostClimbingStairs(int[] cost) {
    final int length = cost.length;
    for (int i = 2; i < length; i++) {
      cost[i] = Math.min(cost[i - 2], cost[i - 1]) + cost[i];
    }
    return Math.min(cost[length - 2], cost[length - 1]);
  }
}
