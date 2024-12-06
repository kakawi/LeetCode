package com.leetcode.heap.medium;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Min Heap
 * Time: O(k*log n)
 * Space: O(n)
 */
public class KClosestPointsToOrigin_973_Impl implements KClosestPointsToOrigin_973 {

  public int[][] kClosest(int[][] points, int k) {
    Comparator<int[]> comparator = Comparator.comparingInt((point) -> {
      return point[0] * point[0] + point[1] * point[1];
    });

    Queue<int[]> queue = new PriorityQueue<>(comparator);
    for (int[] point : points) {
      queue.add(point);
    }

    int[][] result = new int[k][2];
    for (int i = 0; i < k; i++) {
      result[i] = queue.poll();
    }
    return result;
  }
}
