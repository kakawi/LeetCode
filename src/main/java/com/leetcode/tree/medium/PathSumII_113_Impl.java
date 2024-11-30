package com.leetcode.tree.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.common.TreeNode;

public class PathSumII_113_Impl implements PathSumII_113 {

  @Override
  public List<List<Integer>> pathSum(final TreeNode root, final int targetSum) {
    final List<List<Integer>> result = new ArrayList<>();
    final Stack<Integer> path = new Stack<>();
    fillPaths(root, path, targetSum, result);
    return result;
  }

  private void fillPaths(
      // current context
      final TreeNode node,
      final Stack<Integer> path,
      final int targetSum,
      // result
      final List<List<Integer>> result
  ) {
    if (node == null) {
      return;
    }

    path.add(node.val);
    if (isLeaf(node)) {
      if (node.val == targetSum) {
        result.add(new ArrayList<>(path));
      }
    } else {
      fillPaths(node.left, path, targetSum - node.val, result);
      fillPaths(node.right, path, targetSum - node.val, result);
    }

    // backtracking
    path.pop();
  }

  private static boolean isLeaf(final TreeNode node) {
    return node.left == null && node.right == null;
  }
}
