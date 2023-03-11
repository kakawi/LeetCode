package com.leetcode.dynamicprogramming.easy;

public class Climbing_Stairs_70 {

  public static void main(String[] args) {
    final Climbing_Stairs_70 solution = new Climbing_Stairs_70();
    solution.climbStairs(4);
  }

  public int climbStairs(int n) {
    if (n < 3) {
      return n;
    }
    int prev = 2;
    int prevprev = 1;
    int current = 1;
    for (int i = 3; i <= n; i++) {
      current = prev + prevprev;
      prevprev = prev;
      prev = current;
    }
    return current;
  }
}
