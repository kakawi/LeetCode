package com.leetcode.string.easy;

public class Isomorphic_Strings_205 {

  public static void main(String[] args) {
    final Isomorphic_Strings_205 solution = new Isomorphic_Strings_205();
    solution.isIsomorphic("egg", "add");
  }

  public boolean isIsomorphic(String s, String t) {
    int[] arr1 = new int[256];
    int[] arr2 = new int[256];

    for (int i = 0; i < s.length(); i++) {
      final int numberOfElements1 = arr1[s.charAt(i)];
      final int numberOfElements2 = arr2[t.charAt(i)];
      if (numberOfElements1 != numberOfElements2) {
        return false;
      }
      // save specific number for that characters, so next time we reach a char from S in T the character should be the same pair
      // index is perfect for that goal
      // we can't use 0, because 0 is default value for array, that's why we add 1 to the index
      arr1[s.charAt(i)] = i + 1;
      arr2[t.charAt(i)] = i + 1;
    }
    return true;
  }
}
