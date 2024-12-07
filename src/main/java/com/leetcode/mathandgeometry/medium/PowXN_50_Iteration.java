package com.leetcode.mathandgeometry.medium;

/**
 * Time: O(log n)
 * Space: O(1)
 */
public class PowXN_50_Iteration implements PowXN_50 {
  public double myPow(double x, int n) {
    if (x == 0) {
      return 0;
    }
    if (n == 0) {
      return 1;
    }

    double result = 1;
    int power = Math.abs(n);

    while (power > 0) {
      // odd
      if ((power & 1) == 1) {
        result *= x;
      }
      x *= x;
      power >>= 1; // divide by 2 (example: power / 2)
    }

    return n > 0 ? result : 1 / result;
  }
}
