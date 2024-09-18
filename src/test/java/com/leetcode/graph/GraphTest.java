package com.leetcode.graph;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GraphTest {

  private final int numberOfVertices; // No. of vertices

  private final List<Integer>[] adjListArray;
  private final List<int[]> allTopologicalSorts = new ArrayList<>();

  public GraphTest(int numberOfVertices) {

    this.numberOfVertices = numberOfVertices;

    List<Integer> adjListArray[] = new LinkedList[numberOfVertices];

    this.adjListArray = adjListArray;

    for (int i = 0; i < numberOfVertices; i++) {
      adjListArray[i] = new LinkedList<>();
    }
  }

  // Utility function to add edge
  public void addEdge(int src, int dest) {
    this.adjListArray[src].add(dest);
  }

  public void addPrerequisites(final int[][] prerequisites) {
    for (final int[] prerequisite : prerequisites) {
      adjListArray[prerequisite[1]].add(prerequisite[0]);
    }
  }

  // Main recursive function to print all possible
  // topological sorts
  private void allTopologicalSortsUtil(
      final boolean[] visited,
      final int[] inDegree,
      final Stack<Integer> stack
  ) {
    // To indicate whether all topological are found
    // or not
    boolean flag = false;

    for (int vertice = 0; vertice < this.numberOfVertices; vertice++) {
      // If inDegree is 0 and not yet visited then
      // only choose that vertex
      if (!visited[vertice] && inDegree[vertice] == 0) {

        // including in result
        visited[vertice] = true;
        stack.add(vertice);
        for (int adjacent : this.adjListArray[vertice]) {
          inDegree[adjacent]--;
        }
        allTopologicalSortsUtil(visited, inDegree, stack);

        // resetting visited, res and inDegree for
        // backtracking
        visited[vertice] = false;
        stack.pop();
        for (int adjacent : this.adjListArray[vertice]) {
          inDegree[adjacent]++;
        }

        flag = true;
      }
    }
    // We reach here if all vertices are visited.
    // So we print the solution here
    if (!flag) {
      final int[] solution = stack.stream().mapToInt(Integer::intValue).toArray();
      allTopologicalSorts.add(solution);
    }
  }

  // The function does all Topological Sort.
  // It uses recursive alltopologicalSortUtil()
  public List<int[]> allTopologicalSorts() {
    // Mark all the vertices as not visited
    boolean[] visited = new boolean[this.numberOfVertices];

    int[] inDegree = new int[this.numberOfVertices];

    for (int i = 0; i < this.numberOfVertices; i++) {

      for (int var : this.adjListArray[i]) {
        inDegree[var]++;
      }
    }

    final Stack<Integer> stack = new Stack<>();

    allTopologicalSortsUtil(visited, inDegree, stack);

    return allTopologicalSorts;
  }

  public static boolean assertTopologicalSort(final List<int[]> possibleSorts, final int[] actual) {
    for (final int[] possibleSort : possibleSorts) {
      try {
        assertArrayEquals(possibleSort, actual);
        return true;
      } catch (Throwable e) {
        // ignore
      }
    }
    return false;
  }
}
