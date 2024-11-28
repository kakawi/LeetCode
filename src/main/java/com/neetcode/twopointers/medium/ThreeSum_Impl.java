package com.neetcode.twopointers.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_Impl implements ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    int lastIndex = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
      // prevent duplicates #1
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int staticElement = nums[i];
      int left = i + 1;
      int right = lastIndex;
      while (left < right) {
        int sum = staticElement + nums[left] + nums[right];
        if (sum > 0) {
          right--;
        } else if (sum < 0) {
          left++;
        } else {
          List<Integer> triplet = List.of(staticElement, nums[left], nums[right]);
          result.add(triplet);
          // maybe there is more than one triplet
          left++;
          right--;
          // prevent duplicates #2
          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
        }
      }
    }

    return result;
  }
}
