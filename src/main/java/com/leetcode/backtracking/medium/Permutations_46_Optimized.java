package com.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permutations_46_Optimized implements Permutations_46 {

  @Override
  public List<List<Integer>> permute(int[] nums) {
    final List<List<Integer>> result = new ArrayList<>();
    final boolean[] visited = new boolean[nums.length];

    backtrack(result, nums, new Stack<>(), visited);

    return result;
  }

  void backtrack(
      final List<List<Integer>> result,
      final int[] nums,
      final Stack<Integer> stack,
      final boolean[] visited
  ) {
    if (stack.size() == nums.length) {
      result.add(new ArrayList<>(stack));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (visited[i]) {
        continue;
      }

      stack.add(nums[i]);
      visited[i] = true;

      backtrack(result, nums, stack, visited);

      stack.pop();
      visited[i] = false;
    }
  }
}
