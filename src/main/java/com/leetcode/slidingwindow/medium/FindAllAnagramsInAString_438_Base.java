package com.leetcode.slidingwindow.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString_438_Base implements FindAllAnagramsInAString_438 {

  @Override
  public List<Integer> findAnagrams(final String s, final String p) {
    // target result
    final List<Integer> result = new ArrayList<>();

    // global context - patternFrequency
    final int[] patternFrequency = generateFrequency(p);

    // current context - sourceFrequency + left
    final int[] sourceFrequency = new int[26];
    int left = 0; // TODO you can use p.length() to calculate Left

    // loop
    for (int i = 0; i < s.length(); i++) {
      sourceFrequency[getIndex(s.charAt(i))]++;
      int currentLength = i - left + 1;

      // TODO you can calculate initial sourceFrequency before the loop
      if (currentLength > p.length()) {
        sourceFrequency[getIndex(s.charAt(left))]--;
        left++;
      }

      // TODO: you can save previous result to check if you need compare new combination
      if (areSame(sourceFrequency, patternFrequency)) {
        result.add(left);
      }
    }

    return result;
  }

  private boolean areSame(final int[] source, final int[] target) {
    for (int i = 0; i < source.length; i++) {
      if (source[i] != target[i]) return false;
    }
    return true;
  }


  private int[] generateFrequency(final String s) {
    int[] result = new int[26];
    for (final char c : s.toCharArray()) {
      result[getIndex(c)]++;
    }
    return result;
  }

  private int getIndex(final char c) {
    return c - 'a';
  }
}
