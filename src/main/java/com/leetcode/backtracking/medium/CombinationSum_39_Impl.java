package com.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum_39_Impl implements CombinationSum_39 {

  @Override
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    final List<List<Integer>> result = new ArrayList<>();
    final Stack<Integer> stack = new Stack<>();

    dfs(0, candidates, target, result, stack);

    return result;
  }

  public void dfs(
      final int candidateIndex,
      final int[] candidates,
      final int target,
      final List<List<Integer>> result,
      final Stack<Integer> stack
  ) {
    if (target == 0) {
      result.add(new ArrayList<>(stack));
      return;
    }
    if (candidateIndex == candidates.length) {
      return;
    }

    if (candidates[candidateIndex] <= target) {
      stack.push(candidates[candidateIndex]);
      dfs(candidateIndex, candidates, target - candidates[candidateIndex], result, stack);
      stack.pop();
    }

    dfs(candidateIndex + 1, candidates, target, result, stack);
  }
}
