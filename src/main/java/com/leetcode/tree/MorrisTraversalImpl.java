package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Ref: <a href="https://www.youtube.com/watch?v=80Zug6D1_r4">L37. Morris Traversal | Preorder |
 * Inorder | C++</a>
 */
public class MorrisTraversalImpl implements MorrisTraversal {

  @Override
  public List<Integer> inOrder(TreeNode root) {
    final List<Integer> result = new ArrayList<>();

    TreeNode currentNode = root;
    while (currentNode != null) {
      // 1st case
      if (currentNode.left == null) {
        result.add(currentNode.val);
        currentNode = currentNode.right;
      } else {
        // 2nd case
        TreeNode tmp = currentNode.left;
        while (tmp.right != null && tmp.right != currentNode) {
          tmp = tmp.right;
        }
        // there is no thread back yet. Add it and move LEFT
        if (tmp.right == null) {
          tmp.right = currentNode;
          currentNode = currentNode.left;
        } else {
          // already there is a thread back. Remove it, add CURRENT and move RIGHT.
          tmp.right = null;
          result.add(currentNode.val);
          currentNode = currentNode.right;
        }
      }
    }

    return result;
  }

  @Override
  public List<Integer> preOrder(TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    TreeNode currentNode = root;
    while (currentNode != null) {
      if (currentNode.left == null) {
        result.add(currentNode.val);
        currentNode = currentNode.right;
      } else {
        TreeNode tmp = currentNode.left;
        while (tmp.right != null && tmp.right != currentNode) {
          tmp = tmp.right;
        }
        if (tmp.right == null) {
          tmp.right = currentNode;
          result.add(currentNode.val);
          currentNode = currentNode.left;
        } else {
          tmp.right = null;
          currentNode = currentNode.right;
        }
      }
    }

    return result;
  }
}
