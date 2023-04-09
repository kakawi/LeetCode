package com.leetcode.unionfind.medium;

public class NumberOfProvinces_547_Impl implements NumberOfProvinces_547 {

  @Override
  public int findCircleNum(final int[][] isConnected) {
    int totalNumberOfProvinces = 0;

    // 1. Every city can be a root of a province
    // 2. Every city is directly connected with itself
    for (int i = 0; i < isConnected.length; i++) {
      if (isConnected[i][i] == 1) {
        totalNumberOfProvinces++;
        clearProvince(isConnected, i);
      }
    }

    return totalNumberOfProvinces;
  }

  private static void clearProvince(final int[][] isConnected, final int cityIndex) {
    int[] edges = isConnected[cityIndex];
    if (edges[cityIndex] == 1) { // anti loop check
      edges[cityIndex] = 0;
      for (int j = 0; j < edges.length; j++) {
        if (edges[j] == 1) {
          edges[j] = 0;
          clearProvince(isConnected, j);
        }
      }
    }
  }
}
