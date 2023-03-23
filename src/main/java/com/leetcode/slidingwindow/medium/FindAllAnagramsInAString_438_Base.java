package com.leetcode.slidingwindow.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString_438_Base implements
    FindAllAnagramsInAString_438 {

  @Override
  public List<Integer> findAnagrams(final String s, final String p) {
    final List<Integer> result = new ArrayList<>();

    final int sourceLength = s.length();
    final int patternLength = p.length();

    final int[] patternFrequency = getFrequency(p);
    final int[] sourceFrequency = new int[26];

    for (int i = 0; i < sourceLength; i++) {
      sourceFrequency[getIndex(s.charAt(i))]++;
      if (i >= patternLength) {
        sourceFrequency[getIndex(s.charAt(i - patternLength))]--;
      }
      if (areSame(sourceFrequency, patternFrequency)) {
        result.add(i - patternLength + 1);
      }
    }

    return result;
  }

  private int[] getFrequency(final String s) {
    final int[] result = new int[26];
    for (final char c : s.toCharArray()) {
      result[getIndex(c)]++;
    }

    return result;
  }

  private int getIndex(final char c) {
    return c - 'a';
  }

  private boolean areSame(final int[] source, final int[] target) {
    for (int i = 0; i < source.length; i++) {
      if (source[i] != target[i]) {
        return false;
      }
    }
    return true;
  }
}
