package com.neetcode.arraysandhashing.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * The idea is just to find is current number is the start of a sequence.
 */
public class LongestConsecutiveSequence_Impl implements LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    Set<Integer> allNumbers = new HashSet<>();
    for (int num : nums) {
      allNumbers.add(num);
    }
    int result = 0;
    for (int num : allNumbers) {
      if (allNumbers.contains(num - 1)) {
        continue;
      }
      int length = 1;
      while (allNumbers.contains(num + length)) {
        length++;
      }
      result = Math.max(result, length);
    }
    return result;
  }
}
