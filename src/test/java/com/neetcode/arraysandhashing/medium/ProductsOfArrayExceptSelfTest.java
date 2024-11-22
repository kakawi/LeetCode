package com.neetcode.arraysandhashing.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductsOfArrayExceptSelfTest {

  private final ProductsOfArrayExceptSelf solution = new ProductsOfArrayExceptSelf_ImplOptimal();

  @Test
  void example1() {
    // given
    int[] input = { 1, 2, 4, 6 };

    // expected
    int[] expected = { 48, 24, 12, 8 };

    // when
    int[] result = solution.productExceptSelf(input);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    int[] input = { -1, 0, 1, 2, 3 };

    // expected
    int[] expected = { 0, -6, 0, 0, 0 };

    // when
    int[] result = solution.productExceptSelf(input);

    // then
    assertArrayEquals(expected, result);
  }
}
