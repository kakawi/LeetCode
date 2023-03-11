package com.leetcode.prefixsum.medium;

import java.util.HashMap;

/**
 * Ref: https://leetcode.com/problems/continuous-subarray-sum/solutions/2744764/full-explanation-intuition-explained-easy-to-understand/
 * 1. Мы делаем prefix sum и получаем из них remainder
 * 2. Кладем remainder в Map, где key - remainder, value - index
 * 3. В процессе итерации смотрим в map, если key есть и value 2 или больше, то мы нашли subarray
 * Идея: идея в том, что в map находятся index остатков от деления, и мы идя вперед по массиву не хотим пропустить момент, когда надо обрубить массив слева, который даст нам multiplier
 */
public class Continuous_Subarray_Sum_523 {

  public static void main(String[] args) {
    final Continuous_Subarray_Sum_523 continuousSubarraySum523 = new Continuous_Subarray_Sum_523();
    continuousSubarraySum523.checkSubarraySum(new int[]{9, 1, 1, 2, 2}, 6);
//    continuousSubarraySum523.checkSubarraySum(new int[]{23, 22, 2}, 6);
//    continuousSubarraySum523.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6);
  }

  public boolean checkSubarraySum(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 0);
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      final int key = sum % k;
      System.out.println(key);
      if (!map.containsKey(key)) {
        map.put(sum % k, i + 1);
      } else {
        if (map.get(sum % k) < i) {
          return true;
        }
      }
    }

    return false;
  }

}
