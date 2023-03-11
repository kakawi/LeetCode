package com.leetcode.tree.easy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Deep-first search (aka DFS)
 */
public class Nary_Tree_Preorder_Traversal_589 {

  public static void main(String[] args) {
    final Nary_Tree_Preorder_Traversal_589 solution = new Nary_Tree_Preorder_Traversal_589();
    Node root = new Node(1, List.of(
        new Node(3,
            List.of(new Node(5), new Node(6))),
        new Node(2),
        new Node(4)
    ));
    solution.preorder(root);
  }

  public List<Integer> preorderQueue(Node root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Stack<Node> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      final Node first = stack.pop();
      result.add(first.val);
      if (first.children != null) {
        for (int i = first.children.size() - 1; i >= 0; i--) {
          stack.push(first.children.get(i));
        }
      }
    }

    return result;
  }

  // Recursive
  public List<Integer> preorder(Node root) {
    List<Integer> result = new LinkedList<>();
    if (root != null) {
      preorderTraversal(root, result);
    }

    return result;
  }

  private void preorderTraversal(Node node, List<Integer> result) {
    result.add(node.val);
    if (node.children == null) {
      return;
    }
    for (final Node child : node.children) {
      preorderTraversal(child, result);
    }
  }
}

class Node {

  public int val;
  public List<Node> children;

  public Node() {
  }

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }
}
