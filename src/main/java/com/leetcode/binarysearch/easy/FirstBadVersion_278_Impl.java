package com.leetcode.binarysearch.easy;

public abstract class FirstBadVersion_278_Impl implements FirstBadVersion_278 {

  @Override
  public int firstBadVersion(int n) {
    int left = 0;
    int right = n;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}
