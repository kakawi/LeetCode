package com.leetcode.binarysearchtree.easy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;

import com.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class ConvertSortedArrayToBinarySearchTree_108Test {

  private final ConvertSortedArrayToBinarySearchTree_108 solution = new ConvertSortedArrayToBinarySearchTree_108_Impl();

  @Test
  void sortedArrayToBST_example1() {
    // given
    final int[] nums = {-10, -3, 0, 5, 9};

    // expected
    final TreeNode expected1 = new TreeNode(0,
            new TreeNode(-3, new TreeNode(-10), null),
            new TreeNode(9, new TreeNode(5), null)
    );
    final TreeNode expected2 = new TreeNode(0,
            new TreeNode(-10, null, new TreeNode(-3)),
            new TreeNode(5, null, new TreeNode(9))
    );

    // when
    final TreeNode result = solution.sortedArrayToBST(nums);

    // then
    assertThat(result, anyOf(is(expected1), is(expected2)));
  }

  @Test
  void sortedArrayToBST_example2() {
    // given
    final int[] nums = {1, 3};

    // expected
    final TreeNode expected1_1 = new TreeNode(3, new TreeNode(1), null);
    final TreeNode expected1_2 = new TreeNode(3, null, new TreeNode(1));
    final TreeNode expected2_1 = new TreeNode(1, new TreeNode(3), null);
    final TreeNode expected2_2 = new TreeNode(1, null, new TreeNode(3));

    // when
    final TreeNode result = solution.sortedArrayToBST(nums);

    // then
    assertThat(result, anyOf(
            is(expected1_1),
            is(expected1_2),
            is(expected2_1),
            is(expected2_2)
    ));
  }
}
