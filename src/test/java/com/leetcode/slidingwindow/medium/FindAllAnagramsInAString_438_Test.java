package com.leetcode.slidingwindow.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.slidingwindow.medium.FindAllAnagramsInAString_438;
import com.leetcode.slidingwindow.medium.FindAllAnagramsInAString_438_Base;
import java.util.List;
import org.junit.jupiter.api.Test;

class FindAllAnagramsInAString_438_Test {

  private final FindAllAnagramsInAString_438 solution = new FindAllAnagramsInAString_438_Base();

  @Test
  void findAnagrams_example1() {
    // given
    final String s = "cbaebabacd";
    final String p = "abc";

    // expected
    final List<Integer> expected = List.of(0, 6);

    // when
    final List<Integer> result = solution.findAnagrams(s, p);

    // then
    assertEquals(expected, result);
  }

  @Test
  void findAnagrams_example2() {
    // given
    final String s = "abab";
    final String p = "ab";

    // expected
    final List<Integer> expected = List.of(0, 1, 2);

    // when
    final List<Integer> result = solution.findAnagrams(s, p);

    // then
    assertEquals(expected, result);
  }
}
