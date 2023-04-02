package com.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * It is a half of DFS and half of Kahn Algorithm.
 * Unlike in DFS solution we're not looking for Cycle, we just count how many courses we can reach
 * without cycle :).
 * So we don't use statuses of visited courses - just regular True/False
 */
public class CourseSchedule_207_OptimizedKahnAlgorithm implements CourseSchedule_207 {

  @Override
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    // [start] graph creation
    final List<List<Integer>> adj = new ArrayList<>(numCourses);
    for (int course = 0; course < numCourses; course++) {
      adj.add(new ArrayList<>());
    }

    int[] inDegree = new int[numCourses];
    for (int[] prerequisite : prerequisites) {
      int destination = prerequisite[0];
      int source = prerequisite[1];
      inDegree[destination]++; // Optimization#1: using the same loop to compute in-degree.
      adj.get(source).add(destination);
    }
    // [end] graph creation

    // Optimization#2:
    // Instead of using Queue we can use combination of `visitedCourses` + `remainingCourses`
    // and use just 1 loop with `dfs` logic
    final boolean[] visitedCourses = new boolean[numCourses];
    int remainingCourses = numCourses;
    for (int course = 0; course < numCourses; course++) {
      if (inDegree[course] == 0 && !visitedCourses[course]) {
        remainingCourses = dfs(inDegree, adj, visitedCourses, course, remainingCourses);
      }
    }

    return remainingCourses == 0;
  }

  public int dfs(
      final int[] inDegree,
      final List<List<Integer>> adj,
      final boolean[] visitedCourses,
      final int course,
      int remainingCourses
  ) {
    visitedCourses[course] = true;
    remainingCourses--;

    for (int childCourse : adj.get(course)) {
      inDegree[childCourse]--;
      if (inDegree[childCourse] == 0) {
        remainingCourses = dfs(inDegree, adj, visitedCourses, childCourse, remainingCourses);
      }
    }

    return remainingCourses;
  }
}
