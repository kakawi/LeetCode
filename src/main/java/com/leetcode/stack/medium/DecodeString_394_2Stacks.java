package com.leetcode.stack.medium;

import java.util.Stack;

public class DecodeString_394_2Stacks implements DecodeString_394 {

  @Override
  public String decodeString(final String s) {
    Stack<Integer> counters = new Stack<>();
    Stack<StringBuilder> stringBuilders = new Stack<>();
    // Initialize the initial context (StringBuilder + counter)
    StringBuilder currentStringBuilder = new StringBuilder();
    int counter = 0;
    for (final char character : s.toCharArray()) {
      if (Character.isDigit(character)) {
        // we found the digit
        counter = counter * 10 + character - '0';
      } else if (character == '[') {
        // Start preparation to go deeper.
        // 1. Save the context (StringBuilder + counter)
        counters.push(counter);
        stringBuilders.add(currentStringBuilder);
        // 2. Create a new context (StringBuilder and counter)
        currentStringBuilder = new StringBuilder();
        counter = 0;
      } else if (character == ']') {
        // Finish the current level
        // 1. Get the resulted String
        String resultString = currentStringBuilder.toString();
        // 2. Restore the previous context (String Builder + counter)
        counter = counters.pop();
        currentStringBuilder = stringBuilders.pop();
        // 3. Add resulter String into prev context as many times as needed
        while (counter-- > 0) {
          currentStringBuilder.append(resultString);
        }
      } else {
        // we just add a character to the current StringBuilder
        currentStringBuilder.append(character);
      }
    }

    return currentStringBuilder.toString();
  }
}
