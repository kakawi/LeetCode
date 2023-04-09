package com.leetcode.unionfind.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.unionfind.medium.NumberOfProvinces_547;
import com.leetcode.unionfind.medium.NumberOfProvinces_547_Impl;
import org.junit.jupiter.api.Test;

class NumberOfProvinces_547Test {

  private final NumberOfProvinces_547 solution = new NumberOfProvinces_547_Impl();

  @Test
  void findCircleNum_example1() {
    // given
    final int[][] isConnected = {
        {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
    };

    // expected
    final int expected = 2;

    // when
    final int result = solution.findCircleNum(isConnected);

    // then
    assertEquals(expected, result);
  }

  @Test
  void findCircleNum_example2() {
    // given
    final int[][] isConnected = {
        {1, 0, 0}, {0, 1, 0}, {0, 0, 1}
    };

    // expected
    final int expected = 3;

    // when
    final int result = solution.findCircleNum(isConnected);

    // then
    assertEquals(expected, result);
  }
}
