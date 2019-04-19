package com.wagner.hackerrank.practice.algorithms.misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: DanielW
 * Date: 08.04.2019
 * Time: 09:49
 */
class PalindromeTest {

  @ParameterizedTest
  @MethodSource(value = "palindromeCheckValueProvider")
  void testCheck(String value, boolean expected) {
    assertEquals(expected, Palindrome.check(value));
  }

  static Stream<Arguments> palindromeCheckValueProvider() {
    return Stream.of(
      Arguments.of("Rentner", true),
      Arguments.of("Renttner", true),
      Arguments.of("Rentavtner", false),
      Arguments.of("Anna", true),
      Arguments.of("mAdAM", true),
      Arguments.of("racecar", true),
      Arguments.of("able was I ere I saw elba", true),
      Arguments.of("mAdAM", true),
      Arguments.of("  Lagerregal   ", true),
      Arguments.of("Hallo", false),
      Arguments.of("Welt", false),
      Arguments.of("", false),
      Arguments.of(null, false)
    );
  }

}