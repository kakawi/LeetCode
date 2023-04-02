package com.leetcode.graph.hard;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BusRoutes_815_Impl implements BusRoutes_815 {

  @Override
  public int numBusesToDestination(int[][] routes, int source, int target) {
    if (source == target) {
      return 0;
    }

    final Set<Integer> visited = new HashSet<>();
    final Queue<Integer> queue = new ArrayDeque<>();
    final Map<Integer, List<Integer>> map = new HashMap<>();
    int result = 0;

    for (int i = 0; i < routes.length; i++) {
      for (int j = 0; j < routes[i].length; j++) {
        map.putIfAbsent(routes[i][j], new ArrayList<>());
        map.get(routes[i][j]).add(i);
      }
    }

    queue.offer(source);
    while (!queue.isEmpty()) {
      final int level = queue.size();
      result++;
      for (int i = 0; i < level; i++) {
        int busStop = queue.poll();
        final List<Integer> buses = map.get(busStop);
        for (int bus : buses) {
          if (visited.contains(bus)) {
            continue;
          }
          visited.add(bus);
          for (final int routeStop : routes[bus]) {
            if (routeStop == target) {
              return result;
            }
            queue.add(routeStop);
          }
        }
      }
    }

    return -1;
  }
}
