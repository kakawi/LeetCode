package com.leetcode.stack.hard;

public class BasicCalculator_224_Recursion implements BasicCalculator_224 {

  private int idx; // this index traverse the string in one pass, between different level of recursion

  @Override
  public int calculate(final String s) {
    idx = 0; // Initialization should be here
    return calc(s);
  }

  private int calc(final String s) {
    int result = 0, num = 0, sign = 1;
    while (idx < s.length()) {
      char c = s.charAt(idx++);
      if (Character.isDigit(c)) {
        num = num * 10 + c - '0';
      } else if (c == '(') {
        num = calc(s); // ( is start of a new sub-problem, Let recursion solve the sub-problem
      } else if (c == ')') {
        return result + sign * num;
      } else if (c == '+' || c == '-') {
        // only when we meet a new sign, we know a while number has been read
        result += sign * num;
        num = 0;
        sign = c == '-' ? -1 : 1;
      }
    }
    return result + sign * num; // last number is not processed yet
  }
}
