package com.leetcode.prefixsum.medium;

/**
 * Because Trucks can not move simultaneously our goal is to find the last houses that every truck should visit
 * Picking the trash is identical for any truck
 */
public class MinimumAmountOfTimeToCollectGarbage_2391_Impl implements MinimumAmountOfTimeToCollectGarbage_2391 {

  @Override
  public int garbageCollection(final String[] garbage, final int[] travel) {
    int result = garbage[0].length(); // Our loop does not check the 1st House
    for (int i = 1; i < travel.length; i++) {
      travel[i] += travel[i - 1];
    }

    // Binary logic
    // 111 - all houses
    int foundAllLastHouses = 0;

    for (int i = garbage.length - 1; i > 0; i--) {
      final String currentHouse = garbage[i];
      result += currentHouse.length();
      if ((foundAllLastHouses & 7) != 7) {
        for (final char c : currentHouse.toCharArray()) {
          switch (c) {
            case 'M':
              if ((foundAllLastHouses & 1) != 1) {
                result += travel[i - 1];
                foundAllLastHouses = foundAllLastHouses | 1;
              }
              break;
            case 'P':
              if ((foundAllLastHouses & 2) != 2) {
                result += travel[i - 1];
                foundAllLastHouses = foundAllLastHouses | 2;
              }
               break;
            case 'G':
              if ((foundAllLastHouses & 4) != 4) {
                result += travel[i - 1];
                foundAllLastHouses = foundAllLastHouses | 4;
              }
              break;
          }
        }
      }
    }

    return result;
  }
}
