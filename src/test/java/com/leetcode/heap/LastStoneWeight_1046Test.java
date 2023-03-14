package com.leetcode.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.heap.easy.LastStoneWeight_1046;
import com.leetcode.heap.easy.LastStoneWeight_1046_Impl;
import org.junit.jupiter.api.Test;

class LastStoneWeight_1046Test {

  private final LastStoneWeight_1046 solution = new LastStoneWeight_1046_Impl();

  @Test
  void lastStoneWeight_example1() {
    // given
    final int[] stones = {2, 7, 4, 1, 8, 1};

    // when
    final int result = solution.lastStoneWeight(stones);

    // then
    assertEquals(1, result);
  }

  @Test
  void lastStoneWeight_example2() {
    // given
    final int[] stones = {1};

    // when
    final int result = solution.lastStoneWeight(stones);

    // then
    assertEquals(1, result);
  }
}