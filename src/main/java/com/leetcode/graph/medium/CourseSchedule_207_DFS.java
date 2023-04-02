package com.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule_207_DFS implements CourseSchedule_207 {

  private static final int NEVER_VISITED = 0;
  private static final int VISITING_NOW = 1;
  private static final int ALREADY_VISITED = 2;

  @Override
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    final List<List<Integer>> courses = createGraph(numCourses, prerequisites);
    int[] visited = new int[numCourses];

    // dfs visit each course
    for (int course = 0; course < numCourses; course++) {
      if (visited[course] == ALREADY_VISITED) continue;
      if (!visitCourse(course, courses, visited)) {
        return false;
      }
    }

    return true;
  }

  private static List<List<Integer>> createGraph(final int numCourses, final int[][] prerequisites) {
    // create the array lists to represent the courses
    final List<List<Integer>> courses = new ArrayList<>(numCourses);
    // we have to use the loop to fill in Arrays, because `get` method throws OutOfBoundException
    for (int i = 0; i < numCourses; i++) {
      courses.add(new ArrayList<>());
    }
    // create the dependency graph
    for (final int[] prerequisite : prerequisites) {
      courses.get(prerequisite[1]).add(prerequisite[0]);
    }
    return courses;
  }

  private static boolean visitCourse(int course, List<List<Integer>> courses, int[] visited) {
    visited[course] = VISITING_NOW; // mark it being visited

    final List<Integer> eligibleCourses = courses.get(course); // get its children

    // dfs its children
    for (int eligibleCourse : eligibleCourses) {
      if (visited[eligibleCourse] == VISITING_NOW) {
        return false; // has been visited while visiting its children - cycle !!!!
      }
      if (visited[eligibleCourse] == NEVER_VISITED) {
        if (!visitCourse(eligibleCourse, courses, visited)) {
          return false;
        }
      }
    }

    visited[course] = ALREADY_VISITED;

    return true;
  }
}
