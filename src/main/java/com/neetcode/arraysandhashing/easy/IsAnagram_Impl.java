package com.neetcode.arraysandhashing.easy;

public class IsAnagram_Impl implements IsAnagram {

  @Override
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] source = new int[26];
    for (int i = 0; i < s.length(); i++) {
      source[s.charAt(i) - 'a']++;
      source[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
      if (source[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
