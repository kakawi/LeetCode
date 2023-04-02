package com.leetcode.graph.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII_210_Kahn implements CourseScheduleII_210 {

  @Override
  public int[] findOrder(final int numCourses, final int[][] prerequisites) {
    if (numCourses == 1) {
      return new int[]{0};
    }
    final int[] inDegree = new int[numCourses];
    final List<List<Integer>> courses = initializeGraph(numCourses, prerequisites, inDegree);

    final Queue<Integer> queue = initializeQueue(courses, inDegree);

    final int[] order = new int[numCourses];
    int visitedCourses = 0;
    while (!queue.isEmpty()) {
      final int course = queue.poll();
      for (final Integer childCourse : courses.get(course)) {
        inDegree[childCourse]--;
        if (inDegree[childCourse] == 0) {
          queue.add(childCourse);
        }
      }
      order[visitedCourses] = course;
      visitedCourses++;
    }
    if (visitedCourses == numCourses) return order;
    return new int[]{};
  }

  private Queue<Integer> initializeQueue(
      final List<List<Integer>> courses,
      final int[] inDegree
  ) {
    final Queue<Integer> queue = new ArrayDeque<>();
    for (int course = 0; course < courses.size(); course++) {
      if (inDegree[course] == 0) {
        queue.add(course);
      }
    }
    return queue;
  }

  private List<List<Integer>> initializeGraph(
      final int numCourses,
      final int[][] prerequisites,
      final int[] inDegree
  ) {
    final List<List<Integer>> adj = new ArrayList<>();

    for (int i = 0; i < numCourses; i++) {
      adj.add(new ArrayList<>());
    }

    for (final int[] prerequisite : prerequisites) {
      inDegree[prerequisite[0]]++;
      adj.get(prerequisite[1]).add(prerequisite[0]);
    }

    return adj;
  }
}
