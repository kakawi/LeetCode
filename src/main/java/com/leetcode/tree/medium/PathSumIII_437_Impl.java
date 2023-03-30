package com.leetcode.tree.medium;

import com.leetcode.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class PathSumIII_437_Impl implements PathSumIII_437 {

  @Override
  public int pathSum(TreeNode root, int sum) {
    final int[] result = new int[1];
    final Map<Long, Integer> prefixSum = new HashMap<>();

    // initial
    prefixSum.put(0L, 1);

    helper(root, 0, sum, prefixSum, result);

    return result[0];
  }

  public void helper(
      final TreeNode node,
      long currSum,
      final long target,
      final Map<Long, Integer> prefixSum,
      final int[] result
  ) {
    if (node == null) {
      return;
    }

    currSum += node.val;

    result[0] += prefixSum.getOrDefault(currSum - target, 0);
    prefixSum.merge(currSum, 1, Integer::sum);

    helper(node.left, currSum, target, prefixSum, result);
    helper(node.right, currSum, target, prefixSum, result);

    // backtrack
    prefixSum.compute(currSum, (k, value) -> value - 1);
  }
}
