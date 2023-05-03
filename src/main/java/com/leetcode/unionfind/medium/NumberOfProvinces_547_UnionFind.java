package com.leetcode.unionfind.medium;

import java.util.HashMap;
import java.util.Map;

public class NumberOfProvinces_547_UnionFind implements NumberOfProvinces_547 {
  @Override
  public int findCircleNum(int[][] isConnected) {
    UnionFind uf = new UnionFind();
    uf.makeSet(isConnected.length);

    for (int city = 0; city < isConnected.length; city++) {
      for (int connectedCity = 0; connectedCity < isConnected[city].length; connectedCity++) {
        if (isConnected[city][connectedCity] == 1) {
          uf.union(city, connectedCity);
        }
      }
    }

    return uf.getNumberOfDisjoints();
  }


  private static class UnionFind {
    // <city, parent>
    private final Map<Integer, Integer> parents = new HashMap<>();
    private int numberOfDisjoints = 0;

    /**
     * Initialize UnionFind
     */
    public void makeSet(int numberOfCities) {
      for (int i = 0; i < numberOfCities; i++) {
        parents.put(i, i);
        numberOfDisjoints++;
      }
    }

    public int find(int city) {
      if (parents.get(city) != city) {
        parents.put(city, find(parents.get(city)));
      }

      return parents.get(city);
    }

    public void union(int source, int target) {
      int x = find(source);
      int y = find(target);

      if (x == y) return;
      numberOfDisjoints--; // we're merging so the number of provinces will be less

      parents.put(x, y);
    }


    public int getNumberOfDisjoints() {
      return numberOfDisjoints;
    }
  }
}
