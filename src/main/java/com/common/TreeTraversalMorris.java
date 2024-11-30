package com.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Ref: <a href="https://www.youtube.com/watch?v=80Zug6D1_r4">L37. Morris Traversal | Preorder |
 * Inorder | C++</a>
 *
 * Time: ~O(N)
 * Space: O(1)
 */
public class TreeTraversalMorris implements TreeTraversal {

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

  @Override
  public List<Integer> postOrder(TreeNode root) {
    final List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    TreeNode dummy = new TreeNode(-1);
    TreeNode prev = null;
    dummy.left = root;
    root = dummy;
    while (root != null) {
      if (root.left == null) {
        root = root.right;
      } else {
        prev = root.left;
        while (prev.right != null && prev.right != root) {
          prev = prev.right;
        }
        if (prev.right == null) {
          prev.right = root;
          root = root.left;
        } else {
          TreeNode node = prev;
          reverse(root.left, prev);
          while (node != root.left) {
            result.add(node.val);
            node = node.right;
          }
          result.add(node.val);          // Print again since we are stopping at node=root.left
          reverse(prev, root.left);
          prev.right = null;
          root = root.right;
        }
      }
    }
    return result;
  }

  public void reverse(TreeNode from, TreeNode to) {
    if (from == to) {
      return;
    }
    TreeNode prev = from, node = from.right;
    while (prev != to) {
      TreeNode next = node.right;
      node.right = prev;
      prev = node;
      node = next;
    }
  }
}
