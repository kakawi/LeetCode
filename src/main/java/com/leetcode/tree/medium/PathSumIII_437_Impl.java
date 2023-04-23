package com.leetcode.tree.medium;

import com.leetcode.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class PathSumIII_437_Impl implements PathSumIII_437 {

  @Override
  public int pathSum(TreeNode root, int sum) {
    final int[] result = new int[1];
    // <Sum, number of times>
    // we're using Long, because sum can exceed Integer type
    final Map<Long, Integer> prefixSum = new HashMap<>();

    // initial
    prefixSum.put(0L, 1);

    findPaths(root, 0, sum, prefixSum, result);

    return result[0];
  }

  public void findPaths(
      final TreeNode node,
      long currentSum,
      final long target,
      final Map<Long, Integer> prefixSum,
      final int[] result
  ) {
    if (node == null) {
      return;
    }

    currentSum += node.val;

    final long desiredSum = currentSum - target;
    if (prefixSum.containsKey(desiredSum)) {
      result[0] += prefixSum.get(desiredSum);
    }
    prefixSum.merge(currentSum, 1, Integer::sum);

    findPaths(node.left, currentSum, target, prefixSum, result);
    findPaths(node.right, currentSum, target, prefixSum, result);

    // backtrack
    prefixSum.compute(currentSum, (k, value) -> value - 1);
  }
}
