package com.leetcode.slidingwindow.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString_438_My implements FindAllAnagramsInAString_438 {
  @Override
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    if (s.length() < p.length()) {
      return result;
    }

    // initialize frequencies
    int[] targetFrequency = initializeFrequency(p);
    int[] sourceFrequency = initializeFrequency(s.substring(0, p.length() - 1)); // one letter less than `p.length`

    for (int i = p.length() - 1; i < s.length(); i++) {
      sourceFrequency[s.charAt(i)]++;
      if (areTheSame(sourceFrequency, targetFrequency)) {
        result.add(i - p.length() + 1);
      }
      sourceFrequency[s.charAt(i - p.length() + 1)]--;
    }

    return result;
  }

  private int[] initializeFrequency(String str) {
    int[] frequency = new int[26];
    for (char c : str.toCharArray()) {
      frequency[c]++;
    }
    return frequency;
  }

  private boolean areTheSame(int[] source, int[] target) {
    for (int i = 0; i < source.length; i++) {
      if (source[i] != target[i]) return false;
    }
    return true;
  }
}
