package com.leetcode.binarysearch.easy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

class FirstBadVersion_278Test {

  private final FirstBadVersion_278 solution = mock(FirstBadVersion_278_Impl.class, Mockito.CALLS_REAL_METHODS);

  @Test
  void firstBadVersion_example1() {
    // given
    final int n = 5;
    final int badVersion = 4;
    when(solution.isBadVersion(intThat(createBadVersionMatcher(badVersion)))).thenReturn(true);

    // when
    final int result = solution.firstBadVersion(n);

    // then
    assertEquals(badVersion, result);
  }

  @Test
  void firstBadVersion_example2() {
    // given
    final int n = 1;
    final int badVersion = 1;
    when(solution.isBadVersion(intThat(createBadVersionMatcher(badVersion)))).thenReturn(true);

    // when
    final int result = solution.firstBadVersion(n);

    // then
    assertEquals(badVersion, result);
  }

  @Test
  void firstBadVersion_example3() {
    // given
    final int n = 2126753390;
    final int badVersion = 1702766719;
    when(solution.isBadVersion(intThat(createBadVersionMatcher(badVersion)))).thenReturn(true);

    // when
    final int result = solution.firstBadVersion(n);

    // then
    assertEquals(badVersion, result);
  }

  private ArgumentMatcher<Integer> createBadVersionMatcher(final int badVersion) {
    return argument -> argument >= badVersion;
  }
}
