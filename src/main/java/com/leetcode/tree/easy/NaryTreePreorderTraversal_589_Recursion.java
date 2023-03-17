package com.leetcode.tree.easy;

import com.leetcode.tree.Node;
import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal_589_Recursion implements NaryTreePreorderTraversal_589 {

  @Override
  public List<Integer> preorder(final Node root) {
    final List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    preorderTraversal(root, result);
    return result;
  }

  private void preorderTraversal(final Node node, final List<Integer> result) {
    result.add(node.val);
    for (final Node child : node.children) {
      preorderTraversal(child, result);
    }
  }
}
