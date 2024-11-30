package com.common;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversalRecursion implements TreeTraversal {

  @Override
  public List<Integer> inOrder(final TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    inOrder(root, result);
    return result;
  }

  private void inOrder(final TreeNode node, final List<Integer> result) {
    if (node == null) {
      return;
    }

    inOrder(node.left, result);
    result.add(node.val); // Do logic
    inOrder(node.right, result);
  }

  @Override
  public List<Integer> preOrder(final TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    preOrder(root, result);
    return result;
  }

  private void preOrder(final TreeNode node, final List<Integer> result) {
    if (node == null) {
      return;
    }

    result.add(node.val); // Do logic

    preOrder(node.left, result);
    preOrder(node.right, result);
  }

  @Override
  public List<Integer> postOrder(final TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    postOrder(root, result);
    return result;
  }

  private void postOrder(final TreeNode node, final List<Integer> result) {
    if (node == null) {
      return;
    }

    postOrder(node.left, result);
    postOrder(node.right, result);

    result.add(node.val); // Do logic
  }
}
