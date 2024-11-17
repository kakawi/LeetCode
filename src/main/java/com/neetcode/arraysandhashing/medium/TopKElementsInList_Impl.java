package com.neetcode.arraysandhashing.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElementsInList_Impl implements TopKElementsInList {

  @Override
  public int[] topKFrequent(int[] nums, int k) {
    // index: frequency, value: List of numbers
    List<Integer>[] frequencyResults = new List[nums.length];
    for (int i = 0; i < frequencyResults.length; i++) {
      frequencyResults[i] = new ArrayList<>();
    }

    // <number, frequency>
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int number : nums) {
      frequencyMap.merge(number, 0, (oldValue, newValue) -> oldValue + 1);
    }

    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      int frequency = entry.getValue();
      frequencyResults[frequency].add(entry.getKey());
    }

    int[] result = new int[k];
    int index = 0;
    for (int i = frequencyResults.length - 1; i >= 0; i--) {
      if (frequencyResults[i].isEmpty()) {
        continue;
      }
      for (int n : frequencyResults[i]) {
        result[index++] = n;
        if (index == k) {
          return result;
        }
      }
    }
    return result;
  }
}
