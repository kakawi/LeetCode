package com.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class MorrisTraversalTest {

  private final MorrisTraversal solution = new MorrisTraversalImpl();

  @Test
  void inOrder() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5, null, new TreeNode(6))),
        new TreeNode(3)
    );

    // expected
    final List<Integer> expected = List.of(4, 2, 5, 6, 1, 3);

    // when
    final List<Integer> result = solution.inOrder(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void preOrder() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5, null, new TreeNode(6))),
        new TreeNode(3)
    );

    // expected
    final List<Integer> expected = List.of(1, 2, 4, 5, 6, 3);

    // when
    final List<Integer> result = solution.preOrder(root);

    // then
    assertEquals(expected, result);
  }
}
