package com.leetcode.tree.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_102 {

  public static void main(String[] args) {
    final Binary_Tree_Level_Order_Traversal_102 solution = new Binary_Tree_Level_Order_Traversal_102();
    TreeNode root = new TreeNode(3);
    TreeNode level1_left = new TreeNode(9);
    TreeNode level1_right = new TreeNode(20);
    TreeNode level2_2_left = new TreeNode(15);
    TreeNode level2_2_right = new TreeNode(7);
    level1_right.left = level2_2_left;
    level1_right.right = level2_2_right;
    root.left = level1_left;
    root.right = level1_right;

    solution.levelOrder_DFS(root);
  }

  /**
   * Queue approach
   * The size of the queue is the number of elements on current level
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    final Queue<TreeNode> queue = new ArrayDeque<>();
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    queue.add(root);
    while (!queue.isEmpty()) {
      int sizeOfTheLevel = queue.size();
      List<Integer> level = new ArrayList<>();
      while (sizeOfTheLevel > 0) {
        final TreeNode node = queue.poll();
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
        level.add(node.val);
        sizeOfTheLevel--;
      }
      result.add(level);
    }

    return result;
  }

  /**
   * DFS approach + recursion
   * The deep of recursion is the level
   */
  public List<List<Integer>> levelOrder_DFS(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    dfs(result, root, 0);

    return result;
  }

  private void dfs(List<List<Integer>> result, TreeNode node, int level) {
    if (node == null) return;

    if (result.size() < level + 1) result.add(new ArrayList<>());

    result.get(level).add(node.val);
    dfs(result, node.left, level + 1);
    dfs(result, node.right, level + 1);
  }
}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
