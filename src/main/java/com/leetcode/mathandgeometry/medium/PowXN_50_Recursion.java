package com.leetcode.mathandgeometry.medium;

/**
 * Time: O(log n)
 * Space: O(log n)
 */
public class PowXN_50_Recursion implements PowXN_50 {
  public double myPow(double x, int n) {
    if (x == 0) {
      return 0;
    }
    if (n == 0) {
      return 1;
    }

    double result = helper(x, Math.abs(n));
    return (n > 0) ? result : 1 / result;
  }

  private double helper(double x, int n) {
    if (n == 0) {
      return 1;
    }
    double half = helper(x, n / 2);
    return (n % 2 == 0) ? half * half : x * half * half;
  }
}
