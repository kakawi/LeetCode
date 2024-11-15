package com.neetcode.arraysandhashing.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups_Impl implements AnagramGroups {

  @Override
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> result = new HashMap<>();
    for (String str : strs) {
      int[] hash = this.calculateWord(str);
      String key = Arrays.toString(hash);
      result.putIfAbsent(key, new ArrayList<>());
      result.get(key).add(str);
    }

    return new ArrayList<>(result.values());
  }

  private int[] calculateWord(String word) {
    int[] result = new int[26];
    for (char c : word.toCharArray()) {
      result[c - 'a']++;
    }
    return result;
  }
}
