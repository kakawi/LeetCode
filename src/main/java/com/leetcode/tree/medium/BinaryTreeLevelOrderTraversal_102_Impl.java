package com.leetcode.tree.medium;

import com.leetcode.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal_102_Impl implements BinaryTreeLevelOrderTraversal_102 {

  /**
   * Queue approach
   * The size of the queue is the number of elements on current level
   */
  @Override
  public List<List<Integer>> levelOrder(TreeNode root) {
    final Queue<TreeNode> queue = new ArrayDeque<>();
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    queue.add(root);
    while (!queue.isEmpty()) {
      int sizeOfTheLevel = queue.size();
      List<Integer> currentLevel = new ArrayList<>();
      while (sizeOfTheLevel > 0) {
        final TreeNode node = queue.poll();
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
        currentLevel.add(node.val);
        sizeOfTheLevel--;
      }
      result.add(currentLevel);
    }

    return result;
  }
}
