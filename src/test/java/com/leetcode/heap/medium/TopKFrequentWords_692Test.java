package com.leetcode.heap.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TopKFrequentWords_692Test {

  private final TopKFrequentWords_692 solution = new TopKFrequentWords_692_Base();

  @Test
  void topKFrequent_example1() {
    // given
    final String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
    final int k = 2;

    // expected
    final List<String> expected = List.of("i", "love");

    // when
    final List<String> result = solution.topKFrequent(words, k);

    // then
    assertEquals(expected, result);
  }

  @Test
  void topKFrequent_example2() {
    // given
    final String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
    final int k = 4;

    // expected
    final List<String> expected = List.of("the", "is", "sunny", "day");

    // when
    final List<String> result = solution.topKFrequent(words, k);

    // then
    assertEquals(expected, result);
  }
}