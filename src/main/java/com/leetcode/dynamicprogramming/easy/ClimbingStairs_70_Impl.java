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
    for (int i = 3; i <= n; i++) {
      int tmp = second;
      second = first + second;
      first = tmp;
    }

    return second;
  }
}
