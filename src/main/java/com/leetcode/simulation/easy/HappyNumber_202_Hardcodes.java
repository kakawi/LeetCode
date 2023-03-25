package com.leetcode.simulation.easy;

public class HappyNumber_202_Hardcodes implements HappyNumber_202 {

  @Override
  public boolean isHappy(int n) {
    while (n != 1) {
      n = getSquareSum(n);
      // TODO: it looks that there are some magic numbers that we can use
      if (n == 2 || n == 4 || n == 16 || n == 37 || n == 56 || n == 61) {
        return false; //to move out from the cycle only these value are sufficient to detect cycle(infinite loop)
      }
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
