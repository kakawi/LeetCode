package com.leetcode.binarysearch.easy;

public abstract class FirstBadVersion_278_Impl implements FirstBadVersion_278 {

  @Override
  public int firstBadVersion(int n) {
    int leftBorder = 0;
    int rightBorder = n;

    while (leftBorder < rightBorder) {
      int mid = leftBorder + (rightBorder - leftBorder) / 2;
      if (isBadVersion(mid)) {
        rightBorder = mid;
      } else {
        leftBorder = mid + 1;
      }
    }
    return leftBorder;
  }
}
