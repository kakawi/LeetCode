package com.leetcode.tree.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

import com.common.TreeNode;

class BinaryTreeRightSideView_199Test {

  private final BinaryTreeRightSideView_199 solution = new BinaryTreeRightSideView_199_Impl();

  @Test
  void rightSideView_example1() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, null, new TreeNode(5)),
        new TreeNode(3, null, new TreeNode(4))
    );

    // expected
    final List<Integer> expected = List.of(1, 3, 4);

    // when
    final List<Integer> result = solution.rightSideView(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void rightSideView_example2() {
    // given
    final TreeNode root = new TreeNode(1, null, new TreeNode(3));

    // expected
    final List<Integer> expected = List.of(1, 3);

    // when
    final List<Integer> result = solution.rightSideView(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void rightSideView_null() {
    // expected
    final List<Integer> expected = List.of();

    // when
    final List<Integer> result = solution.rightSideView(null);

    // then
    assertEquals(expected, result);
  }
}
