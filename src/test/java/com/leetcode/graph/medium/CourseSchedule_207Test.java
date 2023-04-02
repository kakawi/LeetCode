package com.leetcode.graph.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CourseSchedule_207Test {

  private final CourseSchedule_207 solution = new CourseSchedule_207_DFS();

  @Test
  void canFinish_example1() {
    // given
    final int numCourses = 2;
    final int[][] prerequisites = {{1, 0}};

    // when
    final boolean result = solution.canFinish(numCourses, prerequisites);

    // then
    assertTrue(result);
  }

  @Test
  void canFinish_example2() {
    // given
    final int numCourses = 2;
    final int[][] prerequisites = {{1, 0}, {0, 1}};

    // when
    final boolean result = solution.canFinish(numCourses, prerequisites);

    // then
    assertFalse(result);
  }
}
