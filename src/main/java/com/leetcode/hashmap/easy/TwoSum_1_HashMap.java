package com.leetcode.hashmap.easy;

import com.leetcode.hashmap.easy.TwoSum_1;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1_HashMap implements TwoSum_1 {

  @Override
  public int[] twoSum(final int[] nums, final int target) {
    // <Value, Index>
    final Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int currentValue = nums[i];
      int neededNumber = target - currentValue;
      if (map.containsKey(neededNumber)) {
        return new int[]{i, map.get(neededNumber)};
      }
      map.put(currentValue, i);
    }

    throw new IllegalStateException("The solution is guaranteed");
  }
}
