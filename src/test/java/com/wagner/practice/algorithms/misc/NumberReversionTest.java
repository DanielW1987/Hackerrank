package com.wagner.practice.algorithms.misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: DanielW
 * Date: 08.04.2019
 * Time: 10:19
 */
class NumberReversionTest {

  @ParameterizedTest
  @MethodSource(value = "reverseValueProvider")
  void testReverse(long expected, long actual) {
    assertEquals(expected, NumberReversion.reverse(actual));
  }

  static Stream<Arguments> reverseValueProvider() {
    return Stream.of(
      Arguments.of(4321, 1234),
      Arguments.of(5, 5),
      Arguments.of(0, 0),
      Arguments.of(-5, -5),
      Arguments.of(-1, -10),
      Arguments.of(-987654, -456789),
      Arguments.of(9870654, 4560789),
      Arguments.of(4321, 1234),
      Arguments.of(4321, 123400)
    );
  }
}