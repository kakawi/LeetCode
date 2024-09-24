package com.leetcode.prefixsum.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * More solutions: https://www.youtube.com/watch?v=hqfPW9if3qk
 */
public class ContinuousSubarraySum_523_Impl implements ContinuousSubarraySum_523 {

  @Override
  public boolean checkSubarraySum(int[] nums, int k) {
    // <remainder, index>
    final Map<Integer, Integer> map = new HashMap<>();

    map.put(0, 0);
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      final int remainder = sum % k;
      if (map.containsKey(remainder)) {
        // are there at least 2 elements?
        if (i - map.get(remainder) >= 1) {
          return true;
        }
      } else {
        map.put(remainder, i + 1);
      }
    }

    return false;
  }
}
