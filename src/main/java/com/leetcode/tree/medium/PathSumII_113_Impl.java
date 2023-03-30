package com.leetcode.tree.medium;

import com.leetcode.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathSumII_113_Impl implements PathSumII_113 {

  @Override
  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> path = new ArrayList<>();
    dfs(root, path, targetSum, result);
    return result;
  }

  private void dfs(
      final TreeNode node,
      final List<Integer> currentPath,
      final int remainingSum,
      final List<List<Integer>> result
  ) {
    if (node == null) {
      return;
    }

    // add the current node val to path
    currentPath.add(node.val);

    if (node.left == null && node.right == null && remainingSum == node.val) {
      result.add(new ArrayList<>(currentPath));
    } else {
      this.dfs(node.left, currentPath, remainingSum - node.val, result);
      this.dfs(node.right, currentPath, remainingSum - node.val, result);
    }

    // backtrack
    currentPath.remove(currentPath.size() - 1);
  }
}
