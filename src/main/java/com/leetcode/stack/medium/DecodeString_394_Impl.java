package com.leetcode.stack.medium;

import java.util.Stack;

public class DecodeString_394_Impl implements DecodeString_394 {

  @Override
  public String decodeString(final String s) {
    // Stacks for Context
    Stack<StringBuilder> stringBuilders = new Stack<>();
    Stack<Integer> numberOfCopies = new Stack<>();

    // Initial Context
    StringBuilder currentStringBuilder = new StringBuilder();
    int currentNumberOfCopies = 0;

    for (final char c : s.toCharArray()) {
      // 0. reading a number
      if (Character.isDigit(c)) {
        currentNumberOfCopies = currentNumberOfCopies * 10 + c - '0';
        continue;
      }
      if (c == '[') {
        // 1.1 save previous context
        stringBuilders.add(currentStringBuilder);
        numberOfCopies.add(currentNumberOfCopies);
        // 1.2 create a new context
        currentStringBuilder = new StringBuilder();
        currentNumberOfCopies = 0;
      } else if (c == ']') {
        // 2.1 create substring
        final String resultString = currentStringBuilder.toString();
        // 2.2 restore the context
        currentStringBuilder = stringBuilders.pop();
        currentNumberOfCopies = numberOfCopies.pop();
        // 2.3 add in the context resulted substring
        do {
          currentStringBuilder.append(resultString);
        } while (--currentNumberOfCopies != 0);
      } else {
        // 3. just add a character
        currentStringBuilder.append(c);
      }
    }

    return currentStringBuilder.toString();
  }
}
