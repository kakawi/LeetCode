package com.neetcode.arraysandhashing.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoIntegerSum_Impl implements TwoIntegerSum {

  @Override
  public int[] twoSum(int[] nums, int target) {
    final Map<Integer, Integer> seenNumbers = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final int complement = target - nums[i];
      if (seenNumbers.containsKey(complement)) {
        return new int[] { seenNumbers.get(complement), i };
      }
      seenNumbers.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
