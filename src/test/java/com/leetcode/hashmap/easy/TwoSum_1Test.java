package com.leetcode.hashmap.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.leetcode.hashmap.easy.TwoSum_1;
import com.leetcode.hashmap.easy.TwoSum_1_HashMap;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class TwoSum_1Test {

  private final TwoSum_1 solution = new TwoSum_1_HashMap();

  @Test
  void twoSum_example1() {
    // given
    final int[] nums = {2, 7, 11, 15};
    final int target = 9;

    // expected
    final int[] expected = new int[]{0, 1};

    // when
    final int[] result = solution.twoSum(nums, target);

    // then
    Arrays.sort(expected);
    Arrays.sort(result);
    assertArrayEquals(expected, result);
  }

  @Test
  void twoSum_example2() {
    // given
    final int[] nums = {3, 2, 4};
    final int target = 6;

    // expected
    final int[] expected = new int[]{1, 2};

    // when
    final int[] result = solution.twoSum(nums, target);

    // then
    Arrays.sort(expected);
    Arrays.sort(result);
    assertArrayEquals(expected, result);
  }

  @Test
  void twoSum_example3() {
    // given
    final int[] nums = {3, 3};
    final int target = 6;

    // expected
    final int[] expected = new int[]{1, 0};

    // when
    final int[] result = solution.twoSum(nums, target);

    // then
    Arrays.sort(expected);
    Arrays.sort(result);
    assertArrayEquals(expected, result);
  }
}