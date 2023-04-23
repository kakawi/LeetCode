package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackTraversal implements TreeTraversal {

  @Override
  public List<Integer> inOrder(TreeNode root) {
    final List<Integer> result = new ArrayList<>();

    final Stack<TreeNode> stack = new Stack<>();
    while (!stack.isEmpty() || root != null) {
      while (root != null) {
        stack.add(root);
        root = root.left;
      }
      root = stack.pop();
      result.add(root.val);
      root = root.right;
    }

    return result;
  }

  @Override
  public List<Integer> preOrder(TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    final Stack<TreeNode> stack = new Stack<>();
    while (!stack.isEmpty() || root != null) {
      while (root != null) {
        result.add(root.val);
        stack.add(root);
        root = root.left;
      }
      root = stack.pop().right;
    }

    return result;
  }

  @Override
  public List<Integer> postOrder(final TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    final Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    TreeNode prev = null;
    while (!stack.isEmpty()) {
      TreeNode current = stack.peek();
      /* go DOWN the tree in search of a leaf an if so
      process it and pop stack otherwise move down */
      if (prev == null || prev.left == current || prev.right == current) {
        if (current.left != null) {
          stack.push(current.left);
        } else if (current.right != null) {
          stack.push(current.right);
        } else {
          stack.pop();
          result.add(current.val);
        }
 
      /* go UP the tree from left node, if the
      child is right push it onto stack otherwise
      process parent and pop stack */
      } else if (current.left == prev) {
        if (current.right != null) {
          stack.push(current.right);
        } else {
          stack.pop();
          result.add(current.val);
        }
 
      /* go UP the tree from right node and after
      coming back from right node process parent
      and pop stack */
      } else if (current.right == prev) {
        stack.pop();
        result.add(current.val);
      }

      prev = current;
    }

    return result;
  }
}
