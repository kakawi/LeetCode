package com.hlebon.moneipoint;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

  @Test
  void balancedSum() {
    List<Integer> arr = List.of(1, 2, 3, 4, 6);
    int result = FindPivotIndex.balancedSum(arr);
    assertEquals(3, result);
  }
}
