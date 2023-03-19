package com.leetcode.binarysearchtree.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class LowestCommonAncestorOfaBinarySearchTree_235Test {

  private final LowestCommonAncestorOfaBinarySearchTree_235 solution = new LowestCommonAncestorOfaBinarySearchTree_235_Impl();

  @Test
  void lowestCommonAncestor_example1() {
    // given
    final TreeNode p = new TreeNode(2, new TreeNode(0),
        new TreeNode(4, new TreeNode(3), new TreeNode(5)));
    final TreeNode q = new TreeNode(8, new TreeNode(7), new TreeNode(9));
    final TreeNode root = new TreeNode(6, p, q);

    // when
    final TreeNode result = solution.lowestCommonAncestor(root, p, q);

    // then
    assertEquals(root, result);
  }

  @Test
  void lowestCommonAncestor_example2() {
    // given
    final TreeNode q = new TreeNode(4, new TreeNode(3), new TreeNode(5));
    final TreeNode p = new TreeNode(2, new TreeNode(0), q);
    final TreeNode root = new TreeNode(6,
        p,
        new TreeNode(8, new TreeNode(7), new TreeNode(9))
    );

    // when
    final TreeNode result = solution.lowestCommonAncestor(root, p, q);

    // then
    assertEquals(p, result);
  }

  @Test
  void lowestCommonAncestor_example3() {
    // given
    final TreeNode q = new TreeNode(1);
    final TreeNode root = new TreeNode(2, q, null);

    // when
    final TreeNode result = solution.lowestCommonAncestor(root, root, q);

    // then
    assertEquals(root, result);
  }
}
