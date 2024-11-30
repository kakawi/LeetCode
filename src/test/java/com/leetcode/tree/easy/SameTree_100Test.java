package com.leetcode.tree.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

class SameTree_100Test {

  private final SameTree_100 solution = new SameTree_100_BFS_array();

  @Test
  void isSameTree_example1() {
    // given
    final TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    final TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    // when
    final boolean result = solution.isSameTree(p, q);

    // then
    assertTrue(result);
  }

  @Test
  void isSameTree_example2() {
    // given
    final TreeNode p = new TreeNode(1, new TreeNode(2), null);
    final TreeNode q = new TreeNode(1, null, new TreeNode(2));

    // when
    final boolean result = solution.isSameTree(p, q);

    // then
    assertFalse(result);
  }

  @Test
  void isSameTree_example3() {
    // given
    final TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
    final TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));

    // when
    final boolean result = solution.isSameTree(p, q);

    // then
    assertFalse(result);
  }
}
