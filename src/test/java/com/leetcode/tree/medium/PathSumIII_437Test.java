package com.leetcode.tree.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.tree.TreeNode;
import org.junit.jupiter.api.Test;

class PathSumIII_437Test {

  private final PathSumIII_437 solution = new PathSumIII_437_Impl();

  @Test
  void pathSum_example1() {
    // given
    final TreeNode root = new TreeNode(10,
        new TreeNode(5,
            new TreeNode(3, new TreeNode(3), new TreeNode(-2)),
            new TreeNode(2, null, new TreeNode(1))
        ),
        new TreeNode(-3, null, new TreeNode(11))
    );
    final int targetSum = 8;

    // expected
    final int expected = 3;

    // when
    final int result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_example2() {
    // given
    final TreeNode root = new TreeNode(5,
        new TreeNode(4,
            new TreeNode(11,
                new TreeNode(7),
                new TreeNode(2)
            ),
            null),
        new TreeNode(8,
            new TreeNode(13),
            new TreeNode(4,
                new TreeNode(5),
                new TreeNode(1)
            )
        )
    );
    final int targetSum = 22;

    // expected
    final int expected = 3;

    // when
    final int result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_example3() {
    // given
    // [1000000000, 1000000000,null, 294967296,null, 1000000000,null, 1000000000,null,1000000000]
    final TreeNode root = new TreeNode(1000000000,
        new TreeNode(1000000000,
            new TreeNode(294967296,
                new TreeNode(1000000000,
                    new TreeNode(1000000000,
                        new TreeNode(1000000000),
                        null),
                    null),
                null),
            null),
        null
    );
    final int targetSum = 0;

    // expected
    final int expected = 0;

    // when
    final int result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_example4() {
    // given
    final TreeNode root = new TreeNode(0, new TreeNode(1), new TreeNode(1));
    final int targetSum = 1;

    // expected
    final int expected = 4;

    // when
    final int result = solution.pathSum(root, targetSum);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pathSum_null() {
    // given
    final int targetSum = 22;

    // expected
    final int expected = 0;

    // when
    final int result = solution.pathSum(null, targetSum);

    // then
    assertEquals(expected, result);
  }
}
