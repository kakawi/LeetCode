package com.leetcode.tree.easy;

import com.leetcode.tree.TreeNode;
import java.util.Stack;

public class SameTree_100_BFS implements SameTree_100 {

  @Override
  public boolean isSameTree(final TreeNode p, final TreeNode q) {
    final Stack<PairOfNodes> stack = new Stack<>();
    stack.add(PairOfNodes.of(p, q));
    while (!stack.isEmpty()) {
      final PairOfNodes pair = stack.pop();
      final TreeNode node1 = pair.p;
      final TreeNode node2 = pair.q;
      if (node1 == null && node2 == null) continue;
      if (node1 == null || node2 == null) return false;
      if (node1.val != node2.val) return false;
      stack.add(PairOfNodes.of(node1.left, node2.left));
      stack.add(PairOfNodes.of(node1.right, node2.right));
    }

    return true;
  }

  private static class PairOfNodes {
    private final TreeNode p;
    private final TreeNode q;

    private PairOfNodes(final TreeNode p, final TreeNode q) {
      this.p = p;
      this.q = q;
    }

    public static PairOfNodes of(final TreeNode p, final TreeNode q) {
      return new PairOfNodes(p, q);
    }
  }
}
