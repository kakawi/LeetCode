package com.leetcode.stack.easy;

import java.util.Stack;

public class BackspaceStringCompare_844_Stack implements BackspaceStringCompare_844 {

  @Override
  public boolean backspaceCompare(final String s, final String t) {
    final Stack<Character> sourceString = resultString(s);
    final Stack<Character> targetString = resultString(t);
    return sourceString.equals(targetString);
  }

  private Stack<Character> resultString(final String source) {
    final Stack<Character> stack = new Stack<>();
    for (int i = 0; i < source.length(); i++) {
      final char character = source.charAt(i);
      if (character == '#') {
        if (stack.isEmpty()) continue;
        stack.pop();
      } else {
        stack.add(character);
      }
    }

    return stack;
  }
}
