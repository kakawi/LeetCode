package com.leetcode.dynamicprogramming.easy;

public class ClimbingStairs_70_Impl implements
    ClimbingStairs_70 {

  @Override
  public int climbStairs(final int n) {
    if (n < 3) {
      return n;
    }

    int first = 1;
    int second = 2;
    int sum = 0;

    for (int i = 3; i <= n; i++) {
      sum = first + second;
      first = second;
      second = sum;
    }

    return sum;
  }
}
