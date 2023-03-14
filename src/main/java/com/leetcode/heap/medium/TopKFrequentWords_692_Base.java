package com.leetcode.heap.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentWords_692_Base implements TopKFrequentWords_692 {

  @Override
  public List<String> topKFrequent(final String[] words, final int k) {
    // calculate how frequent a word is
    final Map<String, Integer> wordCounter = new HashMap<>();
    for (final String word : words) {
      wordCounter.merge(word, 1, Integer::sum);
    }

    // Comparator for Priority Queue
    // 1. Comparing the value (frequency) in rever order
    // 2. If frequency is the same then compare the key (lexicographical order)
    final Comparator<Map.Entry<String, Integer>> comparator =
        Map.Entry
        .<String, Integer>comparingByValue()
        .reversed()
        .thenComparing(Map.Entry.comparingByKey());

    Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(comparator);

    // Fill the Priority queue
    queue.addAll(wordCounter.entrySet());

    // Extract as much first elements as required
    final List<String> result = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      result.add(queue.poll().getKey());
    }

    return result;
  }
}
