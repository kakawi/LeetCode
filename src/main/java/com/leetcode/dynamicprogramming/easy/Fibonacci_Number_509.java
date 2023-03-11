package com.leetcode.dynamicprogramming.easy;

public class Fibonacci_Number_509 {

  public static void main(String[] args) {
    final Fibonacci_Number_509 solution = new Fibonacci_Number_509();
    solution.fib(3);
  }

  public int fib(int n) {
    if (n == 0) {
      return 0;
    }
    int prev = 1;
    int prevprev = 0;
    int current = 1;
    for (int i = 2; i <= n; i++) {
      current = prev + prevprev;
      prevprev = prev;
      prev = current;
    }
    return current;
  }
}
