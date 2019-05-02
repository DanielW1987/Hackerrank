package com.wagner.hackerrank.practice.algorithms.misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: DanielW
 * Date: 02.05.2019
 * Time: 08:27
 */
class AnagramCheckerTest {

  @ParameterizedTest
  @MethodSource(value = "isAnagramProvider")
  void isAnagram(String word1, String word2, boolean expected) {
    assertThat(AnagramChecker.isAnagram(word1, word2)).isEqualTo(expected);
  }

  static Stream<Arguments> isAnagramProvider() {
    return Stream.of(
      Arguments.of("silent", "listen", true),
      Arguments.of("listen", "enlist", true),
      Arguments.of("SiLenT", "lIstEN", true),
      Arguments.of("Placebo", "obecalp", true),
      Arguments.of("funeral", "real fun", true),
      Arguments.of("$f-u!n123e,r.a/l&", "real fun", true),
      Arguments.of("roast beef", "eat for BSE", true),
      Arguments.of("silent night", "listen to me", false),
      Arguments.of("NoAnagram", "ReallyNoAnagram", false)
    );
  }


}