package com.hlebon.fortinet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

  @Test
  void getWhiteLightLength() {
    // given
    int n = 5;
    final List<List<Integer>> lights = List.of(List.of(1, 1, 3), List.of(2, 2, 4), List.of(3, 3, 5));
    int m = lights.size();

    // when
    int result = Task2.getWhiteLightLength(n, m, lights);

    // then
    assertEquals(1, result);
  }
}
