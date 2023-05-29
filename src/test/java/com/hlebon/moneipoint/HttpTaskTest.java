package com.hlebon.moneipoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpTaskTest {

  HttpTask httpTask = new HttpTask();

  @Test
  void getDiscountedPrice_example1() {
    int barcode = 74002314;
    int result = HttpTask.getDiscountedPrice(barcode);
    assertEquals(2964, result);
  }

  @Test
  void getDiscountedPrice_example2() {
    int barcode = 74001777;
    int result = HttpTask.getDiscountedPrice(barcode);
    assertEquals(3931, result);
  }
}
