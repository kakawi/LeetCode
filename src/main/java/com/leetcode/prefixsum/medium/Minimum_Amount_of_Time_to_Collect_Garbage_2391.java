package com.leetcode.prefixsum.medium;

/**
 * #1 The fastest
 * - Look from behind
 * - increase multiplier (till 3) when stumbled upon a new Garbage type
 * P.S. extracting into method and using instance variables are increasing Space usage
 * #2 more readable
 * - forward loop where you use sum travels (sumTravels)
 * - and store the last index with the garbage
 *
 */
public class Minimum_Amount_of_Time_to_Collect_Garbage_2391 {

  public static void main(String[] args) {
    final Minimum_Amount_of_Time_to_Collect_Garbage_2391 minimumAmountOfTimeToCollectGarbage2391 = new Minimum_Amount_of_Time_to_Collect_Garbage_2391();
//    minimumAmountOfTimeToCollectGarbage2391.garbageCollection2(
//        new String[]{"MMM", "PGM", "GP"},
//        new int[]{3, 10}
//    );
    minimumAmountOfTimeToCollectGarbage2391.garbageCollection2(
        new String[]{"G","P","GP","GG"},
        new int[]{2, 4, 3}
    );
  }

  /**
   * Time: O(n)
   * Space: ~
   */
  public int garbageCollection(String[] garbage, int[] travel) {
    int metalTruck = 0;
    int glassTruck = 0;
    int paperTruck = 0;

    final char[] chars2 = garbage[garbage.length - 1].toCharArray();
    for (final char currentChar : chars2) {
      switch (currentChar) {
        case 'P':
          paperTruck = 1;
          break;
        case 'G':
          glassTruck = 1;
          break;
        case 'M':
          metalTruck = 1;
          break;
      }
    }
    int multiplier = paperTruck + glassTruck + metalTruck;
    int pickingGarbage = chars2.length;

    int moving = 0;
    for (int i = garbage.length - 2; i >= 0; i--) {
      moving += travel[i] * multiplier;
      final String currentHouse = garbage[i];
      if (multiplier < 3) {
        final char[] chars = currentHouse.toCharArray();
        for (final char currentChar : chars) {
          switch (currentChar) {
            case 'P':
              paperTruck = 1;
              break;
            case 'G':
              glassTruck = 1;
              break;
            case 'M':
              metalTruck = 1;
              break;
          }
        }
        multiplier = paperTruck + metalTruck + glassTruck;
      }
      pickingGarbage += currentHouse.length();

    }

    return moving + pickingGarbage;
  }


  /**
   * Time: >O(2n)
   * Space: O(2n)
   */
  public int garbageCollection2(String[] garbage, int[] travel) {
    int metalTruck = -1;
    int glassTruck = -1;
    int paperTruck = -1;
    int pickingUpTime = garbage[0].length();

    int prevSum = 0;
    for (int i = 0; i < travel.length; i++) {
      travel[i] = prevSum + travel[i];
      prevSum = travel[i];

      final String currentHouse = garbage[i + 1];
      pickingUpTime += currentHouse.length();
      if (currentHouse.indexOf('P') != -1) {
        paperTruck = i;
      }
      if (currentHouse.indexOf('M') != -1) {
        metalTruck = i;
      }
      if (currentHouse.indexOf('G') != -1) {
        glassTruck = i;
      }
    }

    if (metalTruck != -1) {
      pickingUpTime += travel[metalTruck];
    }
    if (paperTruck != -1) {
      pickingUpTime += travel[paperTruck];
    }
    if (glassTruck != -1) {
      pickingUpTime += travel[glassTruck];
    }
    return pickingUpTime;
  }

}
