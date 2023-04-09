package com.leetcode.stack.hard;

import java.util.Stack;

public class BasicCalculator_224_Stack implements BasicCalculator_224 {

  @Override
  public int calculate(String s) {
    int result = 0, sum = 0, sign = 1;
    final Stack<Integer> myStack = new Stack<>();
    myStack.push(1);
    for (char ch : s.toCharArray()) {
      if (Character.isDigit(ch)) {
        sum = sum * 10 + (ch - '0');
      } else {
        result += sum * sign * myStack.peek();
        sum = 0;
        if (ch == '-') {
          sign = -1;
        } else if (ch == '+') {
          sign = 1;
        } else if (ch == '(') {
          myStack.push(myStack.peek() * sign);
          sign = 1;
        } else if (ch == ')') {
          myStack.pop();
        }
      }
    }
    return result + sign * sum;
  }
}
