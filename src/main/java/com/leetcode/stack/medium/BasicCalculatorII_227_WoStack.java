package com.leetcode.stack.medium;

public class BasicCalculatorII_227_WoStack implements BasicCalculatorII_227 {

  private static final char DIVIDE = '/';
  private static final char MULTIPLY = '*';
  private static final char ADD = '+';
  private static final char SUBTRACT = '-';

  @Override
  public int calculate(final String s) {
    int num = 0;
    char prevOperator = ADD;
    int last = 0;
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (Character.isDigit(c)) {
        num = num * 10 + (c - '0');
      }

      if (isOperator(c) || isLastCharacter(s, i)) {
        if (prevOperator == ADD) {
          result += last;
          last = num;
        } else if (prevOperator == SUBTRACT) {
          result += last;
          last = -num;
        } else if (prevOperator == MULTIPLY) {
          last *= num;
        } else if (prevOperator == DIVIDE) {
          last /= num;
        }

        num = 0;
        prevOperator = c;
      }
    }

    return result + last;
  }

  private static boolean isLastCharacter(final String s, final int i) {
    return i == s.length() - 1;
  }

  private static boolean isOperator(char c) {
    return c == ADD || c == SUBTRACT || c == MULTIPLY || c == DIVIDE;
  }
}
