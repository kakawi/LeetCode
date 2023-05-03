package com.leetcode.graph.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.graph.GraphTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CourseScheduleII_210Test {

  private final CourseScheduleII_210 solution = new CourseScheduleII_210_Kahn();

  @Test
  void findOrder_example1() {
    // given
    final int numCourses = 2;
    final int[][] prerequisites = {{1, 0}};

    // expected
    final int[] expected = new int[]{0, 1};

    // when
    final int[] result = solution.findOrder(numCourses, prerequisites);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void findOrder_example2() {
    // given
    final int numCourses = 4;
    final int[][] prerequisites = {
        {1, 0},
        {2, 0},
        {3, 1},
        {3, 2}
    };

    // expected
    final GraphTest expectedGraph = new GraphTest(numCourses);
    expectedGraph.addPrerequisites(prerequisites);
    final List<int[]> possibleExpected = expectedGraph.allTopologicalSorts();

    // when
    final int[] result = solution.findOrder(numCourses, prerequisites);

    // then
    assertTrue(GraphTest.assertTopologicalSort(possibleExpected, result));
  }

  @Test
  void findOrder_example3() {
    // given
    final int numCourses = 1;
    final int[][] prerequisites = {};

    // expected
    final int[] expected = new int[]{0};

    // when
    final int[] result = solution.findOrder(numCourses, prerequisites);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void findOrder_example4() {
    // given
    final int numCourses = 2;
    final int[][] prerequisites = {{0, 1}, {1, 0}};

    // expected
    final int[] expected = new int[]{};

    // when
    final int[] result = solution.findOrder(numCourses, prerequisites);

    // then
    assertArrayEquals(expected, result);
  }
}
