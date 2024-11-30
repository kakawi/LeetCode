package com.leetcode.tree.easy;

import java.util.Stack;

import com.common.TreeNode;

public class SameTree_100_BFS_array implements SameTree_100 {

  @Override
  public boolean isSameTree(final TreeNode p, final TreeNode q) {
    final Stack<TreeNode[]> stack = new Stack<>();
    stack.add(new TreeNode[]{p, q});
    while (!stack.isEmpty()) {
      final TreeNode[] pair = stack.pop();
      final TreeNode tree1 = pair[0];
      final TreeNode tree2 = pair[1];
      if (tree1 == null && tree2 == null) continue;
      if (tree1 == null || tree2 == null) return false;
      if (tree1.val != tree2.val) return false;
      stack.add(new TreeNode[]{tree1.left, tree2.left});
      stack.add(new TreeNode[]{tree1.right, tree2.right});
    }

    return true;
  }
}
