package com.leetcode.tree.medium;

import java.util.ArrayList;
import java.util.List;

import com.common.TreeNode;

public class BinaryTreeRightSideView_199_Impl implements BinaryTreeRightSideView_199 {

  @Override
  public List<Integer> rightSideView(TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    rightFirst(root, 1, result);
    return result;
  }

  private void rightFirst(final TreeNode node, final int level, final List<Integer> list) {
    if (node == null) {
      return;
    }

    if (list.size() < level) {
      list.add(node.val);
    }

    rightFirst(node.right, level + 1, list);
    rightFirst(node.left, level + 1, list);
  }
}
