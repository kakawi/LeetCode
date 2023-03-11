package com.leetcode.dynamicprogramming.easy;

public class Min_Cost_Climbing_Stairs_746 {

  public static void main(String[] args) {
    final Min_Cost_Climbing_Stairs_746 solution = new Min_Cost_Climbing_Stairs_746();
    solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
  }

  public int minCostClimbingStairs(int[] cost) {
    final int length = cost.length;
    for (int i = 2; i < length; i++) {
      cost[i] = Math.min(cost[i - 2], cost[i - 1]) + cost[i];
    }
    return Math.min(cost[length - 2], cost[length - 1]);
  }
}
