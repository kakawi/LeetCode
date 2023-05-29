package com.hlebon.moneipoint;

import java.util.List;

/**
 * The same question as https://leetcode.com/problems/find-pivot-index/
 */
public class FindPivotIndex {
  public static int balancedSum(List<Integer> arr) {
    int totalSum = 0;
    for (Integer integer : arr) {
      totalSum += integer;
    }
    int left = 0;
    for (int i = 0; i < arr.size(); i++) {
      int right = totalSum - left - arr.get(i);
      if (left == right) {
        return i;
      }
      left += arr.get(i);
    }
    throw new IllegalStateException("Something went wrong");
  }
}
