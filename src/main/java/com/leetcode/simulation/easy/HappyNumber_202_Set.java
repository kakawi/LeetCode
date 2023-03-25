package com.leetcode.simulation.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202_Set implements HappyNumber_202 {

  @Override
  public boolean isHappy(int n) {
    final Set<Integer> seen = new HashSet<>();

    while (n != 1) {
      final boolean isNewElement = seen.add(n);
      if (!isNewElement) return false;

      n = getSquareSum(n);
    }

    return true;
  }

  private static int getSquareSum(int n) {
    int sum = 0;
    while (n != 0) {
      final int digit = n % 10;
      sum += digit * digit;
      n /= 10;
    }
    return sum;
  }
}
