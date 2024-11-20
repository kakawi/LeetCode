package com.neetcode.arraysandhashing.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class EncodeAndDecodeStringsTest {
  private final EncodeAndDecodeStrings solution = new EncodeAndDecodeStrings_Impl();

  @Test
  public void example1() {
    // given
    List<String> input = List.of("neet", "code", "love", "you");

    // when
    String decodedStr = solution.encode(input);
    List<String> result = solution.decode(decodedStr);

    // then
    assertEquals(input, result);
  }

  @Test
  public void example2() {
    // given
    List<String> input = List.of("");

    // when
    String decodedStr = solution.encode(input);
    List<String> result = solution.decode(decodedStr);

    // then
    assertEquals(input, result);
  }
}
