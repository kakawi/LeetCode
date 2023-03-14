package com.leetcode.heap.easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight_1046_Impl implements LastStoneWeight_1046 {

  @Override
  public int lastStoneWeight(final int[] stones) {
    // Initialize Priority Queue as Max Heap (first element is always the biggest)
    final Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    // Fill the Queue
    for (final int stone : stones) {
      queue.add(stone);
    }
    // if 0 or 1 stone left this is the end of the loop
    while (queue.size() > 1) {
      final int first = queue.poll();
      final int second = queue.poll();
      if (first != second) {
        queue.add(first - second);
      }
    }
    if (queue.isEmpty()) {
      return 0;
    }
    return queue.poll();
  }
}
