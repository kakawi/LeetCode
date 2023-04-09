package com.leetcode.unionfind.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostStonesRemovedWithSameRowOrColumn_947_Impl implements MostStonesRemovedWithSameRowOrColumn_947 {

  int dfsNodeCount = 0;

  @Override
  public int removeStones(final int[][] stones) {
    final Node[] nodes = new Node[stones.length];
    final Map<Integer, List<Node>> rowMap = new HashMap<>();
    final Map<Integer, List<Node>> colMap = new HashMap<>();
    int nodeId = 0;
    for (int[] stone : stones) {
      final int row = stone[0];
      final int col = stone[1];
      final Node node = new Node(nodeId);
      nodes[nodeId++] = node;
      rowMap.putIfAbsent(row, new ArrayList<>());
      colMap.putIfAbsent(col, new ArrayList<>());
      if (rowMap.get(row).isEmpty()) {
        rowMap.get(row).add(node);
      } else {
        final Node prevNode = rowMap.get(row).get(rowMap.get(row).size() - 1);
        prevNode.addNeighbor(node);
        node.addNeighbor(prevNode);
        rowMap.get(row).add(node);
      }
      if (colMap.get(col).isEmpty()) {
        colMap.get(col).add(node);
      } else {
        Node prevNode = colMap.get(col).get(colMap.get(col).size() - 1);
        prevNode.addNeighbor(node);
        node.addNeighbor(prevNode);
        colMap.get(col).add(node);
      }

    }
    int result = 0;
    int[] visited = new int[nodes.length];
    for (int i = 0; i < nodes.length; i++) {
      if (visited[i] == 1) {
        continue;
      }
      dfs(nodes[i], visited);
      result += (dfsNodeCount - 1);
      dfsNodeCount = 0;
    }
    return result;
  }

  public void dfs(Node node, int[] visited) {
    if (visited[node.id] == 1) {
      return;
    }
    dfsNodeCount++;
    visited[node.id] = 1;
    for (Node neighbor : node.neighbors) {
      if (visited[neighbor.id] == 1) {
        continue;
      }
      dfs(neighbor, visited);
    }
  }

  private static class Node {

    int id;
    ArrayList<Node> neighbors;

    public Node(int id) {
      this.id = id;
      this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node node) {
      this.neighbors.add(node);
    }
  }
}
