package com.leetcode.tree.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.tree.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class PathSumII_113Test {

  private final PathSumII_113 solution = new PathSumII_113_Impl();

  @Test
  void pathSum_example1() {
    // given
    final TreeNode root = new TreeNode(5,
        new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
        new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))
    );
    final int targetSum = 22;

    // expected
    final List<List<Integer>> expected = List.of(
        List.of(5, 4, 11, 2),
        List.of(5, 8, 4, 5)
    );

    // when
    final List<List<Integer>> result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_example2() {
    // given
    final TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    final int targetSum = 5;

    // expected
    final List<List<Integer>> expected = List.of();

    // when
    final List<List<Integer>> result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_example3() {
    // given
    final TreeNode root = new TreeNode(1, new TreeNode(2), null);
    final int targetSum = 0;

    // expected
    final List<List<Integer>> expected = List.of();

    // when
    final List<List<Integer>> result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_null() {
    // given
    final int targetSum = 0;

    // expected
    final List<List<Integer>> expected = List.of();

    // when
    final List<List<Integer>> result = solution.pathSum(null, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_dup() {
    // given
    final TreeNode root = new TreeNode(5,
        new TreeNode(4, new TreeNode(11, new TreeNode(2), new TreeNode(2)), null),
        new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))
    );
    final int targetSum = 22;

    // expected
    final List<List<Integer>> expected = List.of(
        List.of(5, 4, 11, 2),
        List.of(5, 4, 11, 2),
        List.of(5, 8, 4, 5)
    );

    // when
    final List<List<Integer>> result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }
}
