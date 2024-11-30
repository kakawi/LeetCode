package com.leetcode.tree.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.common.TreeNode;

public class BinaryTreeRightSideView_199_My implements BinaryTreeRightSideView_199 {

  @Override
  public List<Integer> rightSideView(final TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    if (root == null) return result;

    final Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int levelSize = queue.size();

      while (levelSize > 0) {
        final TreeNode node = queue.poll();
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
        levelSize--;
        if (levelSize == 0) result.add(node.val);
      }
    }

    return result;
  }
}
