package com.leetcode.tree.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.tree.TreeNode;
import org.junit.jupiter.api.Test;

class PathSum_112Test {

  private final PathSum_112 solution = new PathSum_112_DFS();

  @Test
  void hasPathSum_example1() {
    // given
    final TreeNode root = new TreeNode(5,
        new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
        new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))
    );
    final int targetSum = 22;

    // when
    final boolean result = solution.hasPathSum(root, targetSum);

    // then
    assertTrue(result);
  }

  @Test
  void hasPathSum_example2() {
    // given
    final TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    final int targetSum = 5;

    // when
    final boolean result = solution.hasPathSum(root, targetSum);

    // then
    assertFalse(result);
  }

  @Test
  void hasPathSum_null() {
    // given
    final int targetSum = 0;

    // when
    final boolean result = solution.hasPathSum(null, targetSum);

    // then
    assertFalse(result);
  }
}
