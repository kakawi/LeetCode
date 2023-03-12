package com.leetcode.string.easy;

public class IsomorphicStrings_205_Impl implements IsomorphicStrings_205 {

  @Override
  public boolean isIsomorphic(final String source, final String target) {
    // these arrays store the last index where we saw a char
    int[] sourceLastPlace = new int[256];
    int[] targetLastPlace = new int[256];

    for (int i = 0; i < source.length(); i++) {
      final char sourceChar = source.charAt(i);
      final char targetChar = target.charAt(i);
      if (sourceLastPlace[sourceChar] != targetLastPlace[targetChar]) {
        return false;
      }
      // we use `index + 1` just because int[] is being initialized with 0
      sourceLastPlace[sourceChar] = i + 1;
      targetLastPlace[targetChar] = i + 1;
    }

    return true;
  }
}
