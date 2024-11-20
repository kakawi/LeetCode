package com.neetcode.arraysandhashing.medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings_Impl implements EncodeAndDecodeStrings {
  private final static char DELIMITER = '#';

  public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String str : strs) {
      sb.append(str.length()).append(DELIMITER).append(str);
    }

    return sb.toString();
  }

  public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
      int j = i;
      while (str.charAt(j) != DELIMITER) {
        j++;
      }
      int nextStrLength = Integer.parseInt(str.substring(i, j));
      i = j + 1;
      j = i + nextStrLength;
      result.add(str.substring(i, j));
      i = j;
    }
    return result;
  }
}
