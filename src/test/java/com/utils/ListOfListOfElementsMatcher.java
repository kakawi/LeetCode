package com.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.List;
import org.hamcrest.Matcher;

public class ListOfListOfElementsMatcher {

  public static <T> void checkResult(final List<List<T>> expected, final List<List<T>> result) {
    final Matcher[] matchers = new Matcher[expected.size()];
    int i = 0;
    for (final List<T> option : expected) {
      matchers[i++] = containsInAnyOrder(option.toArray());
    }
    assertThat(result, containsInAnyOrder(matchers));
  }
}
