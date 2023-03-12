package com.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * The optimizations did not change result in Time
 */
public class FindAllAnagramsInAString_438_Optimized implements FindAllAnagramsInAString_438 {

  @Override
  public List<Integer> findAnagrams(String s, String p) {
    final List<Integer> list = new ArrayList<>();
    if (p.length() > s.length()) {
      return list; // Base Condition
    }

    int N = s.length(); // Array1 of s
    int M = p.length(); // Array2 of p
    int[] count = freq(p); // initialize only 1 time

    int[] currentCount = freq(
        s.substring(0, M)); // freq function, update every-time according to sliding window

    boolean areSame = areSame(count, currentCount);
    if (areSame) {
      list.add(0);
    }

    int i;
    boolean wasPrevAnagram = areSame;
    for (i = M; i < N; i++) { // going from 3 to 9 in above example
      final char leavingCharacter = s.charAt(i - M);

      final char newCharacter = s.charAt(i);

      if (leavingCharacter == newCharacter) {
        if (wasPrevAnagram) {
          list.add(i - M + 1); // this is also Anagram
        } else {
          continue; // this is also not Anagram
        }
      } else {
        currentCount[leavingCharacter - 'a']--; // blue pointer, decrement frequency
        currentCount[newCharacter - 'a']++; // red pointer, increment frequency
        if (wasPrevAnagram) {
          wasPrevAnagram = false;
          continue; // this is not Anagram anymore
        } else {
          areSame = areSame(count, currentCount);
          if (areSame) { // now check, both array are same
            list.add(i - M + 1);
          }
          wasPrevAnagram = areSame;
        }
      }
    }

    return list;
  }

  private boolean areSame(int[] x, int[] y) {
    for (int i = 0; i < 26; i++) {
      // compare all the frequency & doesn't find any di-similar frequency return true otherwise false
      if (x[i] != y[i]) {
        return false;
      }
    }

    return true;
  }

  private int[] freq(String s) {
    int[] count = new int[26]; // create array of size 26
    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++; // update acc. to it's frequency
    }

    return count; // and return count
  }
}
