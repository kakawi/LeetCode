package com.leetcode.stack.medium;

import java.util.Stack;

public class BasicCalculatorII_227_Stack implements BasicCalculatorII_227 {

  private static final char SPACE = ' ';
  private static final char DIVIDE = '/';
  private static final char MULTIPLY = '*';
  private static final char ADD = '+';
  private static final char SUBTRACT = '-';

  @Override
  public int calculate(final String s) {
    final Stack<Integer> stack = new Stack<>();

    int number = 0;
    char prevOperator = ADD;
    for (final char c : s.toCharArray()) {
      if (SPACE == c) {
        continue;
      }

      if (Character.isDigit(c)) {
        number = number * 10 + (c - '0');
      } else {
        doOperation(stack, number, prevOperator);
        number = 0;
        prevOperator = c;
      }
    }

    doOperation(stack, number, prevOperator);

    int result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }

    return result;
  }

  private static void doOperation(
      final Stack<Integer> numbers,
      final int number,
      final char operator
  ) {
    switch (operator) {
      case ADD: {
        numbers.push(number);
        break;
      }
      case SUBTRACT: {
        numbers.push(-number);
        break;
      }
      case DIVIDE: {
        numbers.push(numbers.pop() / number);
        break;
      }
      case MULTIPLY: {
        numbers.push(numbers.pop() * number);
        break;
      }
    }
  }
}
