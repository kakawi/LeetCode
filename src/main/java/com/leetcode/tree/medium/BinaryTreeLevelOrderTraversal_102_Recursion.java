package com.leetcode.tree.medium;

import com.leetcode.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_102_Recursion implements BinaryTreeLevelOrderTraversal_102 {

  @Override
  public List<List<Integer>> levelOrder(final TreeNode root) {
    final List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    dfs(root, 0, result);

    return result;
  }

  private void dfs(final TreeNode node, final int level, final List<List<Integer>> result) {
    // terminated condition
    if (node == null) {
      return;
    }

    // add one more level if need it
    if (result.size() < level + 1) result.add(new ArrayList<>());

    result.get(level).add(node.val);
    dfs(node.left, level + 1, result);
    dfs(node.right, level + 1, result);
  }
}
