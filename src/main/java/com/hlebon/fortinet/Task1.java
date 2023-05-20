package com.hlebon.fortinet;

import java.util.Stack;

/**
 * Validate if String is balanced
 * String contains '(', ')', '{' and '}' brackets
 */
public class Task1 {

  public static boolean isBalanced(String s) {
    final Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || stack.isEmpty()) {
        stack.add(c);
      } else {
        Character previousElement = stack.peek();
        if (c == ')' && previousElement != '(') {
          return false;
        }
        if (c == '}' && previousElement != '{') {
          return false;
        }
        stack.pop();
      }
    }
    return stack.isEmpty();
  }
}
