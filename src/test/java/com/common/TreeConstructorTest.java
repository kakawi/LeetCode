package com.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreeConstructorTest {
  private final TreeConstructor constructor = new TreeConstructor();

  @Test
  void example1() {
    // given
    Integer[] input = new Integer[] { 1, 2, 3 };

    // expected
    TreeNode expected = new TreeNode(
        1,
        new TreeNode(2),
        new TreeNode(3));

    // when
    TreeNode result = constructor.constructTree(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    Integer[] input = new Integer[] { 1, null, 1, null, 1, null, 1, 2 };

    // expected
    TreeNode expected = new TreeNode(
        1,
        null,
        new TreeNode(
            1,
            null,
            new TreeNode(
                1,
                null,
                new TreeNode(
                    1,
                    new TreeNode(2),
                    null))));

    // when
    TreeNode result = constructor.constructTree(input);

    // then
    assertEquals(expected, result);
  }
}
