package com.leetcode.tree.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

class InvertBinaryTree_226Test {

  private final InvertBinaryTree_226 solution = new InvertBinaryTree_226_Impl();

  @Test
  void invertTree_example1() {
    // given
    final TreeNode root = new TreeNode(4,
        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
        new TreeNode(7, new TreeNode(6), new TreeNode(9))
    );

    // expected
    final TreeNode expected = new TreeNode(4,
        new TreeNode(7, new TreeNode(9), new TreeNode(6)),
        new TreeNode(2, new TreeNode(3), new TreeNode(1))
    );

    // when
    final TreeNode result = solution.invertTree(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void invertTree_example2() {
    // given
    final TreeNode root = new TreeNode(2,
        new TreeNode(1),
        new TreeNode(3)
    );

    // expected
    final TreeNode expected = new TreeNode(2,
        new TreeNode(3),
        new TreeNode(1)
    );

    // when
    final TreeNode result = solution.invertTree(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void invertTree_null() {
    // when
    final TreeNode result = solution.invertTree(null);

    // then
    assertNull(result);
  }
}
