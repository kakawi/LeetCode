package com.leetcode.graph.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Ref: https://www.geeksforgeeks.org/topological-sorting-indegree-based-solution/
 */
public class CourseSchedule_207_KahnAlgorithm implements CourseSchedule_207 {

  @Override
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    final List<Integer>[] courses = createGraph(numCourses, prerequisites);
    final int[] inDegree = computeInDegree(numCourses, courses);
    final Queue<Integer> queue = initializeQueue(numCourses, inDegree);
    final int visitedCourses = visitAllCourses(courses, inDegree, queue);

    return visitedCourses == numCourses;
  }

  private static List<Integer>[] createGraph(final int numCourses, final int[][] prerequisites) {
    final List<Integer>[] adj = new List[numCourses];

    for (int i = 0; i < numCourses; i++) {
      adj[i] = new ArrayList<>();
    }
    for (final int[] prerequisite : prerequisites) {
      adj[prerequisite[1]].add(prerequisite[0]);
    }

    return adj;
  }

  private static int[] computeInDegree(final int numCourses, final List<Integer>[] courses) {
    final int[] inDegree = new int[numCourses];
    for (int course = 0; course < numCourses; course++) {
      for (int childCourse : courses[course]) {
        inDegree[childCourse]++;
      }
    }
    return inDegree;
  }

  private static Queue<Integer> initializeQueue(final int numCourses, final int[] inDegree) {
    final Queue<Integer> queue = new ArrayDeque<>();
    for (int course = 0; course < numCourses; course++) {
      if (inDegree[course] == 0) {
        queue.add(course);
      }
    }

    return queue;
  }

  private static int visitAllCourses(
      final List<Integer>[] courses,
      final int[] inDegree,
      final Queue<Integer> queue
  ) {
    int visitedCourses = 0;
    while (!queue.isEmpty()) {
      int course = queue.poll();

      for (int childCourse : courses[course]) {
        inDegree[childCourse]--;
        if (inDegree[childCourse] == 0) {
          queue.add(childCourse);
        }
      }

      visitedCourses++;
    }

    return visitedCourses;
  }
}
