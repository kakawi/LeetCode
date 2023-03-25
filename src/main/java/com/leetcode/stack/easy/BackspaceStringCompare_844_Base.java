package com.leetcode.stack.easy;

import java.util.Stack;

public class BackspaceStringCompare_844_Base implements BackspaceStringCompare_844 {

  @Override
  public boolean backspaceCompare(final String s, final String t) {
    Stack<Character> source = makeStack(s);
    Stack<Character> target = makeStack(t);
    return source.equals(target);
  }

  private Stack<Character> makeStack(final String s) {
    Stack<Character> stack = new Stack<>();
    for (final char c : s.toCharArray()) {
      if (c == '#') {
        if (!stack.isEmpty()) stack.pop();
        continue;
      }
      stack.push(c);
    }
    return stack;
  }
}
