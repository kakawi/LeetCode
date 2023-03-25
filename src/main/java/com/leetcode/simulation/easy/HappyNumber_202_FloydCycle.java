package com.leetcode.simulation.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202_FloydCycle implements HappyNumber_202 {

  @Override
  public boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    do {
      slow = getSquareSum(slow);
      fast = getSquareSum(getSquareSum(fast));
    } while (slow != fast);

    return slow == 1;
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
