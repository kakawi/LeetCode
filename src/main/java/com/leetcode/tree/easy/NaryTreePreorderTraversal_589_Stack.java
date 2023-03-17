package com.leetcode.tree.easy;

import com.leetcode.tree.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal_589_Stack implements NaryTreePreorderTraversal_589 {

  @Override
  public List<Integer> preorder(final Node root) {
    final List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    final Stack<Node> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      final Node node = stack.pop();
      result.add(node.val);
      for (int i = node.children.size() - 1; i >= 0; i--) {
        stack.add(node.children.get(i));
      }
    }

    return result;
  }
}
