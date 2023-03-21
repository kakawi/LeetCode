package com.leetcode.tree;

import java.util.List;

public interface TreeTraversal {

  List<Integer> inOrder(TreeNode root);

  List<Integer> preOrder(TreeNode root);

  /**
   * Left
   * Right
   * Visit
   *
   * Ref: https://leetcode.com/problems/binary-tree-postorder-traversal/solutions/45648/three-ways-of-iterative-postorder-traversing-easy-explanation/
   */
  List<Integer> postOrder(TreeNode root);
}
