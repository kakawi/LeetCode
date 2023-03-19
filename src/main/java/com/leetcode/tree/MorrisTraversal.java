package com.leetcode.tree;

import java.util.List;

/**
 * Time: ~O(N)
 * Space: O(1)
 */
public interface MorrisTraversal {

  List<Integer> inOrder(TreeNode root);

  List<Integer> preOrder(TreeNode root);
}
