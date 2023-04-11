package com.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permutations_46_Impl implements Permutations_46 {

  @Override
  public List<List<Integer>> permute(final int[] nums) {
    final List<List<Integer>> result = new ArrayList<>();
    final Stack<Integer> stack = new Stack<>();

    backtrack(nums, stack, result);

    return result;
  }

  private void backtrack(final int[] nums, final Stack<Integer> stack, final List<List<Integer>> result) {
    if (stack.size() == nums.length) {
      result.add(new ArrayList<>(stack));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (stack.contains(nums[i])) continue;
      stack.push(nums[i]);
      backtrack(nums, stack, result);
      stack.pop();
    }
  }
}
