package com.leetcode.tree.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.common.TreeNode;

public class BinaryTreeLevelOrderTraversal_102_Impl implements BinaryTreeLevelOrderTraversal_102 {

  /**
   * Queue approach
   * The size of the queue is the number of elements on current level
   */
  @Override
  public List<List<Integer>> levelOrder(TreeNode root) {
    final List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    final Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int sizeOfTheLevel = queue.size();
      final List<Integer> currentLevel = new ArrayList<>();
      while (sizeOfTheLevel-- > 0) { // in this case we don't care about `sizeOfTheLevel`
        final TreeNode node = queue.poll();
        currentLevel.add(node.val);
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }
      result.add(currentLevel);
    }

    return result;
  }
}
