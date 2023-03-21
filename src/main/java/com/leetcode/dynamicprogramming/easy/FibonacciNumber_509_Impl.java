package com.leetcode.dynamicprogramming.easy;

public class FibonacciNumber_509_Impl implements FibonacciNumber_509 {

  @Override
  public int fib(final int n) {
    if (n < 2) {
      return n;
    }
    int first = 0;
    int second = 1;
    int sum = 0;
    for (int i = 2; i <= n; i++) {
      sum = first + second;
      first = second;
      second = sum;
    }
    return sum;
  }
}
