package com.leetcode.tree.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

class SymmetricTree_101Test {

  private final SymmetricTree_101 solution = new SymmetricTree_101_Impl();

  @Test
  void isSymmetric_example1() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
        new TreeNode(2, new TreeNode(4), new TreeNode(3))
    );

    // when
    final boolean result = solution.isSymmetric(root);

    // then
    assertTrue(result);
  }

  @Test
  void isSymmetric_example2() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, null, new TreeNode(3)),
        new TreeNode(2, null, new TreeNode(3))
    );

    // when
    final boolean result = solution.isSymmetric(root);

    // then
    assertFalse(result);
  }
}
